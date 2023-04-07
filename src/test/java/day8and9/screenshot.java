package day8and9;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class screenshot {
WebDriver driver;
@Test
 public void screenshotest() {
		// TODO Auto-generated method stub
		String url="https://practiceseleniumelements.blogspot.com/2021/08/iframes.html";
		driver=utility.helper.LaunchBrowser(url, driver);
				
					TakesScreenshot ts=(TakesScreenshot)driver;
					File src=ts.getScreenshotAs(OutputType.FILE);
			      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");  
					   LocalDateTime now = LocalDateTime.now();        
					  String d= dtf.format(now);
				
					File dest =new File(System.getProperty("user.dir")+"\\screenshots\\"+d+".png");
					try {
						FileHandler.copy(src, dest);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
		
	}

}
