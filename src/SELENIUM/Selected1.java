package SELENIUM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selected1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venky\\Downloads\\DRIVERS\\chromedriver_win32\\chromedriver.exe.");
		WebDriver d=new ChromeDriver();
		d.navigate().to("https://www.facebook.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
;		d.findElement(By.id("u_0_8")).click();
		Boolean bt=d.findElement(By.id("u_0_8")).isSelected();
		if(bt) {
			
			System.out.println("print it is selected");
		}else {
			
			System.out.println("print it is not selected");
		}

	}

}
