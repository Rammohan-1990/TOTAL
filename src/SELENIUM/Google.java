package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venky\\Downloads\\DRIVERS\\chromedriver_win32\\chromedriver.exe.");
		WebDriver d=new ChromeDriver();
		d.get("");
		d.manage().window().maximize();
		//String ste=d.findElement(By.tagName("img")).getText();
		//System.out.println(ste);
		//d.findElement(By.className("gb_d")).click();
		//d.findElement(By.linkText("Gmail")).click();
		String sztr=d.findElement(By.partialLinkText("Gma")).getText();
		System.out.println(sztr);
	}

}
