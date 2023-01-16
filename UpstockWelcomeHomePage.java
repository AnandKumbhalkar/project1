package upStoxPOMUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstockWelcomeHomePage {
	//variable declaration
	@FindBy(xpath = "//div[text()='No, I’m good']") private WebElement noIamGoodButton;
	
	//
	public UpstockWelcomeHomePage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	//
	public void clickOnNoIamGoodButton()
	{
	noIamGoodButton.click();
	}
}
