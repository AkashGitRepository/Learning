package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class II_product {

	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
	private WebElement bag;
	@FindBy(xpath = "//button[text()='Add to cart']")
	private WebElement addToCart;
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private WebElement orderBucket;

	public II_product(WebDriver driver123) {
		PageFactory.initElements(driver123, this);
	}

	public void clickOnBag() {
		bag.click();
	}

	public void clickOnAddToCart() {
		addToCart.click();
	}

	public void clickOnOrderBucket() {
		orderBucket.click();
	}
	
}
