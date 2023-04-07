package day8and9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utility.helper;

public class alerts {
	WebDriver driver;
	@Test
	public void alertsTest() 
	{
		// simple allert
		driver=helper.LaunchBrowser("https://practiceseleniumelements.blogspot.com/2021/08/simple-alert.html", driver);
		 driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert a= driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
		
		
		//confirm alert
		
		driver.findElement(By.xpath("//button[text()='Confirm Alert']")).click();
		a= driver.switchTo().alert();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a.dismiss();
		
		// prompt alert
		
		driver.findElement(By.xpath("//button[text()='Prompt Alert']")).click();
		a= driver.switchTo().alert();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a.sendKeys("akshara");
		a.accept();
	}
}
