  //second day hw




package week1.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @author MOHAN
 *
 */
public class hw2 {

	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		//Launch URL
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		//click
		driver.findElementByLinkText("Drop down").click();
		
		
		//select by index
		WebElement  ab = driver.findElementById("dropdown1");
		Select cd = new Select(ab);
		cd.selectByIndex(2);

		
		
		//		select by text
	    WebElement ef = driver.findElementByName("dropdown2");
		Select gh = new Select(ef);
		gh.selectByIndex(2);
 
		
		//select by value
		WebElement ij = driver.findElementById("dropdown3");
		Select kl = new Select(ij);
		kl.selectByValue("3");
		
		
		//get the number of dropdown 
		
		WebElement mn = driver.findElementByClassName("dropdown");
		Select op = new Select(mn);
	
		 List<WebElement> allOptions = op.getOptions();
		 int count=allOptions.size();
		 System.out.println(count);
		 op.selectByIndex(2);
		
		 //using send keys
		 
		driver.findElementByXPath("//option[text()='You can also use sendKeys to select']/..").sendKeys("Selenium");
			
		
		//driver.findElementByXPath("//img[@alt='ListBox']").click();
		WebElement sel = driver.findElementByXPath("(//div[@class='example']/select)[6]");
		Select sele = new Select(sel);
		sele.selectByVisibleText("Selenium");
		sele.selectByVisibleText("Appium");
		sele.selectByVisibleText("UFT/QTP");
		driver.close();
		System.out.println("driver closed");
		
		
		
		
		
		
		
	}
}
