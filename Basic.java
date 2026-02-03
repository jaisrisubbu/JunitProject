package Junitbasics;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {
WebDriver driver;

@Before
public void setUp() {
driver=new ChromeDriver();
driver.manage().window().maximize();

}

@Test
public void method() {
	driver.get("https://adactinhotelapp.com/index.php");
	
	    String title = driver.getTitle();
	    assertEquals("Adactin.com - Hotel Reservation System", title);
	    System.out.println(title);
	}



//@After
//public void tearDown() {
//	driver.quit();
//
//	
//}


}
