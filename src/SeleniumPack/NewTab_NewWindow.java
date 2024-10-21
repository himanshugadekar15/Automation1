package SeleniumPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab_NewWindow {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver" , "C:\\ChoromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://jqueryui.com/tooltip/");

	}

}
