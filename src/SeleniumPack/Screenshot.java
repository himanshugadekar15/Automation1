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

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException{
		
		
		System.setProperty("webdriver.chrome.driver" , "C:\\ChoromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		
		//full page screenshot
//		TakesScreenshot sc = (TakesScreenshot)driver;
//		File src = sc.getScreenshotAs(OutputType.FILE);
//		File trg = new File("C:/reports/screenshot.png");
//		FileHandler.copy(src, trg);
//		System.out.println("screenshot taken");
		//FileUtils.copyfile(src,trg);
		
		
		//screenshot of particular element
		WebElement element = driver.findElement(By.xpath("//*[@id=\"web-footerMount\"]/div/footer/div/div[2]/div"));
		File src = element.getScreenshotAs(OutputType.FILE);
		File trg = new File("C:/reports/screenshot2.png");
		FileHandler.copy(src, trg);
		
		driver.close();
	}

}
