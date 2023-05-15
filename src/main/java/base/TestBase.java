package base;                                                                                                                                                                                     

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase
{
public static WebDriver driver;

public static void init()
{
   
   driver = new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
   
	driver.get("https://classic.freecrm.com/index.html");
}
}
