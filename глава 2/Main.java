//Шарыгина Надежда
//Б763-2
//глава 2
//вариант В
//4. Вывести на экран все числа от 1 до 100, которые делятся на 3 без остатка

public class Main {
    public static void main(String[] args) {
        System.out.println("числа от 1 до 100, делящиеся на 3: ");
        for (int i=1;i<=100;i++)
            if (i % 3 == 0) System.out.print(i + " ");
        }
    }