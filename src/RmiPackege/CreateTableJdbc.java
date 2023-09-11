package RmiPackege;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableJdbc {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		 Connection connection = DriverManager.getConnection(
				 "jdbc:mysql://localhost:3306/SMS", "root", "Tigray@436012");
		 //System.out.println(" conguratulization  database connected successfully");
		 Statement stmt=connection.createStatement();
			/*
			 * String
			 * sql="create table teacher(id int not NULL,Fname varchar(50),Lname varchar(50),age int,primary key(id))"
			 * ; stmt.executeUpdate(sql); System.out.println("table created succesfully");
			 */
		 String dropsql="drop table student";
		 stmt.executeUpdate(dropsql);
		 System.out.println("table droped successfully ");
		 
		 connection.close();

	}

}
