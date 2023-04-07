package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import utility.helper;

public class mouseactions {
	WebDriver driver;
@Test
public void examplemouseactions()
{
	driver=helper.LaunchBrowser("https://demo.guru99.com/test/newtours/", driver);
	By link=By.xpath("//a[@href='reservation.php']");
	By mouseoverstatusele= By.xpath("//a[@href='reservation.php']/parent::td/parent::tr");
	System.out.println(driver.findElement(mouseoverstatusele).getAttribute("class"));
	Actions act= new Actions(driver);
	act.moveToElement(driver.findElement(link)).build().perform();
	Assert.assertEquals("mouseOver", driver.findElement(mouseoverstatusele).getAttribute("class"));
	

}
}
