package SELENIUM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venky\\Downloads\\DRIVERS\\chromedriver_win32\\chromedriver.exe.");
		WebDriver d=new ChromeDriver();
		d.navigate().to("https://seleniumhq.github.io/selenium/docs/api/java/");
		d.manage().window().maximize();
		d.switchTo().frame("classFrame");
		List <WebElement> wf=d.findElements(By.xpath("//a[text()='com.thoughtworks.selenium']"));
		wf.get(0).click();
		d.switchTo().defaultContent();
		d.switchTo().frame("packageListFrame");
		List <WebElement> wd=d.findElements(By.xpath("//a[text()='org.openqa.selenium.interactions.internal']"));
		wd.get(0).click();
		d.switchTo().defaultContent();
		d.switchTo().frame("packageFrame");
		d.findElement(By.xpath("//a[text()='BaseAction']")).click();
	

	}

}
