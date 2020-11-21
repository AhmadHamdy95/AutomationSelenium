package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;

public class LoginTest extends TestBase
{
	HomePage HomePageObject;
	LoginPage LoginPageObject;
	MyAccountPage  MyAccountPageObject;
	
	@Test(priority = 1)
	public void LoginWithInValidEmail() {
		HomePageObject = new HomePage(driver);
		HomePageObject.OpenSignInPage();
		LoginPageObject = new LoginPage(driver);
		LoginPageObject.Login("ahmad@gmasgail.com", "2102535");
		MyAccountPageObject = new MyAccountPage(driver);
		LoginPageObject.InvalidLoginCredentials.isDisplayed();
	}
	@Test(priority = 2)
	public void LoginWithInValidPassword() {
		HomePageObject = new HomePage(driver);
		HomePageObject.OpenSignInPage();
		LoginPageObject = new LoginPage(driver);
		LoginPageObject.Login("ahmad@gmail.com", "21025asdgsG35");
		MyAccountPageObject = new MyAccountPage(driver);
		LoginPageObject.InvalidLoginCredentials.isDisplayed();
	}
	@Test(priority = 3)
	public void LoginWithValidCredentials() {
		HomePageObject = new HomePage(driver);
		HomePageObject.OpenSignInPage();
		LoginPageObject = new LoginPage(driver);
		LoginPageObject.Login("ahmad@gmail.com", "2102535");
		MyAccountPageObject = new MyAccountPage(driver);
		MyAccountPageObject.UserInfo.isDisplayed();
	}
	@Test
	public void UserSignOut() {
		LoginPageObject= new LoginPage(driver);
		LoginPageObject.SignOut();
	}
}
