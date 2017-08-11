package simplejavaproj;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test33 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("bwsr opened");
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.guru99.com/handling-cookies-selenium-webdriver.html");
		Thread.sleep(3000);
		driver.quit();
		
		 
	}

}
