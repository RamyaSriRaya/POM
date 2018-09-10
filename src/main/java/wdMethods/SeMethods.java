package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeMethods extends Report implements WdMethods{
	public int i=1;
	public RemoteWebDriver driver;
	public void startApp(String browser, String url) {

		try {
			if(browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			reportStep("The Browser "+browser+" Launched Successfully","pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			reportStep("The unknown error found","fail");
		}finally {
			takeSnap();
		}

	}


	public WebElement locateElement(String locator, String locValue) {

		try {
			switch(locator) {
			case "id"	 :reportStep("The element is found","pass");
                          return driver.findElementById(locValue);
			case "class" :reportStep("The element is found","pass");
				          return driver.findElementByClassName(locValue);
			case "xpath" : reportStep("The element is found","pass");
			              return driver.findElementByXPath(locValue);
			case "linktext" :reportStep("The element is found","pass");
                          return driver.findElementByLinkText(locValue);
			case "partiallinktext" :reportStep("The element is found","pass");
				          return driver.findElementByPartialLinkText(locValue);
			case "name" :reportStep("The element is found","pass");
			              return driver.findElementByName(locValue);
			case "tagname" : reportStep("The element is found","pass");
				          return driver.findElementByTagName(locValue);
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			reportStep("The element is not found","fail");

		}catch (WebDriverException e) {
			reportStep("The unknown error is  found","fail");
			throw new RuntimeException();
		}finally {
			takeSnap();
		}
		return null;
	}

	@Override
	public WebElement locateElement(String locValue) {

		return null;
	}


	public void type(WebElement ele, String data) {

		try {
			ele.sendKeys(data);
			reportStep("The data "+data+" is Entered Successfully","pass");
		} catch (WebDriverException e) {
			reportStep("The unknown error is  found","fail");
			//throw new RuntimeException();
		}finally {
			takeSnap();
		}

	}


	public void clickWithNoSnap(WebElement ele) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			ele.click();
			reportStep("The Element "+ele+" Clicked Successfully","pass");
		} catch (WebDriverException  e) {
			reportStep("The unknown exception found","fail");
			throw new RuntimeException();
		}

	}


	@Override
	public void click(WebElement ele) {

		try { WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ele));

		ele.click();
		reportStep("The Element "+ele+" Clicked Successfully","pass");
		} catch (NoSuchElementException e) {
			reportStep("The Element not found","fail");
			throw new RuntimeException();
		}
		catch (NotFoundException e) {
			reportStep("The Element not found","fail");
			throw new RuntimeException();

		}
		catch (WebDriverException e) {
			reportStep("The unknown exception found","fail");
			throw new RuntimeException();
		}

		finally {
			takeSnap();
		}
	}
	@Override
	public String getText(WebElement ele) {
		try {
			String sendtext = ele.getText();
			reportStep("The return text is " + sendtext,"pass");
			return sendtext;
		} catch (NoSuchElementException e) {
			reportStep("The Element not found","fail");
			throw new RuntimeException();
		}
		catch (WebDriverException e) {
			reportStep("The unknown exception found","fail");
			throw new RuntimeException();
		}

		finally {
			takeSnap();
		}
	}

	@Override
	public void selectDropDownUsingText(WebElement ele, String value) {
		try {
			Select text = new Select(ele);
			text.selectByValue(value);
			reportStep("The data "+ele+" is Entered Successfully","pass");
		} catch (ElementNotSelectableException e) {
			reportStep("Expected element not selected  found","fail");
			throw new RuntimeException();
		}  catch (NoSuchElementException e) {
			reportStep("Expected element is not present","fail");
			throw new RuntimeException();

		} catch (WebDriverException e) {
			reportStep("The unknown exception found","fail");
			throw new RuntimeException();
		}

		finally {
			takeSnap();
		}
	}
	@Override
	public void selectDropDownUsingVisibleText(WebElement ele, String value) {
		try {
			Select text = new Select(ele);
			text.selectByVisibleText(value);
			reportStep("The data "+ele+" is Entered Successfully","pass");
		}  catch (ElementNotSelectableException e) {
			reportStep("Expected element not selected  found","fail");
			throw new RuntimeException();
		}  catch (NoSuchElementException e) {
			reportStep("Expected element is not present","fail");
			throw new RuntimeException();

		} catch (WebDriverException e) {
			reportStep("The unknown exception found","fail");
			throw new RuntimeException();
		}

		finally {
			takeSnap();
		}
	}

	@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) {

		try {
			Select aa = new Select(ele);
			aa.selectByIndex(index);
			reportStep("The data "+ele+" is Entered Successfully","pass");
		}  catch (ElementNotSelectableException e) {
			reportStep("Expected element not selected  found","fail");
			throw new RuntimeException();
		}  catch (NoSuchElementException e) {
			reportStep("Expected element is not present","fail");
			throw new RuntimeException();

		} catch (WebDriverException e) {
			reportStep("The unknown exception found","fail");
			throw new RuntimeException();
		}

		finally {
			takeSnap();
		}
	}

	@Override
	public boolean verifyTitle(String expectedTitle) {
		try {
			String actualTitle=driver.getTitle();
			if(actualTitle.contains(expectedTitle)) {
				reportStep("the title matched","pass");

				return true;
			}
			else {

				reportStep("The title dismatch","pass");
				return false;
			}
		}catch (ElementNotSelectableException e) {
			reportStep("Expected element not selected  found","fail");
			throw new RuntimeException();
		}  catch (NoSuchElementException e) {
			reportStep("Expected element is not present","fail");
			throw new RuntimeException();

		} catch (WebDriverException e) {
			reportStep("The unknown exception found","fail");
			throw new RuntimeException();
		}

		finally {
			takeSnap();
		}

	}


	@Override
	public void verifyExactText(WebElement ele, String expectedText) {
		try {
			String text=ele.getText();
			if(text.equals(expectedText))
			{
				reportStep("the title"+ele+"is matched","pass");
			}
			else
			{
				reportStep("the title"+ele+"is dismatched","pass");
			}
		}catch (ElementNotSelectableException e) {
			reportStep("Expected element not selected  found","fail");
			throw new RuntimeException();
		}  catch (NoSuchElementException e) {
			reportStep("Expected element is not present","fail");
			throw new RuntimeException();

		} catch (WebDriverException e) {
			reportStep("The unknown exception found","fail");
			throw new RuntimeException();
		}

		finally {
			takeSnap();
		}
	}
	public void verifyExactText(String text, String text1) {
		try {

			if(text.equals(text1))
			{
				reportStep("the title is matched","pass");
			}
			else
			{
				reportStep("the title is dismatched","pass");
			}
		}catch (ElementNotSelectableException e) {
			reportStep("Expected element not selected  found","fail");
			throw new RuntimeException();
		}  catch (NoSuchElementException e) {
			reportStep("Expected element is not present","fail");
			throw new RuntimeException();

		} catch (WebDriverException e) {
			reportStep("The unknown exception found","fail");
			throw new RuntimeException();
		}

		finally {
			takeSnap();
		}

	}

	@Override
	public void verifyPartialText(WebElement ele, String expectedText) {
		try {
			String text=ele.getText();
			if(text.contains(expectedText))
			{
				reportStep("the title"+ele+"is matched","pass");
			}
			else
			{
			reportStep("the title"+ele+"is dismatched","pass");
			}
		}catch (ElementNotSelectableException e) {
			reportStep("Expected element not selected  found","fail");
			throw new RuntimeException();
		}  catch (NoSuchElementException e) {
			reportStep("Expected element is not present","fail");
			throw new RuntimeException();

		} catch (WebDriverException e) {
			reportStep("The unknown exception found","fail");
			throw new RuntimeException();
		}

		finally {
			takeSnap();
		}
	}

	@Override
	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		try {
			String value1 = ele.getAttribute(attribute);
			if(value.equals(value1)) {
				reportStep("the attribute value is exactly matched","pass");	
			}
			else {
				reportStep("the attribute value is not matched","pass");	
			}
		} catch (NoSuchElementException e) {
			    reportStep("Expected element is not present","fail");
			throw new RuntimeException();
		} catch (WebDriverException e) {
			    reportStep("The unknown exception found","fail");
			throw new RuntimeException();
		}

		finally {
			takeSnap();
		}
	}


	@Override
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		try {
			String value1 = ele.getAttribute(attribute);
			if(value.contains(value1)) {
				reportStep("the attribute value is exactly matched","pass");	
			}
			else {
				reportStep("the attribute value is not matched","pass");	
			}
		} catch (NoSuchElementException e) {
			reportStep("Expected element is not present","fail");
			throw new RuntimeException();
		} catch (WebDriverException e) {
			reportStep("The unknown exception found","fail");
			throw new RuntimeException();
		}

		finally {
			takeSnap();
		}
	}

	@Override
	public void verifySelected(WebElement ele) {
		try {
			if(ele.isSelected())
			{
				reportStep("The element is selected","pass");
			}else {
				reportStep("The element is not selected","pass");
			}
		} catch (ElementNotSelectableException e) {
			    reportStep("The element is not selected","fail");
		}
          catch (WebDriverException e) {
			    reportStep("The unknown exception found","fail");
		}
		finally {
			takeSnap();
		}


	}

	@Override
	public void verifyDisplayed(WebElement ele) {
		try {
			if(ele.isDisplayed())
			{
				reportStep("The element is selected","pass");
			}else {
				reportStep("The element is not selected","pass");
			}
		} catch (ElementNotSelectableException e) {
			reportStep("The element is not selected","fail");
		}

		catch (WebDriverException e) {
			reportStep("The unknown exception found","fail");
		}
		finally {
			takeSnap();
		}

	}

	@Override
	public void switchToWindow(int index) {
		try {


			Set<String> allWin = driver.getWindowHandles();
			List<String> allList= new ArrayList<String>();
			allList.addAll(allWin);
			driver.switchTo().window(allList.get(index));
			reportStep("The window is found","pass");

		} catch (NoSuchWindowException e) {
			reportStep("The window is not found","fail");
		}catch (WebDriverException e) {
			reportStep("The unknown exception found","fail");
		}
		finally {
			takeSnap();
		}

	}

	@Override
	public void switchToFrame(WebElement ele) {
		try {
			driver.switchTo().frame(ele);
			reportStep("The frame is found","pass");
		} catch (NoSuchFrameException e) {
			reportStep("The frame is not found","fail");
		}catch (WebDriverException e) {
			reportStep("The unknown exception found","fail");
		}
		finally {
			takeSnap();
		}
	}
	public void switchBackToFrame(WebElement ele)
	{
		try {
			driver.switchTo().defaultContent();
			reportStep("The frame is switched back","pass");
		} catch (NoSuchFrameException e) {
			reportStep("The frame is not found","fail");
		}catch (WebDriverException e) {
			reportStep("The unknown exception found","fail");
		}
		finally {
			takeSnap();
		}
	}


	@Override
	public void acceptAlert() {
		try {

			driver.switchTo().alert().accept();
			reportStep("The alert is present","pass");
		}  catch (NoAlertPresentException e) {
			reportStep("The alert is not present","fail");
		} catch (WebDriverException e) {
			reportStep("The unknown error is occured","fail");
		}
		finally {
			takeSnap();
		}

	}

	@Override
	public void dismissAlert() {
		try {
			driver.switchTo().alert().dismiss();
			reportStep("The alert is present","pass");
		} catch (NoAlertPresentException e) {
			reportStep("The alert is not present","fail");
		} catch (WebDriverException e) {
			reportStep("The unknown error is occured","fail");
		}
		finally {
			takeSnap();
		}

	}

	@Override
	public String getAlertText() {
		try {
			String alertText = driver.switchTo().alert().getText();
			reportStep( "The text from accept" + alertText,"pass");
			return alertText;
		}catch (NoAlertPresentException e) {
			reportStep("The alert is not present","fail");
		} catch (WebDriverException e) {
			reportStep("The unknown error is occured","fail");
		}
		finally {
			takeSnap();
		}return null;

	}

	public void sendAlertText(String text) {
		try {
			driver.switchTo().alert().sendKeys(text);
			reportStep("The text has to send for alert + text","pass");
		} catch (NoAlertPresentException e) {
			reportStep("The alert is not present","fail");
		} catch (WebDriverException e) {
			reportStep("The unknown error is occured","fail");
		}
		finally {
			takeSnap();
		}

	}
	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
        reportStep("IOException","fail");
		}
		i++;
	}

	@Override
	public void closeBrowser() {
		driver.close();
		reportStep("The driver closed","pass");
	}

	@Override
	public void closeAllBrowsers() {
		driver.quit();
		reportStep("The all driver closed","pass");
	}

}
