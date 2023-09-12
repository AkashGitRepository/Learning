package pomClass;

import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import readingExcel.ConfedentialData;

public class I_Login extends ConfedentialData{
	
	@FindBy (xpath ="//input[@id='user-name']") 
	 private WebElement userName;
	@FindBy (xpath ="//input[@id='password']") 
	 private WebElement password;
	@FindBy (xpath ="//input[@id='login-button']") 
	 private WebElement login_button;
	
	
	public I_Login (WebDriver driver123) 
	{
		PageFactory.initElements(driver123, this);
	}  
	
		public void clickOnUserName() throws EncryptedDocumentException, IOException
		{
			userName.click(); 
			Random no=new Random();
			int k= no.nextInt(1,3);
			System.out.println(k);
			ConfedentialData e = new ConfedentialData();
			String a =e.firstInput(k);
			System.out.println("Congratualtion baby for Fetch the Excel UserName-"+a);
			userName.sendKeys(a);
		}
		public void clickOnPassword() throws EncryptedDocumentException, IOException
		{
			password.click();
			Random no=new Random();
			int L= no.nextInt(1,2);
			ConfedentialData e = new ConfedentialData();
			String b =e.secondInput(L);
			password.sendKeys(b);
			System.out.println("Congratualtion baby for Fetch the Excel Password-"+b);

		}
		public void clickOnLoginButton()
		{
			login_button.click();
		}
}
