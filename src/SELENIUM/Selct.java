package SELENIUM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selct {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venky\\Downloads\\DRIVERS\\chromedriver_win32\\chromedriver.exe.");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/air-conditioners/pr?sid=j9e%2Cabm%2Cc54&p%5B%5D=facets.fulfilled_by%255B%255D%3DFlipkart%2BAssured&otracker=categorytree&otracker=nmenu_sub_TVs+%26+Appliances_0_Inverter+AC&p%5B%5D=facets.price_range.from%3DMin&p%5B%5D=facets.price_range.to%3DMax&p%5B%5D=facets.technology%255B%255D%3DInverter&p%5B%5D=facets.serviceability%5B%5D%3Dtrue");
		driver.manage().window().maximize();
		WebElement drp=driver.findElement(By.className("fPjUPw"));
		Select drp1=new Select (drp);
		drp1.getOptions().size();
		System.out.println("number of elements present in drp"  +drp1.getOptions().size());
		List <WebElement> options=drp1.getOptions();
		for (WebElement e:options) {
			e.getText();
			System.out.println("present options available in dropdown" +e.getText());
			
			drp1.selectByValue("35000");
		}
		
		
		
		
		
	    
		//wb.getOptions();
		//System.out.println(wb);
		//se.selectByValue("30000");
		//se.selectByIndex(1);
		//se.selectByVisibleText("35000");
		//Select sd=new Select(wb.get(1));
		//sd.selectByValue("35000");
		//sd.selectByIndex(2);
		//sd.selectByVisibleText("50000");
	     
		
		
		
		

	}

}
