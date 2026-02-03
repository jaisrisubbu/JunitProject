package Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver driver;
	
	@FindBy(id="username")
	public WebElement usernmame;
	
	@FindBy(name="password")
	public WebElement password;
	
	
	
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getUsernmae() {
		return usernmame;
	}
	
	public WebElement getPassword() {
		return password; 
	}
	
	
	
	
}
