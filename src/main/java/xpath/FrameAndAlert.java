
package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAndAlert {

		public static void main(String[] args) throws InterruptedException {
			
			//launch browser
			System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			//URL link
			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
						//enter frame

			driver.switchTo().frame("iframeResult");
			Thread.sleep(3000);
			//do action
            driver.findElementByXPath("//button[text()='Try it']").click();
            String get=driver.switchTo().alert().getText();
System.out.println(get);
driver.switchTo().alert().sendKeys("RamyaSri");
driver.switchTo().alert().accept();
			
			
			
			
			
		
	}

}
