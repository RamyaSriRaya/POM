//edit lead
package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Edit {

		public static void main(String[] args) throws InterruptedException {
		//launch browser
System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
//url link
driver.get("http:leaftaps.com/opentaps");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//enter username
driver.findElementByXPath("//label[@for='username']/following::input").sendKeys("DemoSalesManager");
//enter password
driver.findElementByXPath("//p[@class='top']/following::input").sendKeys("crmsfa");
//enter login
driver.findElementByXPath("(//p[@class='top']/following::input)[2]").click();
//click crm/sfa
driver.findElementByXPath("//div[@id='label']").click();
//click leads link
driver.findElementByXPath("(//div[@class='x-panel-header']/..)[2]").click();
//click find leads
driver.findElementByXPath("//a[text()='Create Lead']/following::a").click();
//enter first name
driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Ramyasri");
//click find lead button
driver.findElementByXPath("//button[text()='Find Leads']").click();
Thread.sleep(3000);
//click first resulting load
driver.findElementByXPath("(//a[@class='linktext'])[6]").click();
//verify title
String title=driver.findElementByXPath("//div[@class='x-panel-header sectionHeaderTitle']").getText();
if(title.contains("View Lead"))
{
	System.out.println("Title is matched");
}
//click edit
driver.findElementByXPath("//a[text()='Edit']").click();
//change company name
driver.findElementByXPath("(//input[@name='companyName'])[2]").clear();

driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("Testleaf");
//click update
driver.findElementByXPath("//input[@class='smallSubmit']").click();
//confirm changed name appear
String verify=driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
if(verify.contains("Testleaf"))
{

System.out.println("name changed");

}
//close browser
driver.close();
System.out.println("driver closed");
	}

}
