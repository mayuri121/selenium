package selenium.MavenImplementation;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class headlessTest {
WebDriver driver;
	
	
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "F:\\selenium software\\chromedriver.exe");
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("1000,800");
	  options.addArguments("headless");
	  driver =new ChromeDriver(options);
	  driver.get("http://www.facebook.com");
	  String str=driver.getTitle();
	  System.out.println(str);
  }
}