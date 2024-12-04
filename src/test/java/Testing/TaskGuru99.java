package Testing;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TaskGuru99 {
	@Test
	public void rightClickMe() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions act = new Actions(driver);
		WebElement right_clickMe = driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(right_clickMe).perform();
		Thread.sleep(2000);
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']"));
		for (WebElement click : list) {
			click.click();
			Alert alt = driver.switchTo().alert();
			alt.accept();
		}
	}

}
