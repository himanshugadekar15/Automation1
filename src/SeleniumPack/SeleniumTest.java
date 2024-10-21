package SeleniumPack;



import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class SeleniumTest {

	
	

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver" , "C:\\ChoromeDriver\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		String PageTitle = driver.getTitle();
		//Assert.assertEquals("Google" , PageTitle);
		System.out.println("Title of the page : " +PageTitle);
		String PageURL = driver.getCurrentUrl();
		System.out.println("Current Page URL is : " +PageURL);
		//String PageSource = driver.getPageSource();
		//System.out.println("Page source :"+PageSource);
		//driver.navigate().to("https://www.facebook.com/");
		//driver.navigate().forward();
		//driver.navigate().back();
		//driver.navigate().refresh();
		//		WebElement username = driver.findElement(By.xpath("//input[@class = 'gLFyf gsfi']")); 
		//		username.sendKeys("Himanshu Gadekar");
		
		
		//		boolean Dstatus = username.isDisplayed();
		//		boolean Estatus = username.isEnabled();
		//		boolean Select_status = username.isSelected();
		//		if(Dstatus)
		//		{
		//			System.out.println("Element is displayed");
		//		}
		//		if(Estatus)
		//		{
		//			System.out.println("Element is in Enabled state");
		//		}
		//		if(Select_status)
		//		{
		//			System.out.println("Element is selected");
		//		}
		//		else
		//		{
		//			System.out.println("Element is not selected");
		//		}
		//		
		//		//getTagName will return tag 
		//getAttribute (By.id("Submitbutton") will return Submitbutton
		//getSize() will return dimention
		//getLocation
		
//		List<WebElement> list = driver.findElements(By.tagName("input"));
//		System.out.println("Number of input tag : "+list.size());
//		System.out.println(list);
		
		
		
		
		//String text = username.getText();
		//System.out.println("Entered Text :"+text);
		//Thread.sleep(2000);
		//Webelements command ex:
		//FindElements radiobutton checkbox dropdown WebTable
		//Thread.sleep(3000);
		//username.clear();
		
		Select se = new Select(driver.findElement(By.id("oldSelectMenu")));
		//how to check if dropdown is multiselect - isMultiple
		//how to get options from drop down - getOptions()
		
		List<WebElement> lst = se.getOptions();

        //Looping through the options and printing dropdown options
        System.out.println("The dropdown options are:");
        
        for(WebElement options: lst)
            System.out.println(options.getText());
		
		//File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OuputType.FILE);
        //FileUtils.copyfile(screenshot , new file("path"));
        
		//driver.close();
		
        //how do you read data from excel
//        
//        FileInputStream fis = new FileInputStream("excel path");
//        Workbook wb = WorkbookFactory.create(fis); 
//        Sheet s = wb.getSheet("name of sheet");
//        String value = s.getRow(rowNum).getCell(cellNum).getStringCellValue();
//        sop(value);
        
        
        
        
        
        
        
		
		
	}
}
