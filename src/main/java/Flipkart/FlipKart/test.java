package Flipkart.FlipKart;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//pc//Videos//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']//input[@type='text']")).sendKeys("8639741294");
		driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']//input[@type='password']")).sendKeys("123321");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL' and @type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='_3704LK' and @type='text']")).sendKeys("nike shoes");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("//div[@class='_1AtVbE col-12-12']//div[@style='width: 25%;']")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		String itemtitle=driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText().split("\\(")[0].trim();
		
		
		driver.findElement(By.id("swatch-1-size")).click();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww' and text()='ADD TO CART']")).click();
		String cartpageitemtext=driver.findElement(By.xpath("//a[@class='_2Kn22P gBNbID']")).getText();
		System.out.println(cartpageitemtext);
		if(cartpageitemtext.contains(itemtitle))
			System.out.println("item added properly");
		
		driver.findElement(By.xpath("//div[@class='_3dsJAO' and text()='Remove']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_3dsJAO _24d-qY FhkMJZ' and text()='Remove']")).click();
	}

}
