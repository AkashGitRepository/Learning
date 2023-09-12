package readingExcel;

import java.io.FileInputStream; 
import java.io.IOException;
import java.util.Random;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ConfedentialData {
	
	public String firstInput(int rows) throws EncryptedDocumentException, IOException
	{
		String path = ".//F-Data//testData.xlsx";
		FileInputStream file = new FileInputStream(path);
		String userNameValue = WorkbookFactory.create(file).getSheet("loginWeb").getRow(rows).getCell(0).getStringCellValue();
		return userNameValue;
	}
	public String secondInput(int rows) throws EncryptedDocumentException, IOException
	{
		String path = ".//F-Data//testData.xlsx";
		FileInputStream file = new FileInputStream(path);
		String cellValue = WorkbookFactory.create(file).getSheet("loginWeb").getRow(rows).getCell(1).getStringCellValue();
		return cellValue;
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		Random no=new Random();
		int k= no.nextInt(1);
		int L= no.nextInt(1,2);
		System.out.println(k);
		ConfedentialData e = new ConfedentialData();
		String a =e.firstInput(k);
		String b =e.secondInput(L);
		System.out.println(a);
		System.out.println(b);
	}
}


































