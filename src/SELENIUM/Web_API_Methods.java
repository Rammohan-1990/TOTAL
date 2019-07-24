package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_API_Methods {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venky\\Downloads\\DRIVERS\\chromedriver_win32\\chromedriver.exe.");
		WebDriver d=new ChromeDriver();
		d.navigate().to("https://www.redbus.in/?gclid=EAIaIQobChMI4JH8sbbR4gIV0RwrCh2bDAu3EAAYASAAEgK3yfD_BwE");
		d.manage().window().maximize();
		d.findElement(By.id("src")).click();
		Thread.sleep(3000);
		d.findElement(By.id("src")).sendKeys("hyd");
		d.findElement(By.id("src")).clear();
		String str=d.findElement(By.id("src")).getCssValue("font-size");
		System.out.println(str);
		Boolean st1=d.findElement(By.id("src")).isDisplayed();
        if(st1) {
        	
        	System.out.println("print it is displayed");
        }else {
        	
        	System.out.println("print it is not not displayed");
        }
        Boolean st2=d.findElement(By.id("src")).isEnabled();
        if(st2) {
        	
        	System.out.println("print it isenabled");
        }else {
        	
        	System.out.println("print it is not not enabled");
        }
		
		

	}

}
