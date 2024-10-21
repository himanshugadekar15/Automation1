package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String args[]) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver" , "C:\\ChoromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String ActualURL = "https://www.flipkart.com/";
		System.out.println("Actual page URL is = " +ActualURL);
		driver.get(ActualURL);
		String PageTitle =  driver.getTitle();
		System.out.println("Title of this page is = "+PageTitle);
		System.out.println("Length of the title is = "+PageTitle.length());
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@class = '_2IX_2- VJZDxU']"));
		username.sendKeys("6265034085");
		WebElement password = driver.findElement(By.xpath("//input[@class = '_2IX_2- _3mctLh VJZDxU']"));
		password.sendKeys("Capgemini@123");
		WebElement loginButton = driver.findElement(By.xpath("//button[@class = '_2KpZ6l _2HKlqd _3AWRsL']"));
		loginButton.click();
		String CurrentURL = driver.getCurrentUrl();
		System.out.println("Current page URL is = " +CurrentURL);
		if(ActualURL.equals(CurrentURL)) 
		{
			System.out.println("Correct page is opened");
		}
		else
		{
			System.out.println("Incorrect page is opened");
		}
		Thread.sleep(3000);
		driver.close();
		
		
		
	}
	
	
}
