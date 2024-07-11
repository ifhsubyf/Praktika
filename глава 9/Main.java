/* Шарыгина Надежда Б763-2
В символьном файле находится информация об N числах с плавающей запятой
с указанием локали каждого числа отдельно. Прочитать информацию из файла.
Проверить на корректность, то есть являются ли числа числами. Преобразовать
к числовымзначениями вычислить сумму и среднее значениепрочитанных чисел.
Создать собственный класс исключения. Предусмотреть обработку исключений, возникающих при нехватке памяти, отсутствии самого файла по заданному адресу,
отсутствии или некорректности требуемой записи в файле, недопустимом значении числа (выходящим за пределы максимально допустимых значений) и т.д
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Locale;
class wrongnumber extends Exception {
    public wrongnumber(String message) {
        super(message);
    }
}
public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("input.txt"));
            scanner.useLocale(Locale.US);
            double sum = 0;
            int count = 0;
            while (scanner.hasNext()) {
                try {
                    double number = scanner.nextDouble();
                    if (Double.isNaN(number) || Double.isInfinite(number)) {
                        throw new wrongnumber("НЕверное число: " + number);
                    }
                    sum += number;
                    count++;
                } catch (wrongnumber | NumberFormatException e) {
                    System.err.println("Ошибка прочтения числа: " + e.getMessage());
                }
            }
            if (count == 0) {
                System.out.println("В файле нет подходящих чисел.");
            } else {
                double average = sum / count;
                System.out.println("Сумма: " + sum);
                System.out.println("Среднее: " + average);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: input.txt");
        } catch (Exception e) {
            System.err.println("Произошла ошибка: " + e.getMessage());
            e.printStackTrace();
        }
    }
}