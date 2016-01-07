package seleniumwebdriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchFirefox {
	FirefoxDriver driver;
	@Test 
	public void launchTest()
	{
		driver=new FirefoxDriver();
	driver.get("http://google.com");	
	}

}
