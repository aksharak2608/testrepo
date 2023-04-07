package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utility.helper;

public class login {
		WebDriver driver;
		By username=By.xpath("//input[@name='username']");
		By password=By.xpath("//input[@name='password']");
		By submit_button=By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
		
		public void enterUserName(String user)
		{
			
			helper.waitforElementandenter(driver, username, user);
			
		}
		public void enterpassword(String passcode)
		{

			helper.waitforElementandenter(driver, password, passcode);
		}
		public void submit()
		{

			helper.waitforElementandClick(driver, submit_button);
		}
		
		public login(WebDriver driver)
		{
			this.driver=driver;
		}
		
	

}
