package day8and9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utility.helper;

public class selectdropdown {
	WebDriver driver;
@Test
	void selectdd()
	{
	driver=helper.LaunchBrowser("https://demo.guru99.com/test/newtours/register.php", driver);
	Select ss_dd=new Select(driver.findElement(By.xpath("//select[@name='country']")));
	ss_dd.selectByVisibleText("ZAMBIA");
	List<WebElement>dd_values=ss_dd.getOptions();
	for(WebElement ele : dd_values)
	{
		System.out.println(ele.getText());
	}
	
	ss_dd.selectByVisibleText("ZAMBIA");
	ss_dd.selectByIndex(6);
	
	
	
	}

}
