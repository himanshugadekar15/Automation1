package SeleniumPack;

import java.util.List;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) throws InterruptedException{
		

		System.setProperty("webdriver.chrome.driver" , "C:\\ChoromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		
		//total number of frames
//		List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
//		System.out.println("We have total "+allFrames.size()+ " frames");
		
		
		//how to switch to frames
		//driver.switchTo().frame("packageListFrame");
		driver.switchTo().frame(0);
		System.out.println("We are on first Iframe");
		driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		driver.switchTo().frame("packageFrame");
		System.out.println("We are on second Iframe");
		driver.findElement(By.xpath("/html/body/main/div/section[1]/ul/li[1]/a")).click();
		driver.switchTo().defaultContent();
		
		
		driver.switchTo().frame("classFrame");
		System.out.println("We are on third Iframe");
		driver.findElement(By.xpath("//a[text() = 'Instance Methods']")).click();
		
		
		driver.quit();
		
		
		
		
		
		
		
	}

}
