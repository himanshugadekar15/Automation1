package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes_Inner {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver" , "C:\\ChoromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		WebElement outer = driver.findElement(By.xpath("//*[@id='Multiple']/iframe"));
		driver.switchTo().frame(outer);
		System.out.println("We are on outer frame");
		
		WebElement inner = driver.findElement(By.xpath("//*[@class='iframe-container']/iframe"));
		driver.switchTo().frame(inner);
		System.out.println("We are on inner frame");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Himanshu");
		driver.quit();

		//also parentframe to go back to parent frame & defaultcontent for going back to main page

		
		
		
		

	}

}
