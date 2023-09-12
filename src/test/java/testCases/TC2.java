package testCases;

import java.io.File;  
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.BaseClass;
import pomClass.II_product;
import pomClass.I_Login;

public class TC2 extends BaseClass{

	private I_Login login;
	private II_product product;

	@BeforeClass
	public void beforeClass() {
		login = new I_Login(driver);
		product = new II_product(driver);
		System.out.println("@BeforeClass Pass");
	}

	@BeforeMethod
	public void beforeMethod() throws EncryptedDocumentException, IOException {
		login.clickOnUserName();
		login.clickOnPassword();
		login.clickOnLoginButton();
		System.out.println("@T1 Pass");

		product.clickOnBag();
		product.clickOnAddToCart();
		product.clickOnOrderBucket();
		System.out.println("@T2 Pass");

	}

	@Test
	public void checkPlacedProduct() throws IOException {
		String url = driver.getCurrentUrl();
		System.out.println("The url is " + url);
		Assert.assertEquals(url, "https://www.saucedemo.com/cart.html");

		LocalDateTime LDT = LocalDateTime.now();
		String DT = LDT.toString().replace(":", "").replace(" ", "");
		
		TakesScreenshot take = (TakesScreenshot) driver; // (TakesScreenshot) this is casting operator
		File src = take.getScreenshotAs(OutputType.FILE);
		File dest = new File(".//F-Screenshot/Healthcare" + DT + ".png");
		FileHandler.copy(src, dest);
		System.out.println("SS Taken ");
	}

}
