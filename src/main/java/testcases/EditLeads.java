
package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EditLeads extends ProjectMethods {
	@BeforeTest(groups="common")
	public void setData()
	{
		fileName = "edit";
		author="Ramya";
		category = "smoke";
		testName="EditLead";
		description="EditLead is a testcase";
	}


	@Test(groups="Smoke",dataProvider="fetchData")
	public void edit(String name,String cname) throws InterruptedException
	{
		type(locateElement("id", "username"), "DemoSalesmanager");
		type(locateElement("id", "password"), "crmsfa");
		click( locateElement("class", "decorativeSubmit"));
		click(locateElement("linktext", "CRM/SFA"));
		click(locateElement("linktext", "Leads"));
		click(locateElement("linktext", "Find Leads"));
		type(locateElement("xpath", "(//input[@name='firstName'])[3]"), name);
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(3000);
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		verifyTitle( "View Lead");
		click(locateElement("xpath", "(//a[@class='subMenuButton'])[3]"));
		locateElement("id", "updateLeadForm_companyName").clear();
		type(locateElement("id", "updateLeadForm_companyName"), cname);
		click(locateElement("xpath", "//input[@class='smallSubmit']"));
		verifyPartialText( locateElement("id", "viewLead_companyName_sp"),  "test");
	
	}
}
