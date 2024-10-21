package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass_Slider {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver" , "C:\\ChoromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		WebElement slider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		System.out.println(slider.getLocation());
		System.out.println(slider.getSize());
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(slider, 100, 250).perform();
		System.out.println("We have moved the slider");
		
		System.out.println(slider.getLocation());
		System.out.println(slider.getSize());
		driver.quit();

	}

}
