package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class writeSQLtoDB {

	public static void main(String[] args) throws SQLException {
		String URL = "jdbc:mysql://localhost:3306/guvi";
		String uname = "root";
		String psw="Hello123";

		//creating connection to database
		
		Connection con= DriverManager.getConnection(URL, uname, psw);
		
		//create statement object to create statement
		Statement s= con.createStatement();
		String sql="insert into demo (empcode,empname,emppage,esalary) values"
				+ "(101,'Jenny',25,10000),"
				+ "(102,'Jacky',30,20000),"
				+ "(103,'Joe',20,40000),"
				+ "(104,'John',40,80000),"
				+ "(105,'Shameer',25,90000)";
		
		
		//Execute the query
		 s.executeUpdate(sql);
		 System.out.println("Data Inserted Successfully");
	}

}
