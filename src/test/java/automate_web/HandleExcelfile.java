package automate_web;

import java.io.IOException;
import java.nio.file.Path;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class HandleExcelfile {


	public static void main(String[] args) throws IOException {
		
		System.out.println("Hi........");
		
		
		try {
			
			String path = System.getProperty("user.dir");
			
			System.out.println("My project path : " + path);
			XSSFWorkbook workbook = new XSSFWorkbook(path+"\\ExcelFile\\WebAutomateFile.xlsx");
			
//			System.out.println("list : "+ workbook.);
			
			XSSFSheet sheet = workbook.getSheet("sheet1");
			
			
			System.out.println("Excel row count : " + sheet.getPhysicalNumberOfRows());
			
			System.out.println("Excel cell count : " + sheet.getRow(3).getPhysicalNumberOfCells());
			
			System.out.println("My actual data: " + sheet.getRow(1).getCell(3));
			
			System.out.println("My data : " + sheet.getRow(0).getCell(0));
			
		} catch (Exception e) {
			
			System.out.println("Data not exist");
			
		}
		
	}

}
