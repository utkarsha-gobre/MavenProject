package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;

public class LoginPageTest extends TestBase
{
LoginPage loginpage;

@BeforeMethod
public void initialization()
{
	init();
	loginpage = new LoginPage();

}

@Test
public void ValidateLogin()
{
	loginpage.login();
}

@Test
public void LogoTest()
{
	 boolean logostatus = loginpage.logostatus();
	 Assert.assertEquals(logostatus, true);
}

@Test
public void signup()
{
	boolean status = loginpage.signup();
	Assert.assertTrue(status);
}

@AfterMethod

public void tearDown()
{
	driver.close();
}

}
