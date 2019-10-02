package testng;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mousehoveringTest {
	WebDriver driver;
	
  @Test
  public void broser() throws Exception 
  {
	  System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.gmail.com");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("mkaw1234@gmail.com");
	  //driver.findElement(By.xpath("//span[@class='NlWrkb snByac']")).click();
	  driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mayuri786");
	  driver.findElement(By.xpath("//div[@id='passwordNext']//span[@class='CwaK9']")).click();
	  
	  
  
  
  }
}
 