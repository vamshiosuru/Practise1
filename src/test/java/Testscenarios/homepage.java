package Testscenarios;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.itempage;
import junit.framework.Assert;
import resources.base;

public class homepage extends base {
	 public static Logger log =LogManager.getLogger(base.class.getName());
	 public WebDriver driver;
	
	@BeforeTest
	public void setup() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	@Test(priority=1)
	public void homepagetitle() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		hp.getphonenumelement().sendKeys("8639741294");
		hp.getpasswordelement().sendKeys("123321");
		hp.loginsubmit();
		log.info("logged in successfully");
		Assert.assertTrue(hp.getloggedinuserelement().isDisplayed());
		/*hp.getsearchboxelement().sendKeys("nike shoes");
		hp.getsearchiconelement().click();
		itempage ip=hp.selectfirstitemdisplayed();*/	
	}
	@Test(priority=2)
	public void homepagelogo() throws InterruptedException
	{
	
		Assert.assertTrue(false);
			
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}
