package Com.Practice.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * @author BV095423
 */

public class seleniumprac {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		
		driver.close();

	}

}
