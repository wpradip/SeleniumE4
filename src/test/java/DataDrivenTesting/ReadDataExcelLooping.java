package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataExcelLooping {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("P:\\Selenium\\DwsLogin.xlsx");
		Workbook wb = WorkbookFactory.create(fis); 
		Sheet sheet = wb.getSheet("Sheet1");
		int row = sheet.getPhysicalNumberOfRows();
		int cell = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("row :"+row+"\ncell :"+cell);
		for(int i=0;i<row;i++) {
			for(int j=0;j<cell;j++) {
				String data = sheet.getRow(i).getCell(j).toString();
				
				System.out.println(data);
				
			}
		}
	}

}
