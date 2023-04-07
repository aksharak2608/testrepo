package day16;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class itestresults {
@Test
public void testdemo1()
{
	System.out.println("test demo method sucess");
	Assert.assertTrue(true);
}
@Test
public void testdemo()
{
	System.out.println("test demo method failure");
	Assert.assertTrue(false);
}
@Test(dependsOnMethods="testdemo")
public void testskip()
{
	System.out.println("test demo method skipped");
	Assert.assertTrue(false);
}

@AfterMethod
public void output(ITestResult r)
{
	int status=r.getStatus();
	if(status==ITestResult.SUCCESS)
	{
		System.out.println("Test success");
	}
	
	else if(status==ITestResult.FAILURE)
	{
		System.out.println("Test Failed");
		System.out.println("Exception throwed is"+r.getThrowable().getMessage());
	}
	else if(status==ITestResult.SKIP)
	{
		System.out.println("Test Skiped");
		
	}
	
	
	
	}



}
