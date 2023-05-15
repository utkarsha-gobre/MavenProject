package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData 
{
	 static XSSFWorkbook workbook;

	
public  static String[][] TestData()
{
		try
		{
					
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Downloads\\ContactName.xlsx");
		 workbook = new XSSFWorkbook(file);

		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//need to move into sheet

		 XSSFSheet sheet =workbook.getSheet("ContactName");

		  int rows = sheet.getLastRowNum();
		  System.out.println(rows);
		  
		  int column = sheet.getRow(0).getLastCellNum();	
         System.out.println(column);
         
         String data [][]=new String [rows][column];
//for outer loop 
         for(int i=0;i<rows;i++)
         {
        	 //for inner loop
        	 for(int j =0;j<column;j++)
        	 {
        		  data [i][j] = sheet.getRow(i).getCell(j).toString();
        				 System.out.print(data+"               ");
        
        	 }
        	 
         }
         
         return data;
}
}
