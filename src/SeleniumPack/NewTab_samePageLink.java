package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab_samePageLink {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "C:\\ChoromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		
		
		String tab = Keys.chord(Keys.CONTROL,Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"global-nav\"]/nav/div/ul[2]/li[1]/a")).sendKeys(tab);
		
		

	}

}
