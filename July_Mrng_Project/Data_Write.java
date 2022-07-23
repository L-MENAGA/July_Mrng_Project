package July_Mrng_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Write {
	
	public static void write_Data() throws Throwable {
		
		File f = new File("C:\\Users\\Admin\\Downloads\\DataDrivenRead.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		wb.createSheet("Write").createRow(0).createCell(0).setCellValue("Username");
		
		wb.getSheet("Write").getRow(0).createCell(1).setCellValue("Password");
		
		wb.getSheet("Write").createRow(1).createCell(0).setCellValue("Lemons");
		
		wb.getSheet("Write").getRow(1).createCell(1).setCellValue("Pass");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
	}
	
	
	public static void main(String[] args) throws Throwable{
		write_Data();
	}

}
