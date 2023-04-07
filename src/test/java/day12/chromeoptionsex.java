package day12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class chromeoptionsex {
	@Test
	public void testchromeoptions()
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhar\\OneDrive\\Desktop\\batch sep2022\\chromedriver\\chromedriver.exe");
	
		
		ChromeOptions opt=new ChromeOptions();
	
		opt.addArguments("start-maximized","incognito","disable-infobars");

		WebDriver driver = new ChromeDriver(opt);
		
	
		
		driver.get("https://www.google.com/");
	}

}
