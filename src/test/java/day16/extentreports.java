package day16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentreports {
	@Test
	public void testreport() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");  
		   LocalDateTime now = LocalDateTime.now();        
		  String d= dtf.format(now);
	
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+"\\reports\\Spark"+d+".html");
		extent.attachReporter(spark);
		extent.createTest("MyFirstTest")
		  .log(Status.PASS, "This is a logging event for MyFirstTest, and it passed!");
		extent.createTest("MyFirstTest")
		  .log(Status.FAIL, "This is a logging event for Test, and it failed!");
		extent.flush();


	}

}
