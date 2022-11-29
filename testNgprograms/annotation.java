package TestngPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class annotation {
  @Test
  public void f() {
	  System.out.println("first test");
  }
  @Test
  public void s() {
	  System.out.println("second test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method test");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method test");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class test");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class test");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before suite test");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suite test");
  }

}
