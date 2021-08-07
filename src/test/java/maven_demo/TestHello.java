package maven_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestHello {
	@Test
	public void testHello() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.close();
	}
}
