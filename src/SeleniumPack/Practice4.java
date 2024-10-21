package SeleniumPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice4 {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver" , "C:\\ChoromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box/");
		
		driver.manage().window().maximize();
		
		List<WebElement> AllInput = driver.findElements(By.tagName("input"));
		
		if(AllInput.size()!=0)
		{
			System.out.println(AllInput.size() + " are the no of input tags we have");
			
			for(WebElement input : AllInput)
			{
				System.out.println(input.getAttribute("placeholder"));
				
			}
			
		}
		
		driver.quit();
	}
}
