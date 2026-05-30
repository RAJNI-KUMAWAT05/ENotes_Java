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
            + "&allowPublicKeyRetrieval=true";

        conn = DriverManager.getConnection(
            url,
            "root",
            "BuMbzRVmXGDcpyusaGmxntlenflNivhc"
        );

        System.out.println("DATABASE CONNECTED SUCCESSFULLY");

    }

} catch (Exception e) {

    System.out.println("DATABASE CONNECTION FAILED");

    e.printStackTrace();
}

        return conn;
    }
}
