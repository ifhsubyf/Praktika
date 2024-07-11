import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PointQueries {
    public static Point getNearestPoint(double x, double y) throws SQLException {
        String query = "SELECT id, x, y FROM points ORDER BY SQRT(POW(x - ?, 2) + POW(y - ?, 2)) LIMIT 1";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setDouble(1, x);
            statement.setDouble(2, y);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new Point(resultSet.getInt("id"), resultSet.getDouble("x"), resultSet.getDouble("y"));
            }
        }
        return null;
    }

    public static Point getFarthestPoint(double x, double y) throws SQLException {
        String query = "SELECT id, x, y FROM points ORDER BY SQRT(POW(x - ?, 2) + POW(y - ?, 2)) DESC LIMIT 1";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setDouble(1, x);
            statement.setDouble(2, y);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new Point(resultSet.getInt("id"), resultSet.getDouble("x"), resultSet.getDouble("y"));
            }
        }
        return null;
    }

    public static List<Point> getPointsOnLine(double a, double b, double c) throws SQLException {
        List<Point> points = new ArrayList<>();
        String query = "SELECT id, x, y FROM points WHERE ABS(? * x + ? * y + ?) < 1e-9";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setDouble(1, a);
            statement.setDouble(2, b);
            statement.setDouble(3, c);

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                points.add(new Point(resultSet.getInt("id"), resultSet.getDouble("x"), resultSet.getDouble("y")));
            }
        }
        return points;
    }
}