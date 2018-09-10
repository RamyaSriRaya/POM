package wdMethods;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Report {
	public static ExtentReports extent;
	 public static ExtentTest test,testData;
	
	//@BS
	
	public void startResult()
	{
		ExtentHtmlReporter html = new  ExtentHtmlReporter("./reports/resut.html");
		html.setAppendExisting(true);
		
		 extent = new ExtentReports();
		extent.attachReporter(html);
		}
	  
	//@SE
	public void reportStep(String stepdesc,String status){
	
		if(status.equalsIgnoreCase("pass")) {
	
			testData.pass(stepdesc);
	}   
		else if(status.equalsIgnoreCase("fail")) {
	
			testData.fail(stepdesc);
	}
	}
	
	//@BC
	public void startTestCase(String testName,String description)
	
	{
		test = extent.createTest(testName, description);
	
	}
	//@BM
	public void beforeMethod(String author,String category)
	{
		testData = test.createNode("leads");
		test.assignAuthor(author);
		test.assignCategory(category);
		
	}
	//@AM
	public void endResult()
	{
		extent.flush();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
