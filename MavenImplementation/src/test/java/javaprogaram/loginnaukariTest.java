package javaprogaram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginnaukariTest {
	public WebDriver driver;
	
  @Test
  public void f() throws IOException, InterruptedException {
	  FileInputStream fi=new FileInputStream("F:\\selenium software\\MavenImplementation\\test data\\NAUKRI LOGIN TEST DATA.xlsx");
	  XSSFWorkbook workbook=new XSSFWorkbook(fi);
		XSSFSheet sheet=workbook.getSheet("logindata");
		for(int i=0;i<sheet.getLastRowNum();i++)
		{
			driver.findElement(By.xpath("//div[@class='mTxt'][contains(text(),'Login')]")).click();
			driver.findElement(By.xpath("//input[@id='eLoginNew']")).sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='pLogin']")).sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
			driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
			Thread.sleep(4000);
			driver.navigate().back();
			Thread.sleep(4000);
			driver.navigate().to("https://www.naukri.com");
			Thread.sleep(4000);
		}
  }
		@BeforeTest
		public void browser()
		{
			System.setProperty("webdriver.chrome.driver", "F:\\selenium software\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.naukri.com");
		}
}
