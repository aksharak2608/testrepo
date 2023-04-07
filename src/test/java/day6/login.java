package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {
	@Test
	public void login() throws InterruptedException
	{
		System.out.println("hello");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhar\\OneDrive\\Desktop\\batch sep2022\\chromedriver\\chromedriver.exe");
	
		WebDriver driver= new ChromeDriver(); 
		driver.get("http://localhost:7080/login");
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("tomsmith");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");
		WebElement submit_button=driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		submit_button.click();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		WebElement o_user= driver.findElement(By.xpath("//input[@name='username']"));
		o_user.sendKeys("Admin");
		driver.close();
		
	}

}
