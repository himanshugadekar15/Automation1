package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass_KeyboardActionMultipleKey {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver" , "C:\\ChoromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		//textarea[@name='text1']
		WebElement input1 = driver.findElement(By.xpath("//textarea[@name='text1']"));
		WebElement input2 = driver.findElement(By.xpath("//textarea[@name='text2']"));
		input1.sendKeys("Himanshu Gadekar");
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.perform();
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.perform();
		
		action.sendKeys(Keys.TAB).perform();
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.perform();
		
		if(input1.getAttribute("value").equals(input2.getAttribute("value")))
		{
			System.out.println("values are matching");
		}
		else
		{
			System.out.println("values are not matching");
		}
		
	}

}
