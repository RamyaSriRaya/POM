package testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import excel.ReadExcel;
import wdMethods.SeMethods;

public class ProjectMethods extends SeMethods {
	public String fileName,author,category,testName,description;

	@BeforeSuite(groups="common")
	public void startTestResult() {
		startResult();
	}


	@BeforeClass(groups="common")
	public void beforeclass()
	{
		startTestCase(testName, description);
	}

	@Parameters({"url"})
	@BeforeMethod(groups="common")

	public void login(String url) 
	{
		beforeMethod(author,category);
		startApp("chrome",url);

	}


	@AfterMethod(groups="common")
	public void end()
	{
		closeAllBrowsers(); 
	}


	@AfterSuite(groups="common")
	public void enTestdResult()
	{
		endResult();
	}














	@DataProvider(name="fetchData")
	public String[][] excelData() throws IOException
	{

		ReadExcel excel = new ReadExcel();

		return excel.getData(fileName);

	}
}


