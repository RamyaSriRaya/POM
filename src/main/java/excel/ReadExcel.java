package excel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public  String[][] getData(String fileName) throws IOException {
		//open workbook
		
		XSSFWorkbook wbook = new XSSFWorkbook("./data/"+fileName+".xlsx");
		
		//go to sheet
		XSSFSheet sheet = wbook.getSheetAt(0);//we have header row
		
		//count of row
		int rowCount = sheet.getLastRowNum();
	//  int rowCount1  =	sheet.getPhysicalNumberOfRows();//(no header row)
		
		
		//count of cell
	     short cellCount = sheet.getRow(0).getLastCellNum();
	  
	     String[][] data = new String[rowCount][cellCount];
		
		//go to row
	     
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row =sheet.getRow(i);
			//go to cell
			for (int j = 0; j < cellCount; j++) {
				XSSFCell cell = row.getCell(j);
				
            data[i-1][j]=cell.getStringCellValue();
           // data[i-1][j]  = cell.getNumericCellValue();
			}
		}
		wbook.close();
		return data;
		
		
	}
	
}
