package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase
{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="email")
	WebElement LoginMail;
	
	@FindBy(id="passwd")
	WebElement PasswordField;
	
	@FindBy(id="SubmitLogin")
	WebElement Loginutton;
	
	@FindBy(css = "div.alert.alert-danger")
	public WebElement InvalidLoginCredentials;
	
	@FindBy(id ="email_create")
	WebElement RegisterMail;
	
	@FindBy(id="SubmitCreate")
	WebElement CreateButton;
	
	@FindBy(id="create_account_error")
	public WebElement ExistMailValidation; 
	
	@FindBy(xpath="//a[@title='Log me out']")
	WebElement signoutBtn;

	public void createAnAccount(String mail) {
		setTextToElement(RegisterMail, mail);
		clickButton(CreateButton);
	}
	
	public void Login(String Email , String Password) {
		setTextToElement(LoginMail, Email);
		setTextToElement(PasswordField, Password);
		clickButton(Loginutton);
	}
	public void SignOut() {
		clickButton(signoutBtn);
	}
}
