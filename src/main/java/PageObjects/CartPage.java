package PageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

	WebDriver driver;
	 public CartPage(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 
	 By itemincartpage=By.xpath("//a[@class='_2Kn22P gBNbID']");
	 By removeitemfromcart=By.xpath("//div[@class='_3dsJAO' and text()='Remove']");
	 By confirmitemremoval=By.xpath("//div[@class='_3dsJAO _24d-qY FhkMJZ' and text()='Remove']");
	 public WebElement getremoveitemfromcartelement()
	 {
		 return driver.findElement(removeitemfromcart);
	 }
	 
	 public WebElement getconfirmitemremovalelement()
	 {
		 return driver.findElement(confirmitemremoval);
	 }
	 
	 public WebElement getitemincartpageelement()
	 {
		 return driver.findElement(itemincartpage);
	 }
}
