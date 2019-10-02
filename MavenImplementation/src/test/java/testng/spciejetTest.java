package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class spciejetTest {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.spicejet.com");
	  driver.manage().window().maximize();
	  public void h() {
		  Actions a=new Actions(driver);
		  a.moveToElement(driver.findElement(By.xpath("")))
	  }
  }
}
