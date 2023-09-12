package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
	public static WebDriver driver;

	@Parameters("browser")
	@BeforeTest
	public void launchBrowser(String BrowserName) {
		
		if (BrowserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\F-driver\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("BeforeTest Pass & Used this from BaseClass");
		}
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void cleanPOMObject()
	{
		System.out.println("After Class Pass & used this from BaseClass");
	}
	
	@AfterTest
	public void close() {
		driver.close();
		driver.quit();
		System.gc();// delete the unused object 
		System.out.println("After Test Pass & used this from BaseClass");
	}
}
