package BasicMockTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.crm.BaseClass.DwsBaseClass;



public class TestCase1 extends DwsBaseClass {
	@Test
	public void TestScript1() throws InterruptedException {
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='$25 Virtual Gift Card']")).click();
		driver.findElement(By.xpath("//input[@id='giftcard_2_RecipientName']")).sendKeys("pratik");
		driver.findElement(By.xpath("//input[@id='giftcard_2_RecipientEmail']")).sendKeys("pratik123@gmail.com");
		driver.findElement(By.xpath("//input[@id='giftcard_2_SenderName']")).sendKeys("pradip");
		driver.findElement(By.xpath("//input[@id='giftcard_2_SenderEmail']")).sendKeys("pradip123@gmail.com");
		driver.findElement(By.xpath("//input[@data-val='true']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-2']")).click();
		WebElement product = driver.findElement(By.xpath("(//a[contains(text(),'$25 Virtual Gift Card')])[2]"));
		if(product.isDisplayed()) {
			System.out.println("product verified");
		}
	}
}
