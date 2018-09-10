package week1.day1;
//edit

import org.openqa.selenium.chrome.ChromeDriver;

public class WeekEndHw2 {

	public static void main(String[] args) throws InterruptedException 
	{
	//launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//get link
		driver.get("http:leaftaps.com/opentaps");

		//enter username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//enter password
driver.findElementById("password").sendKeys("crmsfa");
//click login
driver.findElementByClassName("decorativeSubmit").click();
//click crm/sfa link
driver.findElementByLinkText("CRM/SFA").click();
//click leads link
driver.findElementByLinkText("Leads").click();
//click find leads
driver.findElementByLinkText("Find Leads").click();


//enter first name
driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Ramyasri");

//click find lead button	
driver.findElementByXPath("//button[text()='Find Leads']").click();
//click on first resulting lead
Thread.sleep(3000);
	driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
	//verify title
	String title = driver.getTitle();
	System.out.println(title);
	if(title.contains("View Lead")) {
		System.out.println("Title verified");
	}
	//click edit
	driver.findElementByXPath("(//a[@class='subMenuButton'])[3]").click();
	//change company name
	driver.findElementById("updateLeadForm_companyName").clear();
	driver.findElementById("updateLeadForm_companyName").sendKeys("test");
	//click update
	driver.findElementByXPath("//input[@class='smallSubmit']").click();
	//view changed name appears
	 String companyName=driver.findElementById("viewLead_companyName_sp").getText();
     System.out.println(companyName);
     //if(companyName.contains("test"));
     
     //close browser
     driver.close();
     System.out.println("closed");
    
	
	
	}

}
