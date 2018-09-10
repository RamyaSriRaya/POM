package testcases;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnReport {

	
	
public static void main(String[] args) throws IOException {
	//@Beforesuite
	ExtentHtmlReporter html = new  ExtentHtmlReporter("./reports/resut.html");
	html.setAppendExisting(true);
	
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(html);
//@Beforeclass
	ExtentTest test = extent.createTest("TC001_Login", "Login to leaftaps");
	
	//@BeMethods
	
	test.assignAuthor("RamyaSri");
	test.assignCategory("common");
	ExtentTest testData = test.createNode("leads");
	
	//@SeMethods
	
	testData.pass("company name is entered succesfully"
			,MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
	testData.pass("first name is entered succesfully",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
	testData.pass("last name is entered succesfully");
	
	//@AfterSuite
	
	extent.flush();
	
	
	
}	
	


}
