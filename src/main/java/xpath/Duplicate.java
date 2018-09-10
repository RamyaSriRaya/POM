
//duplicate
package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Duplicate {

		public static void main(String[] args) throws InterruptedException {
			
			
			//launch browser
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			
			//get link
			driver.get("http:leaftaps.com/opentaps");
			//time
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			//enter username
			driver.findElementByXPath("//label[@for='username']/following::input").sendKeys("DemoSalesManager");
			//enter password
			driver.findElementByXPath("//p[@class='top']/following::input").sendKeys("crmsfa");
			//enter login
			driver.findElementByXPath("(//p[@class='top']/following::input)[2]").click();
			//click crm/sfa
			driver.findElementByXPath("//div[@id='label']").click();
			//click leads link
			driver.findElementByXPath("(//div[@class='x-panel-header']/..)[2]").click();
			//click find leads
			driver.findElementByXPath("//a[text()='Create Lead']/following::a").click();
			//click on email
			driver.findElementByXPath("//span[text()='Email']").click();
			//enter email
			driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("mramyasri1996@gmail.com");
			//click findleads
					driver.findElementByXPath("//button[text()='Find Leads']").click();
					Thread.sleep(3000);
					//capture first resulting lead
String name=driver.findElementByXPath("//a[text()='Ramyasri']").getText();
System.out.println(name);
//click frst resulting lead
driver.findElementByXPath("//a[text()='Ramyasri']").click();
//click duplicate lead
driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
//verify title as duplicate lead
String title2 = driver.getTitle();
if (title2.contains("Duplicate Lead | opentaps CRM")) {
	System.out.println("Title matches");
} else {
	System.out.println("Title does not matches");
}
//click create lead
driver.findElementByXPath("//input[@value='Create Lead']").click();
//
	String name1=driver.findElementByXPath("//span[text()='Ramyasri']").getText();
	if(name1.contains(name))
	{
		System.out.println("it confirmed");
	}
	driver.close();
	System.out.println("driver closed");
	}
		
		
}
		
