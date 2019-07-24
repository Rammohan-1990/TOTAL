package SELENIUM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actns1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venky\\Downloads\\DRIVERS\\chromedriver_win32\\chromedriver.exe.");
		WebDriver d=new ChromeDriver();
		d.navigate().to("https://www.flipkart.com/air-conditioners/pr?sid=j9e%2Cabm%2Cc54&p%5B%5D=facets.fulfilled_by%255B%255D%3DFlipkart%2BAssured&otracker=categorytree&otracker=nmenu_sub_TVs+%26+Appliances_0_Inverter+AC&p%5B%5D=facets.price_range.from%3DMin&p%5B%5D=facets.price_range.to%3DMax&p%5B%5D=facets.technology%255B%255D%3DInverter&p%5B%5D=facets.serviceability%5B%5D%3Dtrue");
		d.manage().window().maximize();
		//d.findElement(By.xpath("//button[text()='✕']")).click();
		List <WebElement> rs=d.findElements(By.className("_3aQU3C"));
		Actions ac=new Actions(d);
		ac.clickAndHold(rs.get(0)).moveToElement(rs.get(0), 60, 0).release().build().perform();

	}

}
