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

public class draganddrop {
	WebDriver driver;
@Test
public void examplemouseactions()
{
	driver=helper.LaunchBrowser("https://demo.guru99.com/test/drag_drop.html", driver);
	Actions act= new Actions(driver);
	WebElement src=driver.findElement(By.xpath("//a[text()=' BANK ']/parent::li"));
	WebElement dest=driver.findElement(By.xpath("//ol[@class='field14 ui-droppable ui-sortable']/li"));
	act.dragAndDrop(src, dest).build().perform();
	Assert.assertEquals("BANK", driver.findElement(By.xpath("//ol[@class='field14 ui-droppable ui-sortable']/li")).getText());

}
}
