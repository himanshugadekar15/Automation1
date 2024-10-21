package SeleniumPack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicite_wait {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "C:\\ChoromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.cssSelector("input[class]")).sendKeys("Selenium");
		driver.findElement(By.cssSelector("input[class]")).sendKeys(Keys.RETURN);
		driver.findElement(By.cssSelector("h3[class = 'LC20lb MBeuO DKV0Md']")).click();
		
		
		
		

	}

}
