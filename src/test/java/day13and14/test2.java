package day13and14;

import org.testng.annotations.Test;

public class test2 {
	 @Test
	 public void test2_1() {
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 	  System.out.println("My Test");
	 	  annotations.m1();
	 	 System.out.println("Thread id is "+Thread.currentThread().getId());
	   }
	   public static void m1()
	   {
	 	  System.out.println("my method");
	 	 System.out.println("Thread id is "+Thread.currentThread().getId());
	   }
	   
}
