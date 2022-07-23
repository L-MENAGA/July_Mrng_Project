package July_Mrng_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	
	
	public static void read_Particular_Data() throws IOException {
		
		
		File f = new File("C:\\Users\\Admin\\Downloads\\DataDrivenRead.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(1);
		
		Row row = sheetAt.getRow(2);
		
		Cell cell = row.getCell(0);
		
		CellType cellType = cell.getCellType();
		
		if(cellType.equals(CellType.STRING)) {
			
			
			String value = cell.getStringCellValue();
			
			System.out.println(value);
		}
		
		else if(cellType.equals(CellType.NUMERIC)) {
			
			double cellValue = cell.getNumericCellValue();
			
			int value = (int) cellValue;// typecasting
			
			System.out.println(value);
			
		}
		
		
}

	
	public static void all_Data() throws Throwable{
		System.out.println("***** All DATA ********");
		
		File f = new File("C:\\Users\\Admin\\Downloads\\DataDrivenRead.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		  Sheet sheetAt = wb.getSheetAt(1);
		  
		  int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		  
		  for (int i = 0; i < numberOfRows; i++) {
			
			  Row row = sheetAt.getRow(i);
			  
			  int numberOfCells = row.getPhysicalNumberOfCells();
			  
			  for (int j = 0; j < numberOfCells; j++) {
				  
				  Cell cell = row.getCell(j);
				  
				  CellType cellType = cell.getCellType();
				  
				  
					if(cellType.equals(CellType.STRING)) {
						
						
						String value = cell.getStringCellValue();
						
						System.out.println(value);
					}
					
					else if(cellType.equals(CellType.NUMERIC)) {
						
						double cellValue = cell.getNumericCellValue();
						
						int value = (int) cellValue;// typecasting
						
						System.out.println(value);
						
					}
					
				
			}
			  
		}
		
		
	}
	
	
	public static void main(String[] args) throws Throwable {
		read_Particular_Data();
		all_Data();
		
	}


}