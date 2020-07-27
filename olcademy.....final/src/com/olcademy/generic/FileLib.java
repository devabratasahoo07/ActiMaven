package com.olcademy.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {

	public String getCellData(String path,String Sheet,int row,int cell) throws Throwable {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		String exelValue = wb.getSheet(Sheet).getRow(row).getCell(cell).toString();
		return exelValue;	
	}
	public int getRowCount(String path,String Sheet) throws Throwable{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		int rowcount = wb.getSheet(Sheet).getLastRowNum();
		return rowcount;
	}public void SetcellData(String path,String Sheet,int row,int cell,String value) throws Throwable {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(Sheet).getRow(row).createCell(cell).setCellValue(value);
		FileOutputStream fos= new FileOutputStream(path);
		wb.write(fos);
		wb.close();
	}
	public String getPropkeyValue(String propPath,String key) throws Throwable {
		FileInputStream fis = new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		String propValue = prop.getProperty(key, "not a Value");
		return propValue;


	}





}
