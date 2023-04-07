package day11;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ssl {
	WebDriver driver;
	@Test
	public void fluentwaitexample()
	{
		String url="https://www.cacert.org/";
		driver=utility.helper.LaunchBrowser(url, driver);
	}
}
