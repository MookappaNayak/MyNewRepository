package Java;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {

		 FileInputStream fis=new FileInputStream("/home/mookappa/eclipse-workspace/Selenium11/Excel/myExcel.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		 Sheet s=wb.getSheet("Sheet1");
		 Row r=s.getRow(0);
		 Cell c = r.getCell(1);
		 String data=c.toString();
	       System.out.println(data);
		 
	 

}
}