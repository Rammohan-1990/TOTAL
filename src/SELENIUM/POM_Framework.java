package SELENIUM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Framework {
	
	public POM_Framework(WebDriver d) {
		
		PageFactory.initElements(d, this);
	}
	
	@FindBy(name="email")
	public  WebElement username;
	
	@FindBy(name="pass")
	public  WebElement password;
	
	@FindBy(id="u_0_2")
    public  WebElement login;
	
	public void usename() {
		
		username.sendKeys("ramm37666@gmail.com");
	}
	
	public void pass() {
		
		password.sendKeys("9398333720");
	}
	
	public void login1() {
		
		login.click();
		
	}

}
