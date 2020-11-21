package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class UserRegistrasionPage extends PageBase
{

	public UserRegistrasionPage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(id="customer_firstname")
	WebElement FirstName;

	@FindBy(id="customer_lastname")
	WebElement LastName;

	@FindBy(id="email")
	WebElement EmailInserted;

	@FindBy(id="passwd")
	WebElement PasswordField;

	@FindBy(id="days")
	WebElement DayOptions;

	@FindBy(id="months")
	WebElement MonthOptions;

	@FindBy(id="years")
	WebElement YearOptions;

	@FindBy(id="company")
	WebElement Company; 

	@FindBy(id="address1")
	WebElement Address1;

	@FindBy(id="city")
	WebElement CityField;

	@FindBy(id="id_state")
	WebElement State;

	@FindBy(id="postcode")
	WebElement PostCode;

	@FindBy(id="id_country")
	WebElement Country;

	@FindBy(id="phone_mobile")
	WebElement PhoneMobile;

	@FindBy(id="alias")
	WebElement AddressAlias;

	@FindBy(id="submitAccount")
	WebElement RegisterButton;

	@FindBy(css = "h1.page-heading")
	WebElement MyAccount;

	public void Register(String Fname, String Lname,String Password,String CompanyName
			,String Address, String City ,String Postalcode,String MobilePhone, String AliasAddress) 
	{
		setTextToElement(FirstName, Fname);
		setTextToElement(LastName, Fname);
		setTextToElement(PasswordField, Password);
		select = new Select(DayOptions); 
		select.selectByIndex(22);
		select = new Select(MonthOptions); 
		select.selectByIndex(1);
		select = new Select(YearOptions); 
		select.selectByIndex(26);
		setTextToElement(Company, CompanyName);
		setTextToElement(Address1, Address);
		setTextToElement(CityField, City);
		select = new Select(State); 
		select.selectByIndex(2);
		setTextToElement(PostCode, Postalcode);
		select = new Select(Country); 
		select.selectByIndex(1);
		setTextToElement(PhoneMobile, MobilePhone);
		setTextToElement(AddressAlias, AliasAddress);
		clickButton(RegisterButton);
	}




}
