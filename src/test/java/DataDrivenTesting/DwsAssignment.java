package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DwsAssignment {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		String expected_url = "https://demowebshop.tricentis.com/";
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		String actual_url=driver.getCurrentUrl();
		if(expected_url.equals(actual_url)) {
			System.out.println("i am in dws page");	
		}else {
			System.out.println("i am in dws page");
		}
		
		FileInputStream fis = new FileInputStream("P:\\Selenium\\DwsLogin1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet2");
		String email = sheet.getRow(0).getCell(0).toString();
		String password  = sheet.getRow(0).getCell(1).toString();
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		WebElement value=driver.findElement(By.id("small-searchterms"));
		value.sendKeys("watch");
		
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		driver.close();
		
		
		
	}

}
