package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Create extends ProjectMethods {

	@BeforeTest()
	public void setData()
	{
		fileName = "Excel";
		author="Ramya";
		category = "smoke";
		testName="CreateLead";
		description="Create  is test file";
	
	}
	
	
	@Test(dataProvider="fetchData")
public void create(String cname,String fname,String lname)
	{
		click(locateElement("partiallinktext", "Create"));
		type(locateElement("id", "createLeadForm_companyName"), cname);
		type(locateElement("id", "createLeadForm_firstName"), fname);
		type(locateElement("id", "createLeadForm_lastName"), lname);

		
	
}
}
