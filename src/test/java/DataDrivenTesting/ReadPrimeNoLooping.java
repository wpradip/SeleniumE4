package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadPrimeNoLooping {
    public static void main(String[] args) throws EncryptedDocumentException, IOException {
        FileInputStream file = new FileInputStream("P:\\Selenium\\Nosheet.xlsx");
        Workbook wb = WorkbookFactory.create(file);
        Sheet sheet = wb.getSheet("Sheet1");

        int row = sheet.getPhysicalNumberOfRows();
        int cell = sheet.getRow(0).getPhysicalNumberOfCells();

        for(int i=0;i<row;i++) {
            for(int j=0;j<cell;j++) {
                String data = sheet.getRow(i).getCell(j).toString();
                try {
                    int number = Integer.parseInt(data);
                    if (isPrime(number)) {
                        System.out.println(number);
                    }
                } catch (NumberFormatException e) {
                    // Handle the case where data is not a number
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if(n<=1) {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
}
