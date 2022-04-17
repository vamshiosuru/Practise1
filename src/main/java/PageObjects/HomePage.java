package PageObjects;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;
	
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	By loggedinuser=By.xpath("//div[@class='exehdJ' and text()='Vamshi Krishna']");
	By searchicon=By.xpath("//button[@class='L0Z3Pu']");
	By searchbox=By.xpath("//input[@class='_3704LK' and @type='text']");
	By phonenum=By.xpath("//div[@class='IiD88i _351hSN']//input[@type='text']");
	By password=By.xpath("//div[@class='IiD88i _351hSN']//input[@type='password']");
	By loginbtn=By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL' and @type='submit']");
	By firstitem=By.xpath("//div[@class='_1AtVbE col-12-12']//div[@style='width: 25%;']");
	
	public itempage selectfirstitemdisplayed()
	{
		 driver.findElement(firstitem).click();
		 return new itempage(driver);
	}
	public WebElement getloggedinuserelement()
	{
		return driver.findElement(loggedinuser);
	}
	
	public WebElement getsearchiconelement()
	{
		return driver.findElement(searchicon);
	}
	public WebElement getsearchboxelement()
	{
		return driver.findElement(searchbox);
	}
	public WebElement getphonenumelement()
	{
		return driver.findElement(phonenum);
	}
	public WebElement getpasswordelement()
	{
		return driver.findElement(password);
	}
	public void loginsubmit() throws InterruptedException
	{
		 driver.findElement(loginbtn).click();
		 //Thread.sleep(3000);
		
				WebDriverWait w= new  WebDriverWait(driver, 1);
				 w.until(ExpectedConditions.invisibilityOfElementLocated(loginbtn));	
	}

}
