
//first day in  class



package week1.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// Launch the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// load url

		driver.get("http:leaftaps.com/opentaps");
		// enter user name
		driver.findElementById("username").sendKeys("DemoSalesManager");
		// enter password
		driver.findElementById("password").sendKeys("crmsfa");

		// click login button
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
        driver.findElementByPartialLinkText("Create").click();
	   driver.findElementById("createLeadForm_companyName").sendKeys("Testleaf");
		 driver.findElementById("createLeadForm_firstName").sendKeys("Ramyasri");
		 driver.findElementById("createLeadForm_lastName").sendKeys("M");
         driver.findElementByName("submitButton").click();
        String firstName=driver.findElementById("viewLead_firstName_sp").getText();
        if(firstName.equals("Ramyasri"))
        {
        	System.out.println("firstName is matched");
        }
        else
        {
        	System.out.println("first name is not matched");
        }
        
		// click logout button

	}

}
