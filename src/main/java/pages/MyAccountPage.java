package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage  extends PageBase {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "h1.page-heading")
	public 	WebElement MyAccount;
	
	@FindBy(css="div.header_user_info")
	public WebElement UserInfo;
	



}
