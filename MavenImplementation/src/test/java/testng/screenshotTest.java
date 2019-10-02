package testng;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class screenshotTest {
	WebDriver driver;
  @Test
  public void browser() throws IOException 
  {
	  System.setProperty("webdriver.chrome.driver", "F:\\selenium software\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.amazon.com");
	  driver.manage().window().maximize();
	  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(f,new File("F:\\selenium software\\MavenImplementation\\screenshot\\amazon.jpg"));
	  
  }
  
  
}
