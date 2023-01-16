package upStoxPOMUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxPasscodePage {
	@FindBy (name = "yob") private WebElement passcode;
	
	public UpstoxPasscodePage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	public void sendPasscode(String passcd)
	{
	passcode.sendKeys(passcd);
	}

}
