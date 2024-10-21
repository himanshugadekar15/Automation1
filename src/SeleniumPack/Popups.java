package SeleniumPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Popups {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "C:\\ChoromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Authentication popup
		//http://user:password@URL
//		
//		driver.get("https:admin:admin@the-internet.herokuapp.com/basic_auth");
//		System.out.println("We are out");
//		
		
		//permission popups
		
		driver.get("https://www.redbus.in/");
		
		//need to set browser settings
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		//driver.quit();
		
		
		
		
		

	}

}
