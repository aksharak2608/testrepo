package day13and14;



import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class reoporter {

	 @Test
	   public static void m1()
	   {
		 System.out.println("Thread id is "+Thread.currentThread().getId());
	 	  System.out.println("my method3");
	 	  Reporter.log("execution done",true);
	 	  Reporter.log("execution doneclose",false);
	 	 
	   }
	 @Test
	 public static void m2()
	   {
		 System.out.println("Thread id is "+Thread.currentThread().getId());
	 	  System.out.println("my method3");
	 	 Assert.assertEquals(true,false);
	 	 
	   }
}
