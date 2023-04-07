package day8and9;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utility.helper;

public class takescreenshotusinghelper {
	WebDriver driver;
	@Test

	public void takesc()
	{
		String url="https://practiceseleniumelements.blogspot.com/2021/08/iframes.html";
		driver=helper.LaunchBrowser(url, driver);
		driver= helper.screenshottake(driver);
	}
}
