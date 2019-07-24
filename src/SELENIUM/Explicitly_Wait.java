package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitly_Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venky\\Downloads\\DRIVERS\\chromedriver_win32\\chromedriver.exe.");
		WebDriver d=new ChromeDriver();
		d.navigate().to("https://www.hdfcbank.com/");
		d.manage().window().maximize();
		d.findElement(By.className("popupCloseButton")).click();
		WebDriverWait wb=new WebDriverWait(d, 20);
		String st=wb.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Get a life cover of Rs. 1 Cr @ only Rs. 492/month* and secure your family. '][1]"))).getText();
		System.out.println(st);

	}

}
