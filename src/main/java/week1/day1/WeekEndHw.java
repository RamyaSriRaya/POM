package week1.day1;
//duplicate

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WeekEndHw {

	public static void main(String[] args) throws InterruptedException 
	{
	//launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//get link
		driver.get("http:leaftaps.com/opentaps");
		//time
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//username
driver.findElementById("username").sendKeys("DemoSalesManager");
//password
driver.findElementById("password").sendKeys("crmsfa");
//click login
driver.findElementByClassName("decorativeSubmit").click();
//click crm/sfa
driver.findElementByLinkText("CRM/SFA").click();
//click leads
driver.findElementByLinkText("Leads").click();
//click find leads
driver.findElementByLinkText("Find Leads").click();
//click email
driver.findElementByLinkText("Email").click();
//enter email
driver.findElementByName("emailAddress").sendKeys("mramyasri1996@gmail.com");
//click findleadbutton
driver.findElementByXPath("//button[text()='Find Leads']").click();
Thread.sleep(3000);
//capture first resulting lead
String name = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a").getText();
System.out.println(name);

//click first resulting load
driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a").click();
//click click duplicate lead

driver.findElementByXPath("//a[@class='subMenuButton']").click();
//verify  title as duplicate lead
String title2 = driver.getTitle();
if (title2.contains("Duplicate Lead | opentaps CRM")) {
	System.out.println("Title matches");
} else {
	System.out.println("Title does not matches");
}
//click create lead
driver.findElementByName("submitButton").click();
//confirm duplicate and first name
String name1=driver.findElementById("viewLead_firstName_sp").getText();
System.out.println(name1);
if(name==name1)
{
	System.out.println("it confirmed");
}
//click close
driver.close();
System.out.println("it closed");



	}

}
