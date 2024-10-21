package SeleniumPack;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass_KeyboardActionSingleKey {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "C:\\ChoromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		Actions action = new Actions(driver);
		
		action.sendKeys(Keys.ENTER).perform();
		System.out.println("Enter pressed");
		action.sendKeys(Keys.SHIFT).perform();
		System.out.println("shift pressed");
		action.sendKeys(Keys.CONTROL).perform();
		System.out.println("Control pressed");
		action.sendKeys(Keys.TAB).perform();
		System.out.println("Tab pressed");
		driver.quit();
		
		
	}

}
