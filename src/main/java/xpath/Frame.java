package xpath;

import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

		public static void main(String[] args) throws InterruptedException {
		
//			launch browser
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			
//			load URL
			driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
			
			// first close 
			driver.findElementByXPath("(//button[text()='Close Me'])[1]").click();
			System.out.println("it closed1");

			//enter frame
			driver.switchTo().frame("childIframe");
			Thread.sleep(3000);
			driver.findElementByXPath("(//button[text()='Close Me'])[1]").click();
			System.out.println("it closed3");			

			driver.switchTo().defaultContent();
			
			//main HTML
			driver.findElementByXPath("(//button[text()='Close Me'])[2]").click();
			System.out.println("it closed2");
		
			//enter frame
			driver.switchTo().frame("childIframe");
						
			driver.findElementByXPath("(//button[text()='Close Me'])[2]").click();
			System.out.println("it closed4");
			driver.switchTo().defaultContent();
			
			//browser close
			driver.close();
			System.out.println("browser closed");
			
			
			
		
		}
}
