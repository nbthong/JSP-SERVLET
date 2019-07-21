/**
 *
 */
package com.msita.jspservlet.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author thongnguyen
 *
 */
public class ConnectionFactory {
	
	public static final String URL = "jdbc:mysql://localhost:3306/dbjdbc";
    public static final String USER = "root";
    public static final String PASS = "thong1304";
    
    /**
     * Get a connection to database
     * @return Connection object
     */
    public static Connection getConnection()
    {
      try {
          return DriverManager.getConnection(URL, USER, PASS);
      } catch (SQLException ex) {
          throw new RuntimeException("Error connecting to the database", ex);
      }
    }
    
    /**
     * Test Connection
     */
    public static void main(String[] args) {
        ConnectionFactory.getConnection();
    }
}
