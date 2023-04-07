package day8and9;

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


public class calender {
	
	WebDriver driver;
	
	void userinfo() throws InterruptedException
	{

		driver.findElement(By.xpath("//*[text()='My Info']//parent::a")).click();
		Thread.sleep(3500);
		JavascriptExecutor js = (JavascriptExecutor) driver; js.executeScript("window.scrollBy(0,230)");
		
		driver.findElement(By.xpath("//label[text()='License Expiry Date']/parent::div/following-sibling::div//i[@class='oxd-icon bi-calendar oxd-date-input-icon']")).click();
		driver.findElement(By.xpath("//div[@class='oxd-calendar-selector-month-selected']/p")).click();
		Thread.sleep(2000);
		
		List<WebElement> month_values=driver.findElements(By.xpath("//div[@class='oxd-calendar-header']//ul[@class='oxd-calendar-dropdown']//li"));
		
		List<WebElement> month_dd=driver.findElements(
				By.xpath("//div[@class='oxd-calendar-header']//ul[contains(@class,'oxd-calendar-dropdown')]//li"));
		
		System.out.println("no of elementsin month dropdown is"+month_dd.size());
		for(WebElement ele:month_dd)
		{
			System.out.println(ele.getText());
			if(ele.getText().equals("February"))
			{
				ele.click();
			break;
			}
		}
		driver.findElement(By.xpath("//div[@class='oxd-calendar-date' or @class='oxd-calendar-date --today'][text()='5']")).click();
		
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

