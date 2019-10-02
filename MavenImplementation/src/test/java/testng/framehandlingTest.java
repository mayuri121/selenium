package testng;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class framehandlingTest
{
	WebDriver driver;
  @Test
  public void f() 
  {
	  System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://alltechmedhas.com");
	  driver.manage().window().maximize();
	  driver.switchTo().frame("selenium");
	  //String str=driver.findElement(By.linkText("download")).getAttribute("Title");
	  //System.out.println(str);
	  //String str1=driver.findElement(By.tagName("iframe")).getAttribute("src");
	  //System.out.println(str1);
  }
}
