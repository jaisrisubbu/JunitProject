package Multiple;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
    public WebDriver driver;
    
	@Before
	public void setUp() {
	   driver=new ChromeDriver();
	   	}
	
	@After
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}
}

