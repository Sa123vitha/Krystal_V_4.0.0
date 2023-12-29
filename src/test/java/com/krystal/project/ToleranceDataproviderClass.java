package com.krystal.project;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ToleranceDataproviderClass {
	  private static final String FILE_PATH = "D:\\Field\\Tolerance.xlsx";
	
	public static Object[][] getTestData(String sheetName) {
        Object[][] data = null;
        try (FileInputStream fis = new FileInputStream(FILE_PATH);
             Workbook workbook = new XSSFWorkbook(fis)) {
            org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet(sheetName);
            int rowCount = sheet.getLastRowNum();
            int columnCount = sheet.getRow(0).getLastCellNum();
            data = new Object[rowCount][columnCount];
            
            for (int i = 1; i <= rowCount; i++) {
                org.apache.poi.ss.usermodel.Row row = sheet.getRow(i);
                for (int j = 0; j < columnCount; j++) {
                    Cell cell = row.getCell(j);
                    data[i - 1][j] = cell.toString();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
	
	 private static final String FILE_PATH1 = "D:\\Field\\Demographics.xlsx";
	public static Object[][] getdemographicsData(String sheetName) {
        Object[][] data = null;
        try (FileInputStream fis = new FileInputStream(FILE_PATH1);
             Workbook workbook = new XSSFWorkbook(fis)) {
            org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet(sheetName);
            int rowCount = sheet.getLastRowNum();
            int columnCount = sheet.getRow(0).getLastCellNum();
            data = new Object[rowCount][columnCount];
            
            for (int i = 1; i <= rowCount; i++) {
                org.apache.poi.ss.usermodel.Row row = sheet.getRow(i);
                for (int j = 0; j < columnCount; j++) {
                    Cell cell = row.getCell(j);
                    data[i - 1][j] = cell.toString();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
	
	
	 private static final String FILE_PATH2 = "D:\\Field\\User.xlsx";
		public static Object[][] getUserData(String sheetName) {
	        Object[][] data = null;
	        try (FileInputStream fis = new FileInputStream(FILE_PATH2);
	             Workbook workbook = new XSSFWorkbook(fis)) {
	            org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet(sheetName);
	            int rowCount = sheet.getLastRowNum();
	            int columnCount = sheet.getRow(0).getLastCellNum();
	            data = new Object[rowCount][columnCount];
	            
	            for (int i = 1; i <= rowCount; i++) {
	                org.apache.poi.ss.usermodel.Row row = sheet.getRow(i);
	                for (int j = 0; j < columnCount; j++) {
	                    Cell cell = row.getCell(j);
	                    data[i - 1][j] = cell.toString();
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return data;
	    }
		
		
		 private static final String FILE_PATH3 = "D:\\Field\\TemplatesNew.xlsx";
			public static Object[][] getUserTemplates(String sheetName) {
		        Object[][] data = null;
		        try (FileInputStream fis = new FileInputStream(FILE_PATH3);
		             Workbook workbook = new XSSFWorkbook(fis)) {
		            org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet(sheetName);
		            int rowCount = sheet.getLastRowNum();
		            int columnCount = sheet.getRow(0).getLastCellNum();
		            data = new Object[rowCount][columnCount];
		            
		            for (int i = 1; i <= rowCount; i++) {
		                org.apache.poi.ss.usermodel.Row row = sheet.getRow(i);
		                for (int j = 0; j < columnCount; j++) {
		                    Cell cell = row.getCell(j);
		                    data[i - 1][j] = cell.toString();
		                }
		            }
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		        return data;
		    }
}
