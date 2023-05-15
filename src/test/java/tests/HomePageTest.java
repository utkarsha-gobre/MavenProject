package tests;




import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginPage;

public class HomePageTest extends TestBase
{
   LoginPage loginpage;
   HomePage homePage;


@BeforeMethod
public void initialization()
{
	init();
	LoginPage loginpage = new LoginPage();
	homePage =  loginpage.login();	
}

@Test
public void validateUserTest()
{
	homePage.usercheck();
}


@Test
public void logout()
{
	homePage.logout();
}
@Test
public void logocheck()

{
	homePage.logocheck();
}

@Test
public void ValidateCreateContactTest()
{
	homePage.createContact();
}

 @AfterMethod
public void teardown()
{
    driver.close();
}

}
