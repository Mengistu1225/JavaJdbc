package RmiPackege;

import java.sql.*;

public class StudentRmi {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		 Connection connection = DriverManager.getConnection(
				 "jdbc:mysql://localhost:3306/classicmodels", "root", "Tigray@436012");
		 //System.out.println(" congura database connected successfully");
		 Statement stmt=connection.createStatement();
		 String sql = "select * from customers";
					
		 ResultSet resultSet = stmt.executeQuery(sql);
		 while (resultSet.next()) {
			System.out.println(resultSet.getString("customerName"));
			
		}
		 
		 connection.close();
	
	}

}
