package xpath;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

		public static void main(String[] args) throws IOException, InterruptedException {
//			launch browser
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			
//			load URL
			driver.navigate().to("http://legacy.crystalcruises.com/");
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			
			
			//click
			driver.findElementByLinkText("GUEST CHECK-IN").click();
			
			
			  //take snapshot
	        File soc = driver.getScreenshotAs(OutputType.FILE);
	        File des = new File("./snaps/i2.png");
	        FileUtils.copyFile(soc, des);
			
			
			
			System.out.println(driver.getTitle());
		
			
			System.out.println("1");
			
			Set<String> allWindow = driver.getWindowHandles();
			  System.out.println(allWindow.size());
			List<String> allList =new ArrayList<String>();
			allList.addAll(allWindow);
			driver.switchTo().window(allList.get(1));
			
			
			System.out.println(driver.getTitle());
			
			System.out.println("2");
			  //take snapshot
	        File soc1 = driver.getScreenshotAs(OutputType.FILE);
	        File des1 = new File("./snaps/i3.png");
	        FileUtils.copyFile(soc1, des1);
	        
	        
	        
	        driver.findElementByPartialLinkText("View Off").click();
	        
	      Set<String> allWindow1 = driver.getWindowHandles();
	        Thread.sleep(10000);
	         
	         System.out.println(allWindow1.size());
	         
			 allList =new ArrayList<String>();
			 allList.addAll(allWindow1);
	        
			 driver.switchTo().window(allList.get(2));
				System.out.println(driver.getTitle());
				
				System.out.println("3");
				//take snapshot
		        File soc2 = driver.getScreenshotAs(OutputType.FILE);
		        File des2 = new File("./snaps/i4.png");
		        FileUtils.copyFile(soc2, des2);
	        
	        
	        
	        
	        
	        
	        
		
	}

}
