package com.vti.academy.frontend.Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateV2Program {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/TestingSystem?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(url, username, password);

		System.out.println("Connection Success!");

		// Step 3: Create a statement object
		String sql = "INSERT INTO `Department` (DepartmentName)" + "VALUES		(?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		// input from scanner
		String DepartmentName = "Vo dung";
		// set parameter
		preparedStatement.setString(1, DepartmentName);
		// Step 4: Execute SQL query
		int effectRecordAmount = preparedStatement.executeUpdate();
		// Step 5 : Handing Result set
		System.out.println("Effect Record Amount:" + effectRecordAmount);

		// step 6: close connection
		connection.close();
	}
}
