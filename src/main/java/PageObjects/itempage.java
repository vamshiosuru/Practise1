package PageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class itempage {

	WebDriver driver;
	 public itempage(WebDriver driver)
	 {
		 this.driver=driver;
		 Set<String> windows=driver.getWindowHandles();
			Iterator<String> it=windows.iterator();
			String parentid=it.next();
			String childid=it.next();
			driver.switchTo().window(childid);
	 }
	 
	 By productsize=By.id("swatch-1-size");
	 By addtocart=By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww' and text()='ADD TO CART']");
	 By producttitle=By.xpath("//span[@class='B_NuCI']");
	 
	 public WebElement getproductsizeelement()
	 {
		 return driver.findElement(productsize);
	 }
	 public WebElement getproducttileelement()
	 {
		 return driver.findElement(producttitle);
	 }
	 public CartPage getaddtocartelement()
	 {
		 JavascriptExecutor js= (JavascriptExecutor)driver;
		 js.executeScript("window.scroll(0,300)");
	 driver.findElement(addtocart).click();
	 return new CartPage(driver);
	 }
}
