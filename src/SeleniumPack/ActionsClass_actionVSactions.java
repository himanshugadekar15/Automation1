package SeleniumPack;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass_actionVSactions {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver" , "C:\\ChoromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//div[@class = 'desktop-navLink']"));
		Actions act = new Actions(driver);
		//build.perform() is there in perform method
		//so if we call perform() it will automatically call build.perform()
		//build.perform() will call build method 2 times
		//act.moveToElement(element).perform();
		Action act2 = act.moveToElement(element).build();
		//actions is a class
		act2.perform();
		//Action
		
		
		//driver.quit();
		
		
		

	}

}
