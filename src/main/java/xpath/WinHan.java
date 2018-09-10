/**
 * 
 */
package xpath;

/**
 * @author MOHAN
 *
 */	import java.util.ArrayList;
	import java.util.List;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.chrome.ChromeDriver;


public class WinHan {

	
			
			public static void main(String[] args) throws InterruptedException
			 {
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://legacy.crystalcruises.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				Thread.sleep(3000);
				driver.findElementByLinkText("GUEST CHECK-IN").click();
				System.out.println( driver.getTitle());
				Set<String> allwin = driver.getWindowHandles();
				List<String>allist=new ArrayList<String>();
				allist.addAll(allwin);
				driver.switchTo().window(allist.get(1));
				System.out.println(driver.getTitle());
				Thread.sleep(3000);
				driver.findElementByPartialLinkText("View Off").click();
				//save again the window ref using set
				allwin=driver.getWindowHandles();
				allist=new ArrayList<String>();
				allist.addAll(allwin);
				driver.switchTo().window(allist.get(2));
				System.out.println(driver.getTitle());
				

			

			
		}
			



	}


