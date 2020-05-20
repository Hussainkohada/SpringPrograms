package com.luv2code.ecommerceproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyDatabase {
private Connection connection;
private Statement statement;
private ResultSet resultSet;
public MyDatabase() {	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12341875",
				"sql12341875","KWYQcfte9r");
		statement=connection.createStatement();	
}catch(Exception E) {
	System.out.println("Not Able to Connect: "+ E);
}
}

public void getData() {
	try {
		String sql="select * from product_category";
		resultSet=statement.executeQuery(sql);
		while(resultSet.next()) {
			Long id=resultSet.getLong("id");
			String name=resultSet.getString("category_name");
			System.out.println("Id is "+id+" Name is "+name);
		}
	}catch(Exception E) {
		System.out.println("Error while Fetching Data : "+E);
	}
}
}
