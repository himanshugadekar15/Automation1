package SeleniumPack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicite_Wait {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver" , "C:\\ChoromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	
		driver.findElement(By.cssSelector("input[class]")).sendKeys("Selenium");
		driver.findElement(By.cssSelector("input[class]")).sendKeys(Keys.RETURN);
		
		By Element_locator = By.cssSelector("h3[class = 'LC20lb MBeuO DKV0Mdh']");
		WebElement element = waitForElementPresent(driver,Element_locator,10);
		element.click();
		
		//driver.findElement(By.cssSelector("h3[class = 'LC20lb MBeuO DKV0Md']")).click();
		
	}

	public static WebElement waitForElementPresent(WebDriver driver,By locator, int timeout)
	{
		
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		myWait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return driver.findElement(locator);
		
	}
	
}
