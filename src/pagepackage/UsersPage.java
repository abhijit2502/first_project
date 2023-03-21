package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {

	//declaration for all web element presents on users page
	@FindBy(linkText="users")private WebElement Userstab;
	@FindBy(xpath="//input(@value='Create New User')")private WebElement CreateNewusersButton;
	
	//initialization
	
	public UsersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getUserstab()
	{
		return Userstab;
		
	}
	
	public WebElement getCreateNewuserButton()
	{
		return CreateNewusersButton;
		
	}
	
	
}
