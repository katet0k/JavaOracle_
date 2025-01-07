package readers;

import database.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InfoReader {
    public static void main(String[] args) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            while (true) {
                String selectSql = "SELECT id, message FROM notice WHERE type = 'INFO' AND processed = false";
                try (PreparedStatement selectStmt = connection.prepareStatement(selectSql)) {
                    ResultSet resultSet = selectStmt.executeQuery();
                    while (resultSet.next()) {
                        int id = resultSet.getInt("id");
                        String message = resultSet.getString("message");

                        System.out.println("INFO сообщение: " + message);

                        String deleteSql = "DELETE FROM notice WHERE id = ?";
                        try (PreparedStatement deleteStmt = connection.prepareStatement(deleteSql)) {
                            deleteStmt.setInt(1, id);
                            deleteStmt.executeUpdate();
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
