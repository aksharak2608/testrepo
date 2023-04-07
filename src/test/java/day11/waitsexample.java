package day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utility.helper;

public class waitsexample {
	WebDriver driver;
	@Test
	public void login()
	{
		
		String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver=helper.LaunchBrowser(url, driver);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		System.out.println(driver.getTitle());
		WebElement o_user= driver.findElement(By.xpath("//input[@name='username']"));
		o_user.sendKeys("Admin");
		
		WebElement o_pass= driver.findElement(By.xpath("//input[@name='password']"));
		if(o_pass.isDisplayed())
		{
		o_pass.sendKeys("admin123");
		}
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}

}
