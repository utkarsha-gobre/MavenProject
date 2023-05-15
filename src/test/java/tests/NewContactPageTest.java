package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginPage;
import pages.NewContactPage;
import utility.ReadData;

public class NewContactPageTest extends TestBase
{
	
	HomePage homepage;
	NewContactPage newcontactpage;
	
	@BeforeMethod
public void initialization()
{
	TestBase.init();
	  LoginPage loginPage = new LoginPage();
	  homepage =  loginPage.login();	
	  newcontactpage = new NewContactPage();
	  
}
	public String[][] passData()
	{
	 return ReadData.TestData();
	}
	
	
	@Test(dataProvider = "ContactName")
	public void ValidateTest(String FirstName,String SurName,String Address)
	{
		newcontactpage.CreateNewContact(FirstName,SurName,Address);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
