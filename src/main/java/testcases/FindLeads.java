/**
 * 
 */
package testcases;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods; 

public class FindLeads extends SeMethods {
    @Test
	public void find() throws InterruptedException
	{
    	type(locateElement("id", "username"), "DemoSalesmanager");
		type(locateElement("id", "password"), "crmsfa");
		click( locateElement("class", "decorativeSubmit"));
		click(locateElement("linktext", "CRM/SFA"));
		click(locateElement("linktext", "Leads"));
		
		click(locateElement("linktext", "Find Leads"));
		
		WebElement firstname = locateElement("xpath", "(//input[@name='firstName'])[3]");
	    type(firstname,"Ramyasri");
	    
		WebElement cfindleads = locateElement("xpath", "//button[text()='Find Leads']");
	    click(cfindleads);
	   
	     
	    
	   // Thread.sleep(3000);
	    
	    WebElement cleres = locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
	    click( cleres);
	   
	
	   
	   verifyTitle("View Lead") ;
	
	 
	   
	   
	   
	   
	   
	   
	}
    }
