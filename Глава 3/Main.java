//Шарыгина Надежда Б763-2
//глава 2
//вариант В
/*7. Определить класс Треугольник на плоскости. Определить площадь и периметр треугольника.
 Создать массив/список/множество объектов и подсчитать количество треугольников разного типа
 (равносторонний, равнобедренный, прямоугольный, произвольный). Определить для каждой группы
наибольший и наименьший по площади (периметру) объект.*/

public class Main{
    public static void main (String[] args) {
        TriangleArray triangles = new TriangleArray();
        triangles.add(new Triangle(3, 4, 5));
        triangles.add(new Triangle(5, 4, 5));
        triangles.add(new Triangle(7, 7, 7));
        triangles.add(new Triangle(8, 10, 13));
        triangles.add(new Triangle(11, 17, 7));
        triangles.show();
        triangles.tritype();
        Triangle maxarea60 = triangles.Maxarea60();
        Triangle minarea60= triangles.Minarea60();
        Triangle maxarea2sides = triangles.Maxarea2sides();
        Triangle minarea2sides = triangles.Minarea2sides();
        Triangle maxarea90 = triangles.Maxarea90();
        Triangle minarea90 = triangles.Minarea90();
        Triangle maxareapr = triangles.Maxareapr();
        Triangle minareapr = triangles.Minareapr();
        System.out.print("Равносторонний треугольник с наибольшей площадью: ");
        maxarea60.show_tri();
        System.out.print("Равносторонний треугольник с наименьшей площадью: ");
        minarea60.show_tri();
        System.out.print("Равнобедренный треугольник с наибольшей площадью: ");
        maxarea2sides.show_tri();
        System.out.print("Равнобедренный треугольник с наименьшей площадью: ");
        minarea2sides.show_tri();
        System.out.print("Прямоугольный треугольник с наибольшей площадью: ");
        maxarea90.show_tri();
        System.out.print("Прямоугольный треугольник с наименьшей площадью: ");
        minarea90.show_tri();
        System.out.print("Произвольный треугольник с наибольшей площадью: ");
        maxareapr.show_tri();
        System.out.print("Произвольный треугольник с наименьшей площадью: ");
        minareapr.show_tri();
    }
}