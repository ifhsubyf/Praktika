import java.util.Scanner;

//Шарыгина Надежда Б763-2
//вариант В
//3. Числа, которые делятся на 3 или на 9

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел n: ");
        int n = scanner.nextInt();

        System.out.println("Введите " + n + " целых чисел:");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            if (number % 9 == 0) System.out.println(number + " делится на 9");
            else if (number % 3 == 0) System.out.println(number + " делится на 3");
        }
        scanner.close();
    }
}