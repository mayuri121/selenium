package selenium.MavenImplementation;

import java.awt.dnd.DragGestureEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class sreenshot3Test {
	WebDriver driver;
  @Test
  public void brower() throws IOException
  {
	  System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com");
	  driver.manage().window().maximize();
	  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(f, new File("F:\\selenium software\\MavenImplementation\\screenshot\\flipkart.jpg"));
	  
  }
}
