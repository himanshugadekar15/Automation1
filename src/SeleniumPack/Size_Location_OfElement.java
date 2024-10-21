package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size_Location_OfElement {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver" , "C:\\ChoromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
		System.out.println(element.getSize());
		System.out.println(element.getSize().getHeight());
		System.out.println(element.getSize().getWidth());
		System.out.println(element.getLocation());
		System.out.println(element.getLocation().getX());
		System.out.println(element.getLocation().getY());
	}

}
