package SeleniumPack;

import java.util.List;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;
import java.time.Duration;
import java.util.Iterator;

public class Window_handle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "C:\\ChoromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		
//		String windowID = driver.getWindowHandle();
//		System.out.println(windowID);
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIDs = driver.getWindowHandles();
		
//		// Using Iterator
//		Iterator<String> it = windowIDs.iterator();
//		String parentID = it.next();
//		String childID = it.next();
//		System.out.println("Parent ID = " +parentID);
//		System.out.println("Child Id = "+childID);
		
		// Another method via Arraylist
		
		List<String> WindowsIDlist = new ArrayList(windowIDs);
		String parentID = WindowsIDlist.get(0);
		String childID = WindowsIDlist.get(1);
		System.out.println("Parent ID = " +parentID);
		System.out.println("Child Id = "+childID);
		
		
		driver.switchTo().window(parentID);
		System.out.println("Parent window title: "+ driver.getTitle());
		
		driver.switchTo().window(childID);
		System.out.println("child window title: "+ driver.getTitle());
		
		
		
		
		driver.quit();
		
	}

}
