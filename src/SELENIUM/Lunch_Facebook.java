package SELENIUM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Lunch_Facebook {
	
	WebDriver d;
	
	@BeforeMethod
	public void openbrowser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Venky\\Downloads\\DRIVERS\\chromedriver_win32\\chromedriver.exe.");
	 d=new ChromeDriver();
	 d.get("https://www.facebook.com/");
	 d.manage().window().maximize();	
	 d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	}
	
	
	@AfterMethod
	public void logout() {
		d.close();	
	}

}
