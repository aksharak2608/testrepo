package day11;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;


public class fluentwaitex {
	WebDriver driver;
	@Test
	public void fluentwaitexample()
	{
		String url="https://practiceseleniumelements.blogspot.com/2021/06/blog-post.html";
		driver=utility.helper.LaunchBrowser(url, driver);
		By displayTimedText=By.xpath("//button[text()='Display timed text']");
		
		driver=utility.helper.waitforElementandClick(driver, displayTimedText);
		
	FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(10))
			.pollingEvery(Duration.ofMillis(250))
			.ignoring(WebDriverException.class);
	WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		  public WebElement apply(WebDriver driver) {
		    return driver.findElement(By.xpath("//div[@id='txt'][text()='Automation']"));
		  }
		});
	
	}

}
