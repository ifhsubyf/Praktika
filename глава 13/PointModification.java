import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PointModification {
    public static void addPoint(double x, double y) throws SQLException {
        String query = "INSERT INTO points (x, y) VALUES (?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setDouble(1, x);
            statement.setDouble(2, y);
            statement.executeUpdate();
        }
    }

    public static void deletePoint(int id) throws SQLException {
        String query = "DELETE FROM points WHERE id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        }
    }
}