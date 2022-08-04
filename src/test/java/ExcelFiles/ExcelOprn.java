package ExcelFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelOprn {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("./ExcelFiles/testfile.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			
			wb.getSheet("Sheet1").getRow(2).getCell(1);
			System.out.println(wb.getSheet("Sheet1").getRow(2).getCell(0));
			
			
			
		} catch (IOException | EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
