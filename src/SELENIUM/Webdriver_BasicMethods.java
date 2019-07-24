package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_BasicMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venky\\Downloads\\DRIVERS\\chromedriver_win32\\chromedriver.exe.");
		WebDriver d=new ChromeDriver();
		//d.get("https://www.redbus.in/?gclid=EAIaIQobChMI4JH8sbbR4gIV0RwrCh2bDAu3EAAYASAAEgK3yfD_BwE");
		d.navigate().to("https://www.redbus.in/?gclid=EAIaIQobChMI4JH8sbbR4gIV0RwrCh2bDAu3EAAYASAAEgK3yfD_BwE");
		d.navigate().refresh();
		d.navigate().back();
		d.navigate().forward();
		String str=d.findElement(By.xpath("//a[text()='Help']")).getText();
		String st1=d.findElement(By.xpath("//a[text()='PILGRIMAGES ']")).getAttribute("title");
		String str2=d.getCurrentUrl();
		String sty=d.getTitle();
		System.out.println(sty);
		System.out.println(str2);
		System.out.println(st1);
		System.out.println(str);
		d.manage().window().maximize();
	    d.findElement(By.xpath("//a[text()='Help']")).click();
		d.quit();

	}

}
