package SeleniumPack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver" , "C:\\ChoromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.javatpoint.com/simple-program-of-java");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
//		//draw border & take screenshot
//		WebElement element = driver.findElement(By.xpath("//h1"));
//		JavaScriptUtils.drowBorder(element, driver);
//		TakesScreenshot sc = (TakesScreenshot) driver;
//		File src = sc.getScreenshotAs(OutputType.FILE);
//		File trg = new File("C:/reports/screenshot.png");
//		FileHandler.copy(src, trg);
//		
//		//get title using executor
//		String str = JavaScriptUtils.gettitle(driver);
//		System.out.println("Title of the page is = "+str);
		
//		//click on a particular element
//		WebElement element2 = driver.findElement(By.xpath("//a[text()=' Programs']"));
//		JavaScriptUtils.click(element2, driver);
//		System.out.println("element clicked");
		
		//manualy generating alert
		JavaScriptUtils.alert(driver, "This is an alert");
		System.out.println("alert visible");
	}

}
