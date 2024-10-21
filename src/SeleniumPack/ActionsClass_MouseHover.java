package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass_MouseHover {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver" , "C:\\ChoromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		WebElement item = driver.findElement(By.xpath("//li[@class='nav-item dropdown']"));
		Actions action = new Actions(driver);
		action.moveToElement(item).perform();
		System.out.println("moved to the element");
		driver.quit();
		
	}
}
