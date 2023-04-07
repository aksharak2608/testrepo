package day16;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import utility.helper;

public class takethescreenshot {
	WebDriver driver;
	ExtentTest test1;
	ExtentReports report;
	@BeforeSuite
	public void report()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");  
		   LocalDateTime now = LocalDateTime.now();        
		  String d= dtf.format(now);
	
		ExtentSparkReporter sp= new ExtentSparkReporter(System.getProperty("user.dir")+"\\reports\\Spark"+d+".html");
		 report= new ExtentReports();
		report.attachReporter(sp);
		test1=report.createTest("firsttest");
		
	
	}
	@AfterMethod
	public void ResultReport(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			test1.log(Status.PASS, "Test passed",MediaEntityBuilder.createScreenCaptureFromPath(takethescreenshot.screenshottake(driver)).build());
		}
		else if(result.getStatus()==ITestResult.FAILURE)
		{
			test1.log(Status.FAIL, "Test Failed",MediaEntityBuilder.createScreenCaptureFromPath(takethescreenshot.screenshottake(driver)).build());
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test1.log(Status.SKIP, "Test Skiped");
		}
		report.flush();
	}
	public static String screenshottake(WebDriver driver)
	{
		String path = null;
		try {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");  
		   LocalDateTime now = LocalDateTime.now();        
		  String d= dtf.format(now);
	
		File dest =new File(System.getProperty("user.dir")+"\\screenshots\\"+d+".png");
		 path=System.getProperty("user.dir")+"\\screenshots\\"+d+".png";
			FileHandler.copy(src, dest);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return path;
		
		
	}
	@Test
	public void test()
	{
		driver=helper.LaunchBrowser("https://www.google.com", driver);
	
	}

}
