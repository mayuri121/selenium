package listeners;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class listenersTest {
	WebDriver driver;
  @Test(priority =0 )
  public void f() 
  {
	 System.setProperty("webdriver.chrome.driver", "F:\\selenium software\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://opensource-demo.orangehrmlive.com/");
	 driver.manage().window().maximize();
	 }
  
  @Test(priority=3)
  public void M() throws InterruptedException
  {
  Thread.sleep(2000);
  driver.findElement(By.linkText("Welcome Admin")).click();
  Thread.sleep(2000);
  driver.findElement(By.linkText("Logout")).click();;
  
  
}
  @Test(priority=1)
  public void login()
  {
	  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
  }
  @Test(priority=2)
  public void mousehoverring() throws InterruptedException
  
  {
	Actions a=new Actions(driver);
	a.moveToElement(driver.findElement(By.linkText("Admin"))).build().perform();
	a.moveToElement(driver.findElement(By.linkText("User Management"))).build().perform();
	driver.findElement(By.linkText("Users")).click();
	Thread.sleep(2000);
	
	
  
  }
}