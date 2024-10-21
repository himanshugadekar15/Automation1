package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass_RightClick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "C:\\ChoromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		WebElement button = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		action.contextClick(button).perform();
		String alert_message = driver.findElement(By.id("rightClickMessage")).getText();
		System.out.println(alert_message);
		driver.quit();
		
	}

}
