
package xpath;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification {

	
	public static void main(String[] args) throws InterruptedException {
		//launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//enter URL
		driver.get("http://www.leafground.com/");
		//click edit
		driver.findElementByLinkText("Edit").click();
		// Verification browser
		//get URL 
		
		 String url=driver.getCurrentUrl();
	 	System.out.println(url);
		
	    //get Title
        String title = driver.getTitle();
       	System.out.println(title);		
		//get page Source
       	String pageSource = driver.getPageSource();
	    System.out.println(pageSource);	
	
		//verification element
		
	   //get attribute
	   String attribute= (driver.findElementById("email").getAttribute("style"));
	   System.out.println(attribute);
	   
	   //get CSS color
	   String cssValue = driver.findElementById("email").getCssValue("color");
       System.out.println(cssValue);
       
       //get location
       //System.out.println(driver.findElementById("email").getLocation());
       Point location = driver.findElementById("email").getLocation();
       System.out.println(location);
       
       //get size
       Dimension size = driver.findElementById("email").getSize();
       System.out.println(size);
       
       //tag name
       String tagName = driver.findElementById("email").getTagName();
       System.out.println(tagName);
	
       //is enabled
       System.out.println( driver.findElementById("email").isEnabled());
       System.out.println(driver.findElementByXPath("(//input[@type='text'])[5]").isEnabled());
       
       //is displayed
       System.out.println(driver.findElementById("email").isDisplayed());
   

       driver.close();
       System.out.println("closed");
       
	}
}
