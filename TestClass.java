package Pageobjectmodel;

import org.junit.Test;

public class TestClass extends Baseclasspom{

	@Test
	public void method() {
		
		driver.get("https://adactinhotelapp.com/index.php");
		Loginpage ob=new Loginpage(driver);
		ob.usernmame.sendKeys("jai");
		ob.password.sendKeys("pass123");
	}
}