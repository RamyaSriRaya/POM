//flipkart and jqueryui
package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	/*	
		driver.get("https://www.flipkart.com/");
		driver.findElementByXPath("//button[text()='✕']").click();
				  WebElement eleElec = driver.findElementByXPath("//span[text()='Electronics']");
		WebElement eleoppo = driver.findElementByXPath("//a[text()='OPPO']");		
		Actions builder = new Actions(driver);
		builder.moveToElement(eleElec).pause(2000).click(eleoppo).perform();
		
		//WebDriver wait = new 
		

*/		
/*	driver.get("https://jqueryui.com/draggable/");
	
	//case 1
	
	driver.switchTo().frame(0);
		
		WebElement drag = driver.findElementById("draggable");
		int aa= driver.findElementById("draggable").getLocation().getX();
		int bb = driver.findElementById("draggable").getLocation().getY();
		
		System.out.println(aa +"and"+ bb);
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(drag, 50, 90).perform();
		
	*/
	//case 2
	/*driver.get("https://jqueryui.com/selectable/");
	
		driver.switchTo().frame(0);
		WebElement aa = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement bb = driver.findElementByXPath("//li[text()='Item 3']");
		WebElement cc = driver.findElementByXPath("//li[text()='Item 5']");
		WebElement dd = driver.findElementByXPath("//li[text()='Item 7']");
		
		Actions builder = new Actions(driver);
		builder.sendKeys(aa, Keys.CONTROL).click(bb).click(cc).click(dd).perform();
		*/
		
		//case 3
		driver.get("https://jqueryui.com/sortable/");
		driver.switchTo().frame(0);
		WebElement ele1 = driver.findElementByXPath("//li[text()='Item 1']");
		
		 WebElement ele2 = driver.findElementByXPath("//li[text()='Item 4']");
		 Actions builder = new Actions(driver);
		 int y=ele2.getLocation().getY();
		 builder.dragAndDropBy(ele1, 0, y).release().perform();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
