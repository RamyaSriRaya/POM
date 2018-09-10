package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MergeLead extends ProjectMethods {
	@BeforeTest(groups="common")
	public void setData()
	{
		fileName = "merge";
		author="Ramya";
		category = "smoke";
		testName="MergeLead";
		description="MergeLead is a testcase";
	}

	@Test(groups="Sanity",dataProvider="fetchData")
	public void merge(String fname,String ffname)
	{
		type(locateElement("id", "username"), "DemoSalesmanager");
		type(locateElement("id", "password"), "crmsfa");
		click( locateElement("class", "decorativeSubmit"));
		click(locateElement("linktext", "CRM/SFA"));
		click(locateElement("linktext", "Leads"));
		click(locateElement("linktext", "Merge Leads"));
		click(locateElement("xpath", "//img[@alt='Lookup']"));
		switchToWindow(1);
		System.out.println(driver.getTitle());
		type(locateElement("name", "firstName"), fname);
		click(locateElement("class", "x-btn-text"));
		String aa=getText(locateElement("xpath", "//a[@class='linktext']"));
		System.out.println(aa);	
		clickWithNoSnap( locateElement("xpath", "//a[@class='linktext']"));

		switchToWindow(0);
		click(locateElement("xpath", "(//img[@alt='Lookup'])[2]"));
		switchToWindow(1);
		System.out.println(driver.getTitle());
		type(locateElement("name", "firstName"), ffname);
		click(locateElement("class", "x-btn-text"));





		clickWithNoSnap( locateElement("xpath", "(//a[@class='linktext'])[10]"));
		switchToWindow(0);
		clickWithNoSnap( locateElement("class", "buttonDangerous"));
		acceptAlert();
		switchToWindow(0);
		clickWithNoSnap( locateElement("xpath", "//a[text()='Find Leads']"));
		type(locateElement("name", "id"), aa);
		click(locateElement("xpath", "(//button[@type='button'])[7]"));

	}


}
