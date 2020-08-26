package com.pcschool.ocp.d16_derby.case4_book;

import java.sql.Connection;
import java.sql.DriverManager;
/*
    資料庫連線
*/
public class BookDao {
    private static final BookDao dao = new BookDao();
    private Connection conn;
    private BookDao(){
        String jdbcUrl = "jdbc:derby://localhost:1527/demo"; 
        String username = "app";
        String password = "app";
        try {
            conn = DriverManager.getConnection(jdbcUrl, username, password);
        } catch (Exception e) {
        }
    }
    
    public static BookDao getInstance() {
        return dao;
    }

    public Connection getConn() {
        return conn;
    }
    
    @Override
    protected void finalize() throws Throwable {
        if(conn != null) {
            try {
                conn.close();
            } catch (Exception e) {
            }
        }
    }
    
}
