
package testcases;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class CreateLead extends ProjectMethods {

	@BeforeTest(groups="common")
	public void setData()
	{
		fileName = "create";
		author="Ramya";
		category = "smoke";
		testName="CreateLead";
		description="CreateLead is a testcase";

	}

	@Test(groups="Smoke",dataProvider="fetchData")

	public void create(String cname,String fname,String lname,String fnlocal,String deptnameln,String lnlocal,String noemp,String title,String proftitle,
			String anrev,String code,String symbol,String description,String imptnote,String countrycode,String areacode,String phexten,String mail,
			String phno,String ask,String url,String toname,String attnname,String adr1,String adr2,String city,String postalcode,String extpost,String mrt,
			String sor,String currency,String country,String state,String industry, String owner,String verify)

	{
		type(locateElement("id", "username"), "DemoSalesmanager");
		type(locateElement("id", "password"), "crmsfa");
		click( locateElement("class", "decorativeSubmit"));
		click(locateElement("linktext", "CRM/SFA"));
		click(locateElement("linktext", "Leads"));
		click(locateElement("linktext", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), cname);
		type(locateElement("id", "createLeadForm_firstName"), fname);
		type(locateElement("id", "createLeadForm_lastName"), lname);
		type(locateElement("id", "createLeadForm_firstNameLocal"), fnlocal);
		type(locateElement("id", "createLeadForm_departmentName"), deptnameln);
		type(locateElement("id", "createLeadForm_lastNameLocal"), lnlocal);
		type(locateElement("id", "createLeadForm_numberEmployees"), noemp);
		type(locateElement("id", "createLeadForm_personalTitle"), title);
		type(locateElement("id", "createLeadForm_generalProfTitle"), proftitle);
		type(locateElement("id", "createLeadForm_annualRevenue"), anrev);
		type(locateElement("id", "createLeadForm_sicCode"), code);
		type(locateElement("id", "createLeadForm_tickerSymbol"), symbol);
		type(locateElement("id", "createLeadForm_description"), description);
		type(locateElement("id", "createLeadForm_importantNote"), imptnote);
		type(locateElement("id", "createLeadForm_primaryPhoneCountryCode"), countrycode);
		type(locateElement("id", "createLeadForm_primaryPhoneAreaCode"), areacode);
		type(locateElement("id", "createLeadForm_primaryPhoneExtension"), phexten);
		type(locateElement("id", "createLeadForm_primaryEmail"), mail);
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), phno);
		type(locateElement("id", "createLeadForm_primaryPhoneAskForName"), ask);
		type(locateElement("id", "createLeadForm_primaryWebUrl"), url);
		type(locateElement("id", "createLeadForm_generalToName"), toname);
		type(locateElement("id", "createLeadForm_generalAttnName"), attnname);
		type(locateElement("id", "createLeadForm_generalAddress1"), adr1);
		type(locateElement("id", "createLeadForm_generalAddress2"), adr2);
		type(locateElement("id", "createLeadForm_generalCity"), city);
		type(locateElement("id", "createLeadForm_generalPostalCode"), postalcode);
		//int parseInt = Integer.parseInt(postalcode);

		type(locateElement("id", "createLeadForm_generalPostalCodeExt"), extpost);
		selectDropDownUsingText( locateElement("id", "createLeadForm_marketingCampaignId"),mrt );
		selectDropDownUsingText( locateElement("id", "createLeadForm_dataSourceId"), sor);
		selectDropDownUsingVisibleText(locateElement("id", "createLeadForm_currencyUomId"),currency );
		selectDropDownUsingText( locateElement("id", "createLeadForm_generalCountryGeoId"),country );
		selectDropDownUsingText( locateElement("id", "createLeadForm_generalStateProvinceGeoId"),state );
		selectDropDownUsingText( locateElement("id", "createLeadForm_industryEnumId"),industry );
		selectDropDownUsingText( locateElement("id", "createLeadForm_ownershipEnumId"),owner );
		click(locateElement("name", "submitButton"));
		verifyExactText(locateElement("id", "viewLead_firstName_sp"),  verify) ;
		takeSnap();


	}	

}
