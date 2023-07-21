package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import base.BaseClass;



public class ExtractDataFromExcel extends BaseClass {
	
	@SuppressWarnings("deprecation")
	public static String[][] getTestData() throws IOException {
        	
            XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(filename));
            XSSFSheet sheet = workbook.getSheet(sheetname);
            int row_count = sheet.getPhysicalNumberOfRows();
            int col_count = sheet.getRow(0).getLastCellNum();
            
            String dataTable[][] = new String[row_count - 1][col_count];
            
            
            for (int i = 1; i < row_count; i++) {
            	Row row =  sheet.getRow(i);
                for (int j = 0; j < col_count; j++) {
                	Cell cell = row.getCell(j);
                	if(cell == null) 
                		dataTable[i - 1][j]	= " " ;
                	else {
                		
                	cell.setCellType(CellType.STRING);
                    dataTable[i - 1][j] = cell.getStringCellValue();
                	}
                }
            }
            
            workbook.close();
            return dataTable;
       }

	
	}
