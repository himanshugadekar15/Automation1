package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice6 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver" , "C:\\ChoromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		Thread.sleep(2);
		
		driver.findElement(By.id("firstName")).sendKeys("Himanshu");
		System.out.println("Firstname done");
		driver.findElement(By.id("lastName")).sendKeys("Gadekar");
		System.out.println("Lastname done");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("himanshu.gadekar50@gmail.com");
		System.out.println("Email done");
		
		//driver.findElement(By.xpath("//input[@id='gender-radio-1']")).click();
		//System.out.println("Radio button is clicked");
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("6265034085");
		System.out.println("Mobile number done");
		driver.findElement(By.xpath("//*[@id=\"dateOfBirthInput\"]"));
		Thread.sleep(2000);
		Select seM = new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select/option[10]")));
		seM.selectByValue("9");
		System.out.println("month done");
		Select seY = new Select(driver.findElement(By.className("react-datepicker__year-select")));
		seY.selectByValue("1996");
		System.out.println("Year done");
		driver.findElement(By.className("react-datepicker__day react-datepicker__day--015")).click();
		System.out.println("Day done");
		
		

	}

}
