package com.Db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

    private static Connection conn;

    public static Connection getConn() {

        try {

            if (conn == null || conn.isClosed()) {

                Class.forName("com.mysql.cj.jdbc.Driver");

                String url =
                        "jdbc:mysql://zephyr.proxy.rlwy.net:36668/railway"
                        + "?useSSL=false"
                        + "&allowPublicKeyRetrieval=true"
                        + "&serverTimezone=UTC";

                String username = "root";

                String password = "BuMbzRVmXGDcpyusaGmxntlenflNivhc";

                conn = DriverManager.getConnection(
                        url,
                        username,
                        password
                );

                System.out.println("Database Connected Successfully!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }
}
