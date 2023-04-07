package day16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class screenshotforextentreports {
	@Test
	public void report()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");  
		   LocalDateTime now = LocalDateTime.now();        
		  String d= dtf.format(now);
	
		ExtentSparkReporter sp= new ExtentSparkReporter(System.getProperty("user.dir")+"\\reports\\Spark"+d+".html");
		ExtentReports report= new ExtentReports();
		report.attachReporter(sp);
		ExtentTest test1=report.createTest("firsttest");
		test1.log(Status.FAIL, "test failed");
		test1.fail(MediaEntityBuilder.createScreenCaptureFromPath(
				System.getProperty("user.dir")+"\\screenshots\\screenshot.png").build());
		
		report.flush();
		
		
		{
		};
	}

}
