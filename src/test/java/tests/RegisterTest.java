package tests;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.UserRegistrasionPage;

public class RegisterTest extends TestBase {
	HomePage homePageObject;
	LoginPage loginPageObject;
	UserRegistrasionPage userRegistrationObject;
	MyAccountPage MyAccountObject;
	
	// Fake data to be used in test
	Faker FakeData = new Faker();
	String EmailAddress= FakeData.internet().emailAddress();
	String firstname=FakeData.name().firstName();
	String lastname=FakeData.name().lastName();
	String password=FakeData.internet().password();
	String companyName=FakeData.company().name();
	String address=FakeData.address().fullAddress();
	String city=FakeData.address().city();
	//String postalcode=FakeData.address().zipCode();
	//String mobile=FakeData.phoneNumber().phoneNumber();
	String aliasAddress=FakeData.address().cityName();
	
	@Test(priority = 1)
	public void RegisterWithRegisteredMail()   {
		homePageObject= new HomePage(driver);
		homePageObject.OpenSignInPage();
		loginPageObject=new LoginPage(driver);
		loginPageObject.createAnAccount("ahmad@gmail.com");
		loginPageObject.ExistMailValidation.isDisplayed();
	}

	@Test(priority = 2)
	public void RegisterWithValidData()  {
		homePageObject= new HomePage(driver);
		homePageObject.OpenSignInPage();
		loginPageObject=new LoginPage(driver);
		loginPageObject.createAnAccount(EmailAddress);
		userRegistrationObject = new UserRegistrasionPage(driver);
		userRegistrationObject.Register(firstname, lastname, password, companyName, address, city, "12965", "0115989854", aliasAddress);
		MyAccountObject = new MyAccountPage(driver);
		MyAccountObject.MyAccount.isDisplayed();
		//System.out.println(EmailAddress+"  "+password);
	}
	@Test(priority = 3)
	public void UserCanSignOut() {
		loginPageObject=new LoginPage(driver);
		loginPageObject.SignOut();
	}
}
