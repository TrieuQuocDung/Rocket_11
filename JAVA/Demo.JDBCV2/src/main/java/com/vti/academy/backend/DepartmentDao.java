package com.vti.academy.backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DepartmentDao {
	public void Question1() throws ClassNotFoundException, SQLException {
	String url = "jdbc:mysql://localhost:3306/TestingSystem?autoReconnect=true&useSSL=false&characterEncoding=latin1";
	String username = "root";
	String password = "root";

	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection connection = DriverManager.getConnection(url, username, password);

	System.out.println("Connection Success!");

	// Step 3: Create a statement object
	String sql = "Select * from Department";

	// Step 4: Excute SQL Query
	Statement statement = connection.createStatement();
	
	ResultSet resultset = statement.executeQuery(sql);

	// Step 5: Xu li ket qua
	while (resultset.next()) {
		System.out.print(resultset.getInt("DepartmentID") + " ");
		System.out.println(resultset.getString("DepartmentName"));
	}
	//step 6: close connection
	connection.close();
	}
}
