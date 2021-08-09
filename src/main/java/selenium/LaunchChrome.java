package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shana\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//implicit wait is to tell WebDriver to poll the DOM for a certain amount of time when trying to find an element or elements (if) they are not immediately available
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      String url = "https://admin.emoha.com/log-in";
	      driver.get(url);
	      //identify image
	      WebElement i = driver.findElement(By.xpath("//*[@id=\"app\"]/div/header/div/a/img"));
	      // java script executor to check image
	      // arguments[0] references an HTMLImageElement
	      // object has a complete property which indicates whether the image is loaded or not
	      // naturalHeight and naturalWidth properties which together specifies the intrinsic size of the image once loaded
	      // these properties aren't available, they return 0.
	      Boolean p = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);
       
	      //verify if status is true
	      if (p) {
	         System.out.println("Logo present");
	      } else {
	         System.out.println("Logo not present");
	      }
	      driver.quit();
	}

}
