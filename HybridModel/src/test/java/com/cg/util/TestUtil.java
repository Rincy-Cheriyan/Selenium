package com.cg.util;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cg.base.TestBase;

public class TestUtil extends TestBase{
	 
	public static void takeSS()
	{
	TakesScreenshot ss=(TakesScreenshot) driver;	
	File f=ss.getScreenshotAs(OutputType.FILE);
	try {
		Date date=new Date();
		System.out.println(date.getDate());
		FileUtils.copyFile(f, new File("target//ss"+date.getDate()+date.getHours()+date.getMinutes()+date.getSeconds()+".jpg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	
	public static void getData()
	{
		try {
			Workbook file=WorkbookFactory.create(new File("C:\\Users\\richeriy\\OneDrive - Capgemini\\Desktop\\PuneChennai\\MyExcel.xlsx"));
			int countSheet=file.getNumberOfSheets();
			for(int i=0;i<countSheet;i++)
			{
				Sheet sheet=file.getSheetAt(i);
				System.out.println("Data oF Sheet "+(i+1));
				int rowCount=sheet.getLastRowNum();
				int colCount=sheet.getRow(0).getLastCellNum();
				for(int i1=0;i1<rowCount;i1++)
				{
					for(int j=0;j<colCount;j++)
						System.out.println(sheet.getRow(i1).getCell(j).toString());
				}
				
				System.out.println("**************************************");
			}
		
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
