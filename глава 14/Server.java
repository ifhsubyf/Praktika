import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.*;

public class Server {
    private static final int PORT = 12345;
    private static List<ClientHandler> clients = new ArrayList<>();
    private static ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Сервер запущен. Ждем клиентов...");

            scheduler.scheduleAtFixedRate(Server::broadcastTime, 0, 5, TimeUnit.SECONDS);

            while (true) {
                Socket socket = serverSocket.accept();
                ClientHandler clientHandler = new ClientHandler(socket);
                clients.add(clientHandler);
                new Thread(clientHandler).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void broadcastTime() {
        String message = "Текущее время: " + new Date();
        clients.forEach(client -> client.sendMessage(message));
    }

    static class ClientHandler implements Runnable {
        private Socket socket;
        private PrintWriter out;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    System.out.println("Получено от клиента: " + inputLine);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void sendMessage(String message) {
            if (out != null) {
                out.println(message);
            }
        }
    }
}