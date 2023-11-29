package com.krystal.project;

import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import com.ibm.icu.impl.Row;

public class DataProviderclass {
    private static final String FILE_PATH = "D:\\Field\\BHABHATRON TAW.xlsx";
    private static final String FILE_PATH_SID = "D:\\Field\\SIDDHARTH-II.xlsx";
    private static final String FILE_PATH_MLC = "D:\\Field\\BHABHATRON-MLC.xlsx";
    private static final String FILE_PATH_THREE = "D:\\Field\\BHABHATRON-3i.xlsx";
    
    
    private static final String FILE_PATH2 = "D:\\OAR.xlsx";
    private static final String FILE_PATH3 = "D:\\Templates.xlsx";
    
    public static Object[][] getTestBhTaw(String sheetName) {
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
    public static Object[][] getTestBHThree(String sheetName) {
        Object[][] data = null;
        try (FileInputStream fis = new FileInputStream(FILE_PATH_THREE);
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
    
    public static Object[][] getTestSid(String sheetName) {
        Object[][] data = null;
        try (FileInputStream fis = new FileInputStream(FILE_PATH_SID);
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
    
    public static Object[][] getTestMlc(String sheetName) {
        Object[][] data = null;
        try (FileInputStream fis = new FileInputStream(FILE_PATH_MLC);
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
    
    
    public static Object[][] getTestOAR(String sheetName) {
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
    
    
    public static Object[][] getTestTemp(String sheetName) {
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