package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Selected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venky\\Downloads\\DRIVERS\\chromedriver_win32\\chromedriver.exe.");
		WebDriver d=new ChromeDriver();
		d.navigate().to("https://www.amazon.in/Home-Entertainment-Systems/b?ie=UTF8&node=1389375031&ref_=sd_allcat_sbc_tvelec_home_ent");
		d.manage().window().maximize();
		d.findElement(By.xpath("//input[@name='s-ref-checkbox-AX1OWEZA5TIL']")).click();
		
		Thread.sleep(3000);
		
		Boolean bt=d.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[10]")).isSelected();
		if(bt) {
			
			System.out.println("print it is selected");
		}else {
			
			System.out.println("print it is not selected");
		}

	}

}
