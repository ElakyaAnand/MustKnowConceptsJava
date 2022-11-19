package javaConcepts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection= DriverManager.getConnection("jdbc:mysql://root@localhost/selenium");
		Statement statement= connection.createStatement();
		ResultSet  result= statement.executeQuery("select * from register");
		while(result.next())
		{
			System.out.println("The Id is :" + result.getInt(1)+ "The Name is :" +result.getString(2));
		}

	}

}
