package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass_DragDrop {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver" , "C:\\ChoromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		
		WebElement source = driver.findElement(By.id("box1"));
		WebElement target = driver.findElement(By.id("box106"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).perform();
		
		System.out.println("we have draged droped the element");
		driver.quit();
		
	}

}
