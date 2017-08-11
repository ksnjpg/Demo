package simplejavaproj;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Demo_extentreport {
	static ExtentTest logger;
	@Test
	public static void simple() throws InterruptedException {
		ExtentReports report=new ExtentReports("D:\\Selenium Reports\\demo.html");
		report.startTest("test-- verify fb title");
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		logger.log(LogStatus.INFO,"browser strtd");
	
		driver.get("https://www.facebook.com/");
		logger.log(LogStatus.INFO,"url opened");
		Thread.sleep(3000);
		
		String title=driver.getTitle();
		Assert.assertTrue(title.contains("facebook"));
		logger.log(LogStatus.PASS, "title verification done and passed");
		
		
			
		}
		
}
