
//first day hw and second day class (full program)




package week1.day1;

import java.io.File;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login1 {

	public static void main(String[] args) throws IOException {
		// Launch the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// load url

		driver.get("http:leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
       driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Nive");
        driver.findElementById("createLeadForm_departmentName").sendKeys("EEE");
        driver.findElementById("createLeadForm_lastNameLocal").sendKeys("S");
        driver.findElementById("createLeadForm_numberEmployees").sendKeys("40");
        driver.findElementById("createLeadForm_personalTitle").sendKeys("tamil");
        driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Selenium");
        driver.findElementById("createLeadForm_annualRevenue").sendKeys("1230000");
       driver.findElementById("createLeadForm_sicCode").sendKeys("123");
       driver.findElementById("createLeadForm_tickerSymbol").sendKeys("#");
       driver.findElementById("createLeadForm_description").sendKeys("Selenium is used for web based automated tool");
       driver.findElementById("createLeadForm_importantNote").sendKeys("new version 3.14.0");
       driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("1");
       driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("2");
       driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("5");
       driver.findElementById("createLeadForm_primaryEmail").sendKeys("mramyasri1996@gmail.com");
       driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9442140653");
       driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Babu");
       driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("http://leaftaps.com//opentap");
       driver.findElementById("createLeadForm_generalToName").sendKeys("Ramyasri");
       driver.findElementById("createLeadForm_generalAttnName").sendKeys("Malarvannan");
       driver.findElementById("createLeadForm_generalAddress1").sendKeys("2/A,Ramasamy Lane");
       driver.findElementById("createLeadForm_generalAddress2").sendKeys("pudupalayam");
       driver.findElementById("createLeadForm_generalCity").sendKeys("cuddalore");
       driver.findElementById("createLeadForm_generalPostalCode").sendKeys("607001");
       driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("607010");
     // select by index
       WebElement sra = driver.findElementById("createLeadForm_dataSourceId");
       Select sea = new Select(sra);
       sea.selectByIndex(2);
       
       //select by value
       
       WebElement srb= driver.findElementById("createLeadForm_marketingCampaignId");
       Select seb = new Select(srb);
       seb.selectByValue("CATRQ_AUTOMOBILE");
    	
       //select by visible value
       WebElement src = driver.findElementById("createLeadForm_currencyUomId");
       Select sec = new Select(src);
       sec.selectByVisibleText("AUD - Australian Dollar");
       
       
       
       
       
       //print all option by using for loop
       
       WebElement srd = driver.findElementById("createLeadForm_industryEnumId");
       Select sed = new Select(srd);
        List<WebElement> allOptions = sed.getOptions();
        int count = allOptions.size();
        System.out.println(count);
        for (int i = 0; i < count; i++) {
			System.out.println(allOptions.get(i).getText());
		}
       //print all option using foreach loop
        
        WebElement sre = driver.findElementById("createLeadForm_currencyUomId");
        Select see = new Select(sre);
        List<WebElement> allOption = see.getOptions();
        int count1 = allOption.size();
        System.out.println(count1);
        for (WebElement eachOption : allOption) {
		System.out.println(eachOption.getText());	
		}
        
        //print lastcount
        WebElement srf = driver.findElementById("createLeadForm_industryEnumId");
        Select sef = new Select(srf);
        List<WebElement> allOptionss = sef.getOptions();
        int count2 = allOptionss.size();
        sef.selectByIndex(count2-1);
          
        //sumaaaa
        WebElement srg = driver.findElementById("createLeadForm_ownershipEnumId");
        Select seg = new Select(srg);
        seg.selectByIndex(2);
        
      
        WebElement srh= driver.findElementById("createLeadForm_generalCountryGeoId");
        Select seh = new Select(srh);
        seh.selectByValue("IND");
        
         WebElement sri= driver.findElementById("createLeadForm_generalStateProvinceGeoId");
        Select sei = new Select(sri);
        sei.selectByValue("IN-TN");
        
        
        
       //take snapshot
        File soc = driver.getScreenshotAs(OutputType.FILE);
        File des = new File("./snaps/i1.png");
        FileUtils.copyFile(soc, des);
        //FieUtilscome from apache because Se and java doesn't help
       
       
       
       
       driver.findElementByName("submitButton").click();
      
       //check 
       
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

