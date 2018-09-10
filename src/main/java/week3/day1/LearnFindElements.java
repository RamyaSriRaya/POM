
package week3.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFindElements {

	public static void main(String[] args) 

	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
   /*driver.get(www.google.com);
        driver.findElementByName("q").sendKeys("Ramya Sri", Keys.ENTER);*/
        
        /*    driver.get("https://www.google.co.in/search?q=RamyaSri&rlz=1C1CHBD_enIN787IN787&oq=RamyaSri&aqs=chrome..69i57j0l5.5715j0j7&sourceid=chrome&ie=UTF-8");
	   List<WebElement> allLink = driver.findElementsByPartialLinkText("Ramya Sri");
	   System.out.println(allLink.size());
	  // allLink.get(0).click();
	   for (WebElement link : allLink) {
		   Thread.sleep(10000);
		   System.out.println(link.getText());
	*/
        
        
        driver.get("https://www.google.co.in/search?rlz=1C1CHBD_enIN787IN787&ei=LEZ6W9CIHsv0vgS9yp2oAQ&q=cricket&oq=cricket&gs_l=psy-ab.3..0i71k1l8.0.0.0.8964.0.0.0.0.0.0.0.0..0.0....0...1..64.psy-ab..0.0.0....0.cMZAoEisqag");
		List<WebElement> cric = driver.findElementsByPartialLinkText("cricket");
		int a =cric.size();
		System.out.println(cric.size());
		List<WebElement> cric1 = driver.findElementsByPartialLinkText("Cricket");
		System.out.println(cric1.size());
		int b =cric1.size();
		int c;
		c=a+b;
		System.out.println(c);
		
		
		
	}
	
	
	
	}


