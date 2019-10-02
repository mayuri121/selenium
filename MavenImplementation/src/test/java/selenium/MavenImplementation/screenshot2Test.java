package selenium.MavenImplementation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class screenshot2Test {
	WebDriver driver; 
  @Test
  public void f() throws Exception {
	  System.setProperty("webdriver.gecko.driver","F:\\selenium software\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://www.gmail.com");
	  driver.manage().window().maximize();
	  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(f, new File("F:\\selenium software\\MavenImplementation\\screenshot\\gmail.jpg"));
  }
}