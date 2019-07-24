package SELENIUM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Call_POM {
	
	WebDriver d;
	
  @Test
  public void login() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Venky\\Downloads\\DRIVERS\\chromedriver_win32\\chromedriver.exe.");
	 d=new ChromeDriver();
		 d.manage().window().maximize();	
		 d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;
		 d.get("https://www.facebook.com/");
		 
		 POM_Framework p1=new POM_Framework(d);
		 p1.usename();
		 p1.pass();
		 p1.login1();
  }
}


