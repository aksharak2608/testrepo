package day13and14;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependson {
	 @Test(description="testingthis test3", dependsOnMethods="m1")
	 public void test3_1() {
	 	  System.out.println("Thread id is "+Thread.currentThread().getId());
	 	  System.out.println("My Testdepends");
	 	  
	   }
	 @Test
	   public static void m1()
	   
	   { System.out.println("Thread id is "+Thread.currentThread().getId());
	 	  System.out.println("my methoddepends");
	 	 
	   }
	   
}
