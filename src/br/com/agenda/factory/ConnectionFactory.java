package br.com.agenda.factory;

import java.sql.*;

public class ConnectionFactory {
    private String username = "root";
    private String password = "";
    private String database = "jdbc:mysql://localhost:3306/agenda";
    
    public Connection ConnectionToMySQL() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(database, username, password);
        
        return conn;
    }
}
