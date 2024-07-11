/* Шарыгина Надежда Б763-2
вариант А
12. Создать массив целых чисел. Убрать все четные элементы
из массива и заполнить в конце нулями до прежнего размера массива. */
import java.util.Arrays;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        int min=0, max=99;
        for (int i=0;i<10;i++) {
            double v = Math.random() * (max - min + 1);
            array[i]=min +(int) v;
        }
        System.out.println("изначальный массив:");
        System.out.println(Arrays.toString(array));
        System.out.println(" ");
        int[] new_array = new int[array.length];
        int ind = 0;
        for (int i=0;i<10;i++)
            if (array[i] % 2 != 0) new_array[ind++] = array[i];
        Arrays.fill(new_array, ind, new_array.length, 0);
        System.out.println("изменённый массив:");
        System.out.println(Arrays.toString(new_array));
    }
}
