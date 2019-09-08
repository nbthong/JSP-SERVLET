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
	
	public static final String URL = "jdbc:mysql://localhost:3306/jspservlet?characterEncoding=UTF8";
    public static final String USER = "root";
    public static final String PASS = "thong1304";
    
    /**
     * Get a connection to database
     * @return Connection object
     * @throws ClassNotFoundException 
     */
    public static Connection getConnection(){
	    try {
	    	Class.forName("com.mysql.cj.jdbc.Driver");
	        return DriverManager.getConnection(URL, USER, PASS);
	    } catch (SQLException | ClassNotFoundException e) {
	        throw new RuntimeException("Error connecting to the database", e);
	    }
    }
}
