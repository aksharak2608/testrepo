package day10;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utility.helper;

public class windowhandle {
WebDriver driver;
	
	@Test
	public void testwindows() throws InterruptedException
	{
		String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver=helper.LaunchBrowser(url, driver);
		driver=helper.screenshottake(driver);
		Thread.sleep(3000);
		List<WebElement> links=driver.findElements(By.xpath("//div[@class='orangehrm-login-footer-sm']/a"));
		String parent=driver.getWindowHandle();
		for(WebElement ele : links)
		{
			ele.click();
			
			driver.switchTo().window(parent);
		}
		Set<String> windowids=driver.getWindowHandles();
		System.out.println(windowids.size());
		for(String s:windowids)
		{
			Thread.sleep(3000);
			System.out.println(s);
			driver.switchTo().window(s);
		int size=driver.findElements(By.xpath("//a[@aria-label='Facebook']")).size();
		if(size==1)
		{
			driver.close();
		}
		
		}
	}
	
	
	
}
