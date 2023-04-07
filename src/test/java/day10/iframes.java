package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utility.helper;

public class iframes {

	WebDriver driver;
	@Test
	public void iframetest()
	{
		String url="https://practiceseleniumelements.blogspot.com/2021/08/iframes.html";
		driver=helper.LaunchBrowser(url, driver);
		driver.switchTo().frame("simplealert");
		 driver.findElement(By.xpath("//button[text()='Try it']")).click();
		 driver.switchTo().alert().accept();
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame("autocomplete");
		 driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("ind");
		
	}
}
