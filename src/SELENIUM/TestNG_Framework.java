package SELENIUM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Framework {
	
	WebDriver d;
	
	@AfterClass
	public void close() {
		
		d.close();	
	}
	
	@BeforeClass
	public void openbrowser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Venky\\Downloads\\DRIVERS\\chromedriver_win32\\chromedriver.exe.");
	 d=new ChromeDriver();
	 d.manage().window().maximize();	
	 d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	}
	
	@BeforeMethod
	public void login() {
		
		d.get("https://www.facebook.com/");
		d.findElement(By.id("email")).sendKeys("ramm37666@gmail.com");
		d.findElement(By.id("pass")).sendKeys("9398333720");
		d.findElement(By.id("loginbutton")).click();
		
	}
	
	@AfterMethod
	public void logout() {
		d.findElement(By.id("userNavigationLabel")).click();
		d.findElement(By.className("_54nh")).click();	
	}	
  @Test
  public void f() {
	  
	  String str=d.findElement(By.xpath("//span[text()='Ram'][1]")).getText();
	  System.out.println(str);
  }
}
