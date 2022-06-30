package org.basicexamples;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Apacheex1 {

	public static void main(String[] args) {
		try {
		String path = System.getProperty("user.dir");
		FileInputStream	fis = new FileInputStream(path+"\\ExcelFiles\\testfile.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int numofsheeet = wb.getNumberOfSheets();
		wb.gets
		
		
		
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		

	}

}
