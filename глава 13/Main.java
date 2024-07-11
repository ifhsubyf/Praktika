import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Добавление точек в базу данных
            PointModification.addPoint(1.0, 2.0);
            PointModification.addPoint(3.0, 4.0);
            PointModification.addPoint(5.0, 6.0);
            PointModification.addPoint(7.0, 8.0);
            PointModification.addPoint(-1.0, -2.0);
            double targetX = 0.0;
            double targetY = 0.0;
            Point nearestPoint = PointQueries.getNearestPoint(targetX, targetY);
            if (nearestPoint != null) {
                System.out.println("Ближайшая точка: " + nearestPoint);
            } else {
                System.out.println("В базе данных точек не найдено.");
            }
            Point farthestPoint = PointQueries.getFarthestPoint(targetX, targetY);
            if (farthestPoint != null) {
                System.out.println("Самая дальняя точка: " + farthestPoint);
            } else {
                System.out.println("В базе данных точек не найдено.");
            }
            double a = 1.0;
            double b = -1.0;
            double c = 0.0;
            List<Point> pointsOnLine = PointQueries.getPointsOnLine(a, b, c);
            if (!pointsOnLine.isEmpty()) {
                System.out.println("Точки на линии " + a + " * x + " + b + " * y + " + c + " = 0:");
                for (Point point : pointsOnLine) {
                    System.out.println(point);
                }
            } else {
                System.out.println("На указанной линии не найдено точек.");
            }
            PointModification.deletePoint(1);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}