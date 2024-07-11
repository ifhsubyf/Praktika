import java.util.Scanner;

/* Шарыгина Надежда Б763-2
вариант А
1. В каждом слове текста k-ю букву заменить заданным символом. Если
k больше длины слова, корректировку не выполнять.*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите текст для замены букв: ");
        String text = scanner.nextLine();
        System.out.println("введите число - позицию: ");
        int k = scanner.nextInt();
        System.out.println("введите символ для замены: ");
        char symbol = scanner.next().charAt(0);
        String result = new String (Text.func(text, k, symbol));
        System.out.println(result);
    }
}
