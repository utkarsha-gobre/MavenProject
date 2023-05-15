package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import base.TestBase;

public class LoginPage extends TestBase
{
public LoginPage()
{
	PageFactory.initElements(driver,this);
}


@FindBy(name = "username")
WebElement usernameTxtBox;

@FindBy(name ="password")
WebElement passwordTxtBox;

@FindBy(css = "[type='submit']")
WebElement loginBtn;

@FindBy(xpath = "(//img[@class='img-responsive'])[1]")
WebElement logo;

@FindBy(linkText = "Sign Up")
WebElement signup;

//Actions
public HomePage login()
{
	usernameTxtBox.sendKeys("Speedway2023");
	passwordTxtBox.sendKeys("speedway@2023");
	loginBtn.click();
	
	HomePage object1 = new HomePage();	
	return object1;
}

public boolean logostatus()
{
	boolean logostatus = logo.isDisplayed();
	
	return logostatus;
}

public boolean signup()
{
	boolean status = signup.isDisplayed();
	
	return status;
}


	
}

	

