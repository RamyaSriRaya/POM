
package week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WinHanHw {
	static Actions builder;
	static ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.indeed.co.in/Fresher-jobs");

	
	 List<WebElement> job = driver.findElementsByXPath("//*[@data-tn-element= 'jobTitle']");
	System.out.println(job.size());

//	WebElement ele = driver.findElementByXPath("//a[@data-tn-element='jobTitle']");

 	//builder.sendKeys(Keys.CONTROL).click(first).perform();
	builder= new Actions(driver);
	for (WebElement each : job) {
		builder.sendKeys(each, Keys.CONTROL).click(each).perform();
		window(1);
		System.out.println(driver.getTitle());
		System.out.println("");
		Thread.sleep(2000);
		driver.close();
		window(0);
			}
	//driver.quit();
	
	}
	
	public static void  window(int index) throws InterruptedException {
		Set<String> allWin = driver.getWindowHandles();
		List<String> allList= new ArrayList<String>();
		allList.addAll(allWin);
		driver.switchTo().window(allList.get(index));
	}

}
