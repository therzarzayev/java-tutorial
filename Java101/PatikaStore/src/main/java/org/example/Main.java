package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // JDBC URL, kullanıcı adı ve şifrenizi buraya ekleyin
        String jdbcUrl = "jdbc:mysql://localhost:3306/school";
        String username = "dnetxx";
        String password = "rza3639";

        try {
            // Veritabanına bağlan
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Bağlantı başarılı olduysa bir mesaj yazdır
            if (connection != null) {
                System.out.println("Veritabanına başarıyla bağlandı!");
            }

            // Bağlantıyı kapat
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}