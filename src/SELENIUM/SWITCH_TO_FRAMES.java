package SELENIUM;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SWITCH_TO_FRAMES {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venky\\Downloads\\DRIVERS\\chromedriver_win32\\chromedriver.exe.");
		WebDriver d=new ChromeDriver();
		d.get("http://www.seleniumframework.com/demo-sites/");
		d.manage().window().maximize();
		d.findElement(By.xpath("//a[@href='http://www.seleniumframework.com/Practiceform/']")).click();
     
		
		
		
	  Set <String> han =d.getWindowHandles();
      Iterator <String> it=  han.iterator();
        
    String parent =  it.next();
    System.out.println( "printing parent id"   + parent);
    
    String child =  it.next();
    System.out.println( "printing chold id"   + child);
    
    d.switchTo().window(child);
    d.findElement(By.xpath("//button[@onclick='newBrwTab()']")).click();
		
		
	}

}
