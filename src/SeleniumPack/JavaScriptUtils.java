package SeleniumPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
public class JavaScriptUtils {

	public static void drowBorder(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);
		
	}
	
	public static String gettitle(WebDriver driver) 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String str = js.executeScript("return document.title").toString();
		return str;
	}
	
	public static void click(WebElement element2, WebDriver driver) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element2);
	}
	
	public static void alert(WebDriver driver,String message)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('"+message+"')");
	}
	
	
	
	
}
