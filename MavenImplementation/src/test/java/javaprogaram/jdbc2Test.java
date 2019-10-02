package javaprogaram;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class jdbc2Test {
	
  @Test
  public void f() throws ClassNotFoundException, SQLException {
	  String dburl="jdbc:mysql://localhost:3306/selenium";
			  String username="root";
			  String password="admin123";
			  Class.forName("com.mysql.jdbc.Driver");
			  Connection conn=DriverManager.getConnection(dburl,username,password);
			  Statement st=conn.createStatement();
			  ResultSet rs=st.executeQuery("select * from employee");
			  while(rs.next())
			  {
				  String name=rs.getString("name");
				  System.out.println("name is"+name);
				  int salary=rs.getInt("salary");
				  System.out.println("salary is:"+salary);
			
			  
  }
			  conn.close();
}
}