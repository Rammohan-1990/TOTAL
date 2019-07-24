package SELENIUM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
  @Test(priority=3)
  public void f() {
	  System.out.println("ruuning f method");
  }
  
  @Test(priority=2)
  public void t() {
	  System.out.println("ruuning t method");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("ruuning beforem method");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("ruuning afterm method");
  }
  @Test(priority=1)
  public void t1() {
	  System.out.println("ruuning t1 method");
  }

  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("ruuning beforec method");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("ruuning afterc method");
  }

 

  

 

 

}
