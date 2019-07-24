package SELENIUM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venky\\Downloads\\DRIVERS\\chromedriver_win32\\chromedriver.exe.");
		WebDriver d=new ChromeDriver();
		d.navigate().to("https://www.online.citibank.co.in/products-services/online-services/internet-banking.htm");
		d.manage().window().maximize();
		((JavascriptExecutor)d).executeScript("scroll(0,800)");

	}

}
