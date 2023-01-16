package upStoxPOMUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLoginPage {
	//variable declaration(globally)--> no of elements = no of variable
	//1. Data member should be declared globally with access level private using @findBy Annotation
	
	@FindBy(name = "userId") private WebElement userID;
	@FindBy(name = "password") private WebElement password;
	@FindBy(xpath = "//div[text()='Sign into Upstox']") private WebElement signInButton;
	
	//2. Initialize within a constructor with access level public using pagefactory 
	public UpstoxLoginPage(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	}
	
	//3. usage
	public void enterUserName(String un)
	{
	userID.sendKeys(un);
	}
	
	public void enterPassword(String pwd)
	{
	password.sendKeys(pwd);
	}
	
	public void clickOnSignInButton()
	{
	signInButton.click();
	}

}
