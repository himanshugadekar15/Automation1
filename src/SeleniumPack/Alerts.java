package SeleniumPack;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "C:\\ChoromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		driver.switchTo().alert().accept();
//		System.out.println("Alert accepted");
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		driver.switchTo().alert().dismiss();
//		String selected = driver.findElement(By.xpath("//p[@id= 'result']")).getText();
//		System.out.println(selected);
	
		
		
		
		driver.findElement(By.xpath("//button[text() = 'Click for JS Prompt']")).click();
		Alert alertWindow = driver.switchTo().alert();
		String alertText = alertWindow.getText();
		System.out.println(alertText);
		alertWindow.sendKeys("Himanshu");
		alertWindow.accept();
		String selected = driver.findElement(By.xpath("//p[@id= 'result']")).getText();
		System.out.println(selected);
		
		driver.quit();
		
		

	}

}
