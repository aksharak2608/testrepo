package day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utility.helper;

public class explictwaitsexampleusinghelper {
	WebDriver driver;
	@Test
	public void login()
	{
		
		String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver=helper.LaunchBrowser(url, driver);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
		By username=By.xpath("//input[@name='username']");
		By password=By.xpath("//input[@name='password']");
		By submit=By.xpath("//*[@type='submit']");
		System.out.println(driver.getTitle());
		helper.waitforElementandenter(driver, username, "Admin");
		helper.waitforElementandenter(driver, password, "admin123");
		helper.waitforElementandClick(driver, submit);
		
	}

	
}
