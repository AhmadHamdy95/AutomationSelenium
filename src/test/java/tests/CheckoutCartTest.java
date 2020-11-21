package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.UserRegistrasionPage;

public class CheckoutCartTest extends TestBase {

	HomePage homePageObject;
	LoginPage loginPageObject;
	UserRegistrasionPage userRegistrationObject;
	MyAccountPage MyAccountObject;
	CartPage CartObject; 

	@Test(priority = 1)
	public void LoginWithValidCredentials() {
		homePageObject = new HomePage(driver);
		homePageObject.OpenSignInPage();
		loginPageObject = new LoginPage(driver);
		loginPageObject.Login("ahmad@gmail.com", "2102535");
		MyAccountObject = new MyAccountPage(driver);
		MyAccountObject.UserInfo.isDisplayed();
	}

	@Test(priority = 2)
	public void verifyCartIsEmpty()  {
		CartObject = new CartPage(driver);
		CartObject.Cart.click();
		Assert.assertEquals(CartObject.CartEmpty.getText(), "Your shopping cart is empty.");
	}

	@Test(priority = 3)
	public void CheckoutCartWithOneItem()  {
		Actions action = new Actions(driver);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		CartObject = new CartPage(driver);
		CartObject.Tshirts.click();
		action.moveToElement(CartObject.item).build().perform();
		executor.executeScript("window.scrollBy(0,250)", CartObject.AddToCartButton);
		CartObject.AddToCartButton.click();
		CartObject.procceedBtn.click();
		executor.executeScript("window.scrollBy(0,250)");
		CartObject.procceedBtnSummary.click();
		executor.executeScript("window.scrollBy(0,250)");
		CartObject.procceedBtn_address.click();
		executor.executeScript("window.scrollBy(0,250)");
		CartObject.checkTermsOfServices.click();
		CartObject.procceedBtn_shipping.click();
		executor.executeScript("window.scrollBy(0,100)");
		Assert.assertEquals(CartObject.itemText.getText(), "Faded Short Sleeve T-shirts");
	}

}
