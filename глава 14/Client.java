import java.io.*;
import java.net.*;

public class Client {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 12345;

    public static void main(String[] args) {
        try (Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Подключился к серверу.");

            new Thread(() -> {
                try {
                    String serverMessage;
                    while ((serverMessage = in.readLine()) != null) {
                        System.out.println("Сообщение от сервера: " + serverMessage);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();

            String userInput;
            while ((userInput = stdIn.readLine()) != null) {
                out.println(userInput);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}