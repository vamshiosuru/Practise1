package Testscenarios;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.CartPage;
import PageObjects.HomePage;
import PageObjects.itempage;
import junit.framework.Assert;
import resources.base;

public class cartpage extends base
{
	public WebDriver driver;
	@BeforeTest
	public void setup() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	@Test
	public void cartvalidation() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		hp.getphonenumelement().sendKeys("8639741294");
		hp.getpasswordelement().sendKeys("123321");
		hp.loginsubmit();
		hp.getsearchboxelement().sendKeys("nike shoes");
		hp.getsearchiconelement().click();
		itempage ip=hp.selectfirstitemdisplayed();
		String titleinproductpage=ip.getproducttileelement().getText().split("\\(")[0].trim();
		System.out.println(titleinproductpage);
		ip.getproductsizeelement().click();
		CartPage cp=ip.getaddtocartelement();
		String titleincartpage=cp.getitemincartpageelement().getText();
		System.out.println(titleincartpage);
		Assert.assertTrue(titleincartpage.contains(titleinproductpage));
		cp.getremoveitemfromcartelement().click();
		cp.getconfirmitemremovalelement().click();
		
	}
	@AfterTest
	public void teardown()
	{
		//driver.quit();
	}
}
