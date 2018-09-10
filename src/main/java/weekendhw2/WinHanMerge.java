package weekendhw2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WinHanMerge {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http:leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
	
		//from lead
		driver.findElementByXPath("//img[@alt='Lookup']").click();
	
		//window tap
		Set<String> allWin = driver.getWindowHandles();
		List<String> allList= new ArrayList<String>();
		allList.addAll(allWin);
		driver.switchTo().window(allList.get(1));
		System.out.println(driver.getTitle());
		driver.findElementByName("firstName").sendKeys("Ramyasri");
		driver.findElementByClassName("x-btn-text").click();
		Thread.sleep(3000);
	    String frstres = driver.findElementByXPath("//a[@class='linktext']").getText();	
	    System.out.println(frstres);
	    driver.findElementByXPath("//a[@class='linktext']").click();
	    
	    allWin = driver.getWindowHandles();
	    allList= new ArrayList<String>();
		allList.addAll(allWin);
		driver.switchTo().window(allList.get(0));
        driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();  
  
        allWin = driver.getWindowHandles();
		allList= new ArrayList<String>();
		allList.addAll(allWin);
		driver.switchTo().window(allList.get(1));
		System.out.println(driver.getTitle());
		driver.findElementByName("firstName").sendKeys("Ramyasri");
	    driver.findElementByClassName("x-btn-text").click();
	    Thread.sleep(3000);
	    
	    String secres = driver.findElementByXPath("(//a[@class='linktext'])[6]").getText();
	    System.out.println(secres);
	    driver.findElementByXPath("(//a[@class='linktext'])[6]").click();
	    allWin = driver.getWindowHandles();
	    allList= new ArrayList<String>();
		allList.addAll(allWin);
		driver.switchTo().window(allList.get(0));
	    driver.findElementByClassName("buttonDangerous").click();
	    driver.switchTo().alert().accept();
	    allWin = driver.getWindowHandles();
	    allList= new ArrayList<String>();
		allList.addAll(allWin);
		driver.switchTo().window(allList.get(0));
	    driver.findElementByXPath("//a[text()='Find Leads']").click();
	    driver.findElementByName("id").sendKeys(frstres);
	    driver.findElementByXPath("(//button[@type='button'])[7]").click();
	    
	    driver.close();
	    System.out.println("it closed");
	    
	    
	    
	    
	    
	    
	
	}

		

}







