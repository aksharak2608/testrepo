package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utility.helper;

public class keyboardactions {
	WebDriver driver;
@Test
public void mkeybaction()
{driver=helper.LaunchBrowser("https://demo.guru99.com/test/newtours/", driver);
	
	By username=By.xpath("//input[@name='userName']");
	WebElement txtUsername=driver.findElement(username);
	Actions act= new Actions(driver);
	Action seriesOfActions = act .moveToElement(txtUsername) 
			.click() 
			.keyDown(txtUsername, Keys.SHIFT)
			 .sendKeys(txtUsername, "hello") 
			.keyUp(txtUsername, Keys.SHIFT) 
			.doubleClick(txtUsername)
			 .contextClick() 
			.build();
	seriesOfActions.perform();
	
	}
}
