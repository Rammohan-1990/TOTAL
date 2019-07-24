package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venky\\Downloads\\DRIVERS\\chromedriver_win32\\chromedriver.exe.");
		WebDriver d=new ChromeDriver();
		d.navigate().to("https://www.flipkart.com/");
		d.manage().window().maximize();
		d.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement wb=d.findElement(By.xpath("//span[text()='Men']"));
		Actions ac=new Actions(d);
		ac.moveToElement(wb).perform();
		ac.contextClick(wb).perform();
		ac.doubleClick(wb).perform();

	}

}
