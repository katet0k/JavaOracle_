package readers;

import database.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class WarnReader {
    public static void main(String[] args) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            while (true) {
                String selectSql = "SELECT id, message FROM notice WHERE type = 'WARN' AND processed = false";
                try (PreparedStatement selectStmt = connection.prepareStatement(selectSql)) {
                    ResultSet resultSet = selectStmt.executeQuery();
                    while (resultSet.next()) {
                        int id = resultSet.getInt("id");
                        String message = resultSet.getString("message");

                        System.out.println("WARN сообщение: " + message);

                        String updateSql = "UPDATE notice SET processed = true WHERE id = ?";
                        try (PreparedStatement updateStmt = connection.prepareStatement(updateSql)) {
                            updateStmt.setInt(1, id);
                            updateStmt.executeUpdate();
                        }
                    }
                }
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
