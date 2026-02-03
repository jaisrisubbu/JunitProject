package Pageobjectmodel;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclasspom {
public static WebDriver driver;

   @BeforeClass
   public static void Setup() {
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   	   
   }

   
   @AfterClass
    public static void tearDown() {
	   if(driver!=null) {
		   driver.quit();
	   }
   }
}
