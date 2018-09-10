package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DuplicateLead extends ProjectMethods {
	@BeforeTest(groups="common")
	public void setData()
	{
		fileName = "duplicate";
		author="Ramya";
		category = "smoke";
		testName="DuplicateLead";
		description="DuplicateLead is a testcase";

	}




	@Test(groups="Sanity",dataProvider="fetchData")
	public void duplicate(String mail) throws InterruptedException
	{
		type(locateElement("id", "username"), "DemoSalesmanager");
		type(locateElement("id", "password"), "crmsfa");
		click( locateElement("class", "decorativeSubmit"));
		click(locateElement("linktext", "CRM/SFA"));
		click(locateElement("linktext", "Leads"));
		click(locateElement("linktext", "Find Leads"));
		click(locateElement("linktext", "Email"));
		type(locateElement("name", "emailAddress"), mail);
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(3000);
		String aa=	getText(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
		System.out.println(aa);
		click(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
		click(locateElement("xpath", "//a[@class='subMenuButton']"));
		verifyTitle( "Duplicate Lead | opentaps CRM");
		click(locateElement("name", "submitButton"));
		String aa1=	getText(locateElement("id","viewLead_firstName_sp"));
		System.out.println(aa1);
		verifyExactText(aa, aa1);




	}

}
