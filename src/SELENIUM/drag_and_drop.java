package SELENIUM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Wait;

//import net.bytebuddy.implementation.bind.annotation.DefaultCall.Binder.DefaultMethodLocator.Implicit;

public class drag_and_drop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venky\\Downloads\\DRIVERS\\chromedriver_win32\\chromedriver.exe.");
	      WebDriver d= new ChromeDriver();
	      d.get("https://jqueryui.com/droppable/");
	      d.manage().window().maximize();
	      d.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	    WebElement frame =d.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
	    d.switchTo().frame(frame);
	    WebElement dragable=d.findElement(By.id("draggable"));
		WebElement drop=d.findElement(By.id("droppable"));
		Actions ac=new Actions(d);
		ac.dragAndDrop(dragable, drop).build().perform();

	    

	}

}
