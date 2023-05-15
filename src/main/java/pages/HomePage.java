package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage  extends TestBase
{
public void homePage()
{
	PageFactory.initElements(driver,this);

}


//Element Repository
@FindBy(xpath = "/html/body/table[1]/tbody/tr[1]/td/table/tbody/tr/td[1]")
WebElement user;

@FindBy(xpath = "/html/body/table[1]/tbody/tr[2]/td[1]/div/table/tbody/tr/td[4]/a")
WebElement logout;

@FindBy(xpath = "//td[text()='CRMPRO']")
WebElement logo;


@FindBy(xpath = "//a[text()='Contacts']")
WebElement Contact;

@FindBy(xpath = "//a[text()='New Contact']")
WebElement newContact;




//Actions
public  String usercheck()
{
	driver.switchTo().frame("mainpanel");
	String userName = user.getText();
	return userName;	
	
}


public void logout()
{
	driver.switchTo().frame("mainpanel");
	logout.click();
}
public boolean logocheck()
{
	driver.switchTo().frame("mainpanel");
	boolean status = logo.isDisplayed();
	return status;
}

public void createContact()
{
	driver.switchTo().frame("mainpanel");
    Actions act = new Actions(driver);
	act.moveToElement(Contact).build().perform();
    newContact.click();
	
}
}
