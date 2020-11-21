package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageBase{

	public CartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath  = "//div[@class='shopping_cart']//a")
	 public WebElement Cart;
	
	@FindBy(xpath = "(//a[@title='T-shirts'])[2]")
	public WebElement Tshirts;
	
	@FindBy(xpath="(//IMG[@class='replace-2x img-responsive'])[2]") 
	public WebElement item;
	
	@FindBy(xpath="//p[@class='product-name']//a[1]")
	public	WebElement itemText;
	
	@FindBy(xpath ="//span[text()='Add to cart']")
	public	WebElement AddToCartButton;
	
	//@FindBy(css="p.alert.alert-warning")
	@FindBy(xpath = "//p[@class='alert alert-warning']")
	public WebElement CartEmpty ;
	
	@FindBy(id="cgv")
	public WebElement checkTermsOfServices;
	
	@FindBy(xpath ="//a[@title='Proceed to checkout']//span[1]")
	public WebElement procceedBtn;
	
	@FindBy(xpath ="(//a[@title='Proceed to checkout']//span)[2]")
	public WebElement procceedBtnSummary;

	@FindBy(xpath ="//span[text()='Proceed to checkout']")
	public WebElement procceedBtn_address;

	@FindBy(xpath ="(//button[@type='submit']//span)[2]")
	public WebElement procceedBtn_shipping;
}
