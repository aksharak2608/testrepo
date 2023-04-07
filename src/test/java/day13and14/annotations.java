package day13and14;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class annotations {
  @Test
  public void f() {
	  
	  System.out.println("My Test");
	  annotations.m1();
  }
  @Test
public void f2() {
	  
	  System.out.println("My Test");
	  annotations.m1();
  }
  public static void m1()
  {
	  System.out.println("my method");
  }
  
  @BeforeMethod
  public void beforeMethod() {System.out.println("Before method");
  }

  @AfterMethod
  public void afterMethod() {System.out.println("Aftermethod");
  }

  @BeforeClass
  public void beforeClass() {System.out.println("BeforeClass");
  }

  @AfterClass
  public void afterClass() {System.out.println("AfterCLass");
  }

  @BeforeTest
  public void beforeTest() {System.out.println("Beforetest");
  }

  @AfterTest
  public void afterTest() {System.out.println("AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {System.out.println("beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {System.out.println("AfterSuite");
  }

}
