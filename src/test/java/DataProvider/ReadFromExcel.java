package DataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadFromExcel {
	@DataProvider(name="login")
	public Object[][] provider() throws EncryptedDocumentException, IOException {
	//	Object[][]obj = new Object[2][2];
		FileInputStream fis = new FileInputStream("P:\\Selenium\\DwsLogin1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet2");
		int row = sheet.getPhysicalNumberOfRows();
		int cell = sheet.getRow(0).getPhysicalNumberOfCells();
		Object [][]obj =new Object[row][cell];
		for(int i=0;i<row;i++) {
			for(int j=0;j<cell;j++) {
				obj [i][j] = sheet.getRow(i).getCell(j).toString();	
			}
		}
		/*
		 * obj[0][0]=sheet.getRow(0).getCell(0).toString();
		 * obj[0][1]=sheet.getRow(0).getCell(1).toString();
		 * obj[0][0]=sheet.getRow(1).getCell(0).toString();
		 * obj[0][1]=sheet.getRow(1).getCell(1).toString();
		 */
		return obj;
	}
	
	@Test(dataProvider = "login")
	public void receiver(String username,String password) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("magnetod2001@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("magneto123");
		Thread.sleep(1000);
		driver.findElement(By.id("RememberMe")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		Thread.sleep(1000);
		driver.close();
	}
	

}
