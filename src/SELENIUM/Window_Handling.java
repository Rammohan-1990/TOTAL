package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venky\\Downloads\\DRIVERS\\chromedriver_win32\\chromedriver.exe.");
		WebDriver d=new ChromeDriver();
		d.navigate().to("https://www.online.citibank.co.in/products-services/online-services/internet-banking.htm");
		d.manage().window().maximize();
		d.findElement(By.xpath("//span[text()='Login']")).click();
		String pid=d.getWindowHandle();
		System.out.println(pid);
		
		for(String ci:d.getWindowHandles()) {
			d.switchTo().window(ci);
		}
		d.findElement(By.id("User_Id")).sendKeys("1234");
		d.close();
		d.switchTo().window(pid);
		String we=d.findElement(By.xpath("//span[text()='Login']")).getText();
		System.out.println(we);
		d.close();
		
		

	}

}
