//verify text and isSelected
package xpath;

import org.openqa.selenium.chrome.ChromeDriver;


public class Verification2 {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//enter URL
		driver.get("http://www.leafground.com/");
				
	
		
		
		
		// click checkbox
		driver.findElementByLinkText("Checkbox").click();
		//is selected
		
	System.out.println(driver.findElementByXPath("//input[@type='checkbox']").isSelected());
		
		System.out.println(driver.findElementByXPath("(//input[@type='checkbox'])[6]").isSelected());
		
		driver.close();
		System.out.println("closed");
		
		
		
		/*click hyperlink
		driver.findElementByLinkText("HyperLink");
		 //get text
	       String text = driver.findElementByLinkText("Find where am supposed to go without clicking me?").getText();
	       System.out.println(text);*/	
		
		

	}

}
