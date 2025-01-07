package writers;

import database.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import java.util.Random;

public class NoticeWriter {
    public static void main(String[] args) {
        String[] types = {"INFO", "WARN"};
        Random random = new Random();

        try (Connection connection = DatabaseConnection.getConnection()) {
            while (true) {
                String type = types[random.nextInt(types.length)];
                String message = type.equals("INFO") ?
                        "Новое сообщение от " + LocalDateTime.now() :
                        "Произошла ошибка в " + LocalDateTime.now();

                String sql = "INSERT INTO notice (message, type, processed) VALUES (?, ?, false)";
                try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                    stmt.setString(1, message);
                    stmt.setString(2, type);
                    stmt.executeUpdate();
                }

                System.out.println("Вставлено сообщение: " + message);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
