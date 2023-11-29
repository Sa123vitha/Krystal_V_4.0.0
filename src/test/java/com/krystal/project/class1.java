package com.krystal.project;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class class1 {
	
		public static ArrayList<String> Site() throws ClassNotFoundException, SQLException {
			ArrayList<String> SiteName=null;
			Connection connection = ConnectionClass.sQLOffLineRnV_3_0_0();
		    Statement statement = connection.createStatement();
	        ResultSet resultSet =  statement.executeQuery("SELECT SiteName FROM Site ");
	        SiteName = new ArrayList<>();
	       
	     
		while (resultSet.next()) {
	           String data = resultSet.getString("SiteName");
	           String DrugName1 = data;
	           SiteName.add(DrugName1);
	     }
	
	       
	      return  SiteName;
	
		}
		
		public static ArrayList<HashMap<String, String>> getDataFromDatabase() throws ClassNotFoundException, SQLException {
	        ArrayList<HashMap<String, String>> dataEntries = new ArrayList<>();
	        Connection connection = ConnectionClass.sQLOffSettings_3_0_0();
	        Statement statement = connection.createStatement();
	        ResultSet resultSet = statement.executeQuery("SELECT * FROM APRIDModels");

	        ResultSetMetaData metaData = resultSet.getMetaData();
	        int columnCount = metaData.getColumnCount();

	        while (resultSet.next()) {
	            HashMap<String, String> entry = new HashMap<>();
	            for (int i = 1; i <= columnCount; i++) {
	                String columnName = metaData.getColumnName(i);
	                String columnValue = resultSet.getString(columnName);
	                entry.put(columnName, columnValue);
	            }
	            dataEntries.add(entry);
	        }

	        return dataEntries;
	    }
	

public static ArrayList<HashMap<String, String>> getDataFromDatabaseAPR() throws ClassNotFoundException, SQLException {
    ArrayList<HashMap<String, String>> dataEntries = new ArrayList<>();
    Connection connection = ConnectionClass.sQLOffSettings_3_0_0();
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery("SELECT * FROM APRDataModels");

    ResultSetMetaData metaData = resultSet.getMetaData();
    int columnCount = metaData.getColumnCount();

    while (resultSet.next()) {
        HashMap<String, String> entry = new HashMap<>();
        for (int i = 1; i <= columnCount; i++) {
            String columnName = metaData.getColumnName(i);
            String columnValue = resultSet.getString(columnName);
            entry.put(columnName, columnValue);
        }
        dataEntries.add(entry);
    }

    return dataEntries;
}

public static ArrayList<HashMap<String, String>> getDataFromDatabasecbct() throws ClassNotFoundException, SQLException {
    ArrayList<HashMap<String, String>> dataEntries = new ArrayList<>();
    Connection connection = ConnectionClass.sQLOffSettings_3_0_0();
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery("SELECT * FROM APRCBCTIDModels");

    ResultSetMetaData metaData = resultSet.getMetaData();
    int columnCount = metaData.getColumnCount();

    while (resultSet.next()) {
        HashMap<String, String> entry = new HashMap<>();
        for (int i = 1; i <= columnCount; i++) {
            String columnName = metaData.getColumnName(i);
            String columnValue = resultSet.getString(columnName);
            entry.put(columnName, columnValue);
        }
        dataEntries.add(entry);
    }

    return dataEntries;
}


public static ArrayList<HashMap<String, String>> getDataFromDatabaseAPRcbct() throws ClassNotFoundException, SQLException {
ArrayList<HashMap<String, String>> dataEntries = new ArrayList<>();
Connection connection = ConnectionClass.sQLOffSettings_3_0_0();
Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery("SELECT * FROM APRCBCTDataModels");

ResultSetMetaData metaData = resultSet.getMetaData();
int columnCount = metaData.getColumnCount();

while (resultSet.next()) {
HashMap<String, String> entry = new HashMap<>();
for (int i = 1; i <= columnCount; i++) {
    String columnName = metaData.getColumnName(i);
    String columnValue = resultSet.getString(columnName);
    entry.put(columnName, columnValue);
}
dataEntries.add(entry);
}

return dataEntries;
}

public static ArrayList<HashMap<String, String>> getDataFromDatabaseSite() throws ClassNotFoundException, SQLException {
ArrayList<HashMap<String, String>> dataEntries = new ArrayList<>();
Connection connection = ConnectionClass.sQLOffLineRnV_3_0_0();
Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery("SELECT * FROM Site");

ResultSetMetaData metaData = resultSet.getMetaData();
int columnCount = metaData.getColumnCount();

while (resultSet.next()) {
HashMap<String, String> entry = new HashMap<>();
for (int i = 1; i <= columnCount; i++) {
    String columnName = metaData.getColumnName(i);
    String columnValue = resultSet.getString(columnName);
    entry.put(columnName, columnValue);
}
dataEntries.add(entry);
}

return dataEntries;
}

public static ArrayList<HashMap<String, String>> getDataFromDatabaseDesignation() throws ClassNotFoundException, SQLException {
ArrayList<HashMap<String, String>> dataEntries = new ArrayList<>();
Connection connection = ConnectionClass.sQLOffSettings_3_0_0();
Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery("SELECT * FROM DesignationModels");

ResultSetMetaData metaData = resultSet.getMetaData();
int columnCount = metaData.getColumnCount();

while (resultSet.next()) {
HashMap<String, String> entry = new HashMap<>();
for (int i = 1; i <= columnCount; i++) {
    String columnName = metaData.getColumnName(i);
    String columnValue = resultSet.getString(columnName);
    entry.put(columnName, columnValue);
}
dataEntries.add(entry);
}

return dataEntries;

}

public static ArrayList<HashMap<String, String>> getDataFromDatabaseHoliday() throws ClassNotFoundException, SQLException {
ArrayList<HashMap<String, String>> dataEntries = new ArrayList<>();
Connection connection = ConnectionClass.sQLOffSettings_3_0_0();
Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery("SELECT * FROM HolidayModels");

ResultSetMetaData metaData = resultSet.getMetaData();
int columnCount = metaData.getColumnCount();

while (resultSet.next()) {
HashMap<String, String> entry = new HashMap<>();
for (int i = 1; i <= columnCount; i++) {
    String columnName = metaData.getColumnName(i);
    String columnValue = resultSet.getString(columnName);
    entry.put(columnName, columnValue);
}
dataEntries.add(entry);
}

return dataEntries;

}

public static ArrayList<HashMap<String, String>> getDataFromLabReports() throws ClassNotFoundException, SQLException {
ArrayList<HashMap<String, String>> dataEntries = new ArrayList<>();
Connection connection = ConnectionClass.sQLOffLineRnV_3_0_0();
Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery("SELECT * FROM LabReport");

ResultSetMetaData metaData = resultSet.getMetaData();
int columnCount = metaData.getColumnCount();

while (resultSet.next()) {
HashMap<String, String> entry = new HashMap<>();
for (int i = 1; i <= columnCount; i++) {
    String columnName = metaData.getColumnName(i);
    String columnValue = resultSet.getString(columnName);
    entry.put(columnName, columnValue);
}
dataEntries.add(entry);
}

return dataEntries;

}


public static ArrayList<HashMap<String, String>> getDataFromDatabaseChemo() throws ClassNotFoundException, SQLException {
ArrayList<HashMap<String, String>> dataEntries = new ArrayList<>();
Connection connection = ConnectionClass.sQLOffSettings_3_0_0();
Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery("SELECT * FROM ClassificationModels");

ResultSetMetaData metaData = resultSet.getMetaData();
int columnCount = metaData.getColumnCount();

while (resultSet.next()) {
HashMap<String, String> entry = new HashMap<>();
for (int i = 1; i <= columnCount; i++) {
    String columnName = metaData.getColumnName(i);
    String columnValue = resultSet.getString(columnName);
    entry.put(columnName, columnValue);
}
dataEntries.add(entry);
}

return dataEntries;
}

public static ArrayList<HashMap<String, String>> getDataFromDatabaseRegimen() throws ClassNotFoundException, SQLException {
ArrayList<HashMap<String, String>> dataEntries = new ArrayList<>();
Connection connection = ConnectionClass.sQLOffSettings_3_0_0();
Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery("SELECT * FROM RegimenModels");

ResultSetMetaData metaData = resultSet.getMetaData();
int columnCount = metaData.getColumnCount();

while (resultSet.next()) {
HashMap<String, String> entry = new HashMap<>();
for (int i = 1; i <= columnCount; i++) {
    String columnName = metaData.getColumnName(i);
    String columnValue = resultSet.getString(columnName);
    entry.put(columnName, columnValue);
}
dataEntries.add(entry);
}

return dataEntries;
}

public static ArrayList<HashMap<String, String>> getDataFromDatabaseRadio() throws ClassNotFoundException, SQLException {
ArrayList<HashMap<String, String>> dataEntries = new ArrayList<>();
Connection connection = ConnectionClass.sQLOffSettings_3_0_0();
Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery("SELECT * FROM RadioSensitizersModels");

ResultSetMetaData metaData = resultSet.getMetaData();
int columnCount = metaData.getColumnCount();

while (resultSet.next()) {
HashMap<String, String> entry = new HashMap<>();
for (int i = 1; i <= columnCount; i++) {
    String columnName = metaData.getColumnName(i);
    String columnValue = resultSet.getString(columnName);
    entry.put(columnName, columnValue);
}
dataEntries.add(entry);
}

return dataEntries;
}
public static ArrayList<HashMap<String, String>> getDataFromDatabaseDrug() throws ClassNotFoundException, SQLException {
ArrayList<HashMap<String, String>> dataEntries = new ArrayList<>();
Connection connection = ConnectionClass.sQLOffSettings_3_0_0();
Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery("SELECT * FROM DrugModels");

ResultSetMetaData metaData = resultSet.getMetaData();
int columnCount = metaData.getColumnCount();

while (resultSet.next()) {
HashMap<String, String> entry = new HashMap<>();
for (int i = 1; i <= columnCount; i++) {
    String columnName = metaData.getColumnName(i);
    String columnValue = resultSet.getString(columnName);
    entry.put(columnName, columnValue);
}
dataEntries.add(entry);
}

return dataEntries;
}


public static ArrayList<HashMap<String, String>> getDataFromDatabaseTRange() throws ClassNotFoundException, SQLException {
ArrayList<HashMap<String, String>> dataEntries = new ArrayList<>();
Connection connection = ConnectionClass.sQLOffSettings_3_0_0();
Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery("SELECT * FROM ToleranceRange");

ResultSetMetaData metaData = resultSet.getMetaData();
int columnCount = metaData.getColumnCount();

while (resultSet.next()) {
HashMap<String, String> entry = new HashMap<>();
for (int i = 1; i <= columnCount; i++) {
    String columnName = metaData.getColumnName(i);
    String columnValue = resultSet.getString(columnName);
    entry.put(columnName, columnValue);
}
dataEntries.add(entry);
}

return dataEntries;
}




public static ArrayList<HashMap<String, String>> getDataFromDatabaseFS() throws ClassNotFoundException, SQLException {
ArrayList<HashMap<String, String>> dataEntries = new ArrayList<>();
Connection connection = ConnectionClass.sQLfsservice();
Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery("SELECT * FROM ConfigurationModels");

ResultSetMetaData metaData = resultSet.getMetaData();
int columnCount = metaData.getColumnCount();

while (resultSet.next()) {
HashMap<String, String> entry = new HashMap<>();
for (int i = 1; i <= columnCount; i++) {
    String columnName = metaData.getColumnName(i);
    String columnValue = resultSet.getString(columnName);
    entry.put(columnName, columnValue);
}
dataEntries.add(entry);
}

return dataEntries;
}


public static ArrayList<HashMap<String, String>> getDataFromDatabaseSD() throws ClassNotFoundException, SQLException {
ArrayList<HashMap<String, String>> dataEntries = new ArrayList<>();
Connection connection = ConnectionClass.sQLservice();
Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery("SELECT * FROM ConfigurationModels");

ResultSetMetaData metaData = resultSet.getMetaData();
int columnCount = metaData.getColumnCount();

while (resultSet.next()) {
HashMap<String, String> entry = new HashMap<>();
for (int i = 1; i <= columnCount; i++) {
    String columnName = metaData.getColumnName(i);
    String columnValue = resultSet.getString(columnName);
    entry.put(columnName, columnValue);
}
dataEntries.add(entry);
}

return dataEntries;
}

public static ArrayList<HashMap<String, String>> getDataFromDatabaseCCB() throws ClassNotFoundException, SQLException {
ArrayList<HashMap<String, String>> dataEntries = new ArrayList<>();
Connection connection = ConnectionClass.sQLccbservice();
Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery("SELECT * FROM ConfigurationModels");

ResultSetMetaData metaData = resultSet.getMetaData();
int columnCount = metaData.getColumnCount();

while (resultSet.next()) {
HashMap<String, String> entry = new HashMap<>();
for (int i = 1; i <= columnCount; i++) {
    String columnName = metaData.getColumnName(i);
    String columnValue = resultSet.getString(columnName);
    entry.put(columnName, columnValue);
}
dataEntries.add(entry);
}

return dataEntries;
}


public static ArrayList<HashMap<String, String>> getDataFromDatabaseMachine(String Text) throws ClassNotFoundException, SQLException {
ArrayList<HashMap<String, String>> dataEntries = new ArrayList<>();
Connection connection = ConnectionClass.sQLOffSettings_3_0_0();
Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery(Text);

ResultSetMetaData metaData = resultSet.getMetaData();
int columnCount = metaData.getColumnCount();

while (resultSet.next()) {
HashMap<String, String> entry = new HashMap<>();
for (int i = 1; i <= columnCount; i++) {
    String columnName = metaData.getColumnName(i);
    String columnValue = resultSet.getString(columnName);
    entry.put(columnName, columnValue);
}
dataEntries.add(entry);
}

return dataEntries;

}



public static ArrayList<HashMap<String, String>> getDataFromExcel(String filePath, String sheetName) throws IOException {
    ArrayList<HashMap<String, String>> dataEntries = new ArrayList<>();
    FileInputStream fis = new FileInputStream(filePath);
    Workbook workbook = new XSSFWorkbook(fis);
    Sheet sheet = workbook.getSheet(sheetName);

    // Assuming the first row contains column names
    Row headerRow = sheet.getRow(0);

    for (Row row : sheet) {
        // Skip the header row
        if (row.getRowNum() == 0) {
            continue;
        }

        HashMap<String, String> entry = new HashMap<>();
        for (int i = 0; i < headerRow.getLastCellNum(); i++) {
            Cell headerCell = headerRow.getCell(i);
            Cell dataCell = row.getCell(i);

            String columnName = headerCell.toString();
            String columnValue = dataCell.toString();
            entry.put(columnName, columnValue);
        }
        dataEntries.add(entry);
    }

    fis.close();
    return dataEntries;
}




}

