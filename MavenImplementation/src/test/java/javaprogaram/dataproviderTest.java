package javaprogaram;

import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

public class dataproviderTest {
	WebDriver driver;
  @Test(dataProvider = "Authentication")
  public void test(String username,String password )
  {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.id("//input[@id='identifierId']")).clear();
	  driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("username");
	  driver.findElement(By.xpath("  Rel XPath //span[@class='CwaK9'] \n" + 
	  	
))
  

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
