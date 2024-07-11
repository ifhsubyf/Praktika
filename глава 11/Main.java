/*
Шарыгина Надежда Б763-2
Вариант А
9. Сложить два многочлена заданной степени, если коэффициенты многочленов хранятся в объекте HashMap.
*/

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Integer> poly1 = new HashMap<>();
        HashMap<Integer, Integer> poly2 = new HashMap<>();
        // Пример: 3x^2 + 2x + 1
        poly1.put(2, 3);
        poly1.put(1, 2);
        poly1.put(0, 1);
        // Пример: 5x^2 + 4
        poly2.put(2, 5);
        poly2.put(0, 4);
        // Сложение
        HashMap<Integer, Integer> result = addPoly(poly1, poly2);
        // Вывод результата
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.println("Коэффициент при x^" + entry.getKey() + " = " + entry.getValue());
        }
    }
    public static HashMap<Integer, Integer> addPoly(HashMap<Integer, Integer> poly1, HashMap<Integer, Integer> poly2) {
        HashMap<Integer, Integer> result = new HashMap<>(poly1);
        for (Map.Entry<Integer, Integer> entry : poly2.entrySet()) {
            result.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
        return result;
    }
}