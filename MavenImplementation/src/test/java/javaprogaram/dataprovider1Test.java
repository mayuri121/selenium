package javaprogaram;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class dataprovider1Test {
	WebDriver driver;
  @Test(dataProvider = "Authentication")
  
 public void f(String username, String password)
  {
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.id("txtUsername")).clear();
	driver.findElement(By.id("txtUsername")).sendKeys(username);
	driver.findElement(By.id("txtPassword")).clear();
	driver.findElement(By.id("txtPassword")).sendKeys(password);
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

  }

  @DataProvider(name="Authentication")
  public static Object[][] credentials()
  {
    return new Object[][] 
    		{
      {"Admin","admin123"},
      { "abc", "abc123" },
    };
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "F:\\selenium software\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com");
	  driver.manage().window().maximize();
  }

}
