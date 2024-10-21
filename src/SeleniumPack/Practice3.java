package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver" , "C:\\ChoromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("We are on main page");
		driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
		System.out.println("We are on registration page");
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("We are back");
		
		
//		driver.navigate().forward();
//		driver.navigate().back();
//		driver.navigate().refresh();
//		driver.close();
		
		
	}
}
