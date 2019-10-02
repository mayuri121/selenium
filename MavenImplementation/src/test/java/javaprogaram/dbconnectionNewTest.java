package javaprogaram;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class dbconnectionNewTest {
	WebDriver driver;
	String dburl="jdbc:mysql//localhost:3306/selenium";
	String username="root";
	String password="admin123";
	Connection conn=null;
  @Test
  public void f(){
	  System.setProperty("webdriver.chrome.driver", "F:\\selenium software\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.manage().window().maximize();
	  
		Class.forName("com.mysql.jdbc.Driver");
	conn=DriverManager.getConnection(dburl,username,password);
			Statement st=conn.createStatement();
               ResultSet rs=st.executeQuery(sql);
               while(rs.next())
               {
            	   driver.findElement(By.name("txtUsername")).sendKeys(rs.getString("username"));
            	   driver.findElement(By.name("txtPassword")).sendKeys(rs.getString("password"));
            	   driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
            	   if(driver.getCurrentUrl().equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/index.php/dashboard"));
            	   {
            		  WebDriverWait wait=new WebDriverWait(driver, 30);
            		  wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("welcome"))).click();
            		  Thread.sleep(2000);
            		  driver.findElement(By.linkText("Logout")).click();
            		  Thread.sleep(2000);
            		  else 
            			  
            		  {
            			  driver.navigate().back();
            			  driver.findElement(By.name("txtUsername")).clear();
            		  }
            	    }
               }
               conn.close();
}
