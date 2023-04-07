package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class orangehrmlogin {
	@Test
	void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhar\\OneDrive\\Desktop\\batch sep2022\\chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver(); 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		WebElement o_user= driver.findElement(By.xpath("//input[@name='username']"));
		o_user.sendKeys("Admin");
		
		WebElement o_pass= driver.findElement(By.xpath("//input[@name='password']"));
		if(o_pass.isDisplayed())
		{
		o_pass.sendKeys("admin123");
		//input[@name='password']
		}
	}

}
