package selenium_grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class seleniumgrid3Test 
{
	WebDriver driver;
	String baseurl="https://gamil.com";
	String nodeurl1="http://192.168.100.22.3456/wd/hub";
	
  @Test
  public void f()
  {
	  
	  DesiredCapabilities capability=DesiredCapabilities.firefox();
	  capability.setBrowserName("firefox");
	  
	  capability.setPlatform(Platform.WINDOWS);
	  try {
		driver=new RemoteWebDriver(new URL(nodeurl1),capability);
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
  
}
