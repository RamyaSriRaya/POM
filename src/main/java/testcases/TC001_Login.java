package testcases;

import org.testng.annotations.Test;

public class TC001_Login extends ProjectMethods{
	@Test
	
	public void login() {
		
		type(locateElement("id", "createLeadForm_companyName"), "Testleaf");
		type(locateElement("id", "createLeadForm_firstName"), "Ramyasri");
		type(locateElement("id", "createLeadForm_lastName"), "M");
		click(locateElement("name", "submitButton"));
	}	
		
		
		
		
		
		
		
		
		
	}











