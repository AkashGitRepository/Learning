package testCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert; 
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.BaseClass;
import pomClass.I_Login;

public class TC1 extends BaseClass {
	
	private I_Login login;
	
	@BeforeClass
	public void beforeClass()
	{
		login = new I_Login(driver);
	}
	@BeforeMethod
	public void beforeMethod() throws EncryptedDocumentException, IOException {
		System.out.println("Before Method Started Here");
		login.clickOnUserName();
		login.clickOnPassword();
		login.clickOnLoginButton();
		System.out.println("Before Method Pass");
	}
	@Test
	public void testLoginButton() throws InterruptedException
	{
		System.out.println("Test Method Started Here");
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Swag Labs");
		System.out.println("Test Method Pass");
	}
	
}
