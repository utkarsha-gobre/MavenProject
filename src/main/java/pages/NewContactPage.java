package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class NewContactPage extends TestBase
{
	public void contactPage()
	{
		PageFactory.initElements(driver, this);	
	}
//Element Repository
	
	@FindBy(id = "first_name")
	WebElement firstname;
	
	
	@FindBy(id = "surname")
	WebElement surname;
	
	@FindBy(name="address_title")
	WebElement address;
	
	
	@FindBy(xpath = "/html/body/table[1]/tbody/tr[3]/td/div[4]/fieldset/div[2]/table/tbody/tr[4]/td/input")
	WebElement saveBtn;
	
	
	//Actions
	
	public void CreateNewContact(String FN,String SR,String AD)
	{
		firstname.sendKeys(FN);
		surname.sendKeys(SR);
		address.sendKeys(AD);
		saveBtn.click();
	}


		
	}

