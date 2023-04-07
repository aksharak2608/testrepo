package day7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class radiobuttons {
	
	WebDriver driver;
	
	void userinfo() throws InterruptedException
	{

		driver.findElement(By.xpath("//*[text()='My Info']//parent::a")).click();
		Thread.sleep(3500);
		JavascriptExecutor js = (JavascriptExecutor) driver; js.executeScript("window.scrollBy(0,230)");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
		if(driver.findElement(By.xpath("//label[text()='Female']//input")).isSelected())
		{
			System.out.println("female radio button is selected.");
		}
		
		if(!driver.findElement(By.xpath("//label[text()='Yes']//input")).isSelected())
		{

			driver.findElement(By.xpath("//label[text()='Yes']")).click();
		}
		
		
		
		}
		
		
		
	
	
	
	
	
	
	@Test
	void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhar\\OneDrive\\Desktop\\batch sep2022\\chromedriver\\chromedriver.exe");
		
		 driver= new ChromeDriver(); 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		WebElement o_user= driver.findElement(By.xpath("//input[@name='username']"));
		o_user.sendKeys("Admin");
		
		WebElement o_pass= driver.findElement(By.xpath("//input[@name='password']"));
		if(o_pass.isDisplayed())
		{
		o_pass.sendKeys("admin123");
		}
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	//	userinfo();
		userinfo();
		
}
}

