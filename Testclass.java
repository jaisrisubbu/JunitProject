package Multiple;

import org.junit.Test;

public class Testclass extends Baseclass {
	@Test
	public void method() {
		driver.get("https://dribbble.com/search/add-to-cart");
		System.out.println(driver.getCurrentUrl());
	}
}
