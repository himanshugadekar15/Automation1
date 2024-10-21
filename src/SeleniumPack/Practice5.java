package SeleniumPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice5 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "C:\\ChoromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Select se = new Select(driver.findElement(By.id("oldSelectMenu")));
		List<WebElement> options = se.getOptions();
		
		if(options.size()!=0)
		{
			System.out.println("Below are the list of dropdown options : ");
			for(WebElement elemnet : options)
			{
				System.out.println(elemnet.getText());
			}
		}
		System.out.println("Select by :- ");
		se.selectByIndex(4);
		System.out.println("Select value is: " + se.getFirstSelectedOption().getText());
		se.selectByVisibleText("Magenta");
		System.out.println("Select value is: " + se.getFirstSelectedOption().getText());
		se.selectByValue("10");
		System.out.println("select value is: " + se.getFirstSelectedOption().getText());
		
		
		driver.close();
		
	}

}
