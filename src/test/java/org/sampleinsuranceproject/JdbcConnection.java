package org.sampleinsuranceproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcConnection {
public static void main(String[] args)  {
	
	Connection connection=null;
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
//		 connection = DriverManager.getConnection(,"hr","admin");
		
		String sql1 = "select * from endsleigh";
		PreparedStatement prepareStatement = connection.prepareStatement(sql1);
		
		ResultSet query = prepareStatement.executeQuery();
		while(query.next()) {
			String string1 = query.getString("startdate");
			System.out.println(string1);
		}
		
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
finally {
	System.out.println("i am finaly");
	try {
		connection.close();
	}
	catch(SQLException e) {
}}}}

