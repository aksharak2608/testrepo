package day12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import utility.helper;

public class SSLIssue {
WebDriver driver;
@Test
public void sslissuetest(){
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhar\\OneDrive\\Desktop\\batch sep2022\\chromedriver\\chromedriver.exe");
	
		
		// Selenium Grid
		
	/*	DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.acceptInsecureCerts(); */
	
		ChromeOptions opt=new ChromeOptions();
	
		opt.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.cacert.org/");
		
		
	}

}