package com.vti.academy.frontend.Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateProgram {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/TestingSystem?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(url, username, password);

		System.out.println("Connection Success!");

		// Step 3: Create a statement object
		Statement statement = connection.createStatement();

		// Step 4: Excute SQL Query
		String sql = "INSERT INTO `Department` (DepartmentName)" +
					 "VALUES					('Ngu suan')";

		int effectRecordAmount = statement.executeUpdate(sql);
		// Step 5: Xu li ket qua
		System.out.println("Effect Record Amount:" + effectRecordAmount );
		
		// step 6: close connection
		connection.close();
	}
}
