package day13and14;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test3 {
	 @Test(priority=2,description="testingthis test3")
	 public void test3_1() {
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 	  System.out.println("My Test3");
	 	 System.out.println("Thread id is "+Thread.currentThread().getId());
	   }
	 @Test(priority=1)
	   public static void m1()
	   {
	 	  System.out.println("my method3");
	 	 System.out.println("Thread id is "+Thread.currentThread().getId());
	   }
	   
}
