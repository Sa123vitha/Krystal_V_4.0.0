package com.krystal.project;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Databaseconnection extends ReferencefileChemotheraphy{
	@BeforeClass
	public void setUp1()  throws InterruptedException, IOException {
	DesiredCapabilities appCapabilities = new DesiredCapabilities();
	appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
	driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
	
	}
	
	
	@Test
	public void Sql()  throws InterruptedException, IOException, SQLException, ClassNotFoundException {	
		 

         String userName = "sa";
         String password = "password";
        // String url = "jdbc:sqlserver://localhost:1433"+";databaseName=offline_settings";
         String url = "jdbc:sqlserver://localhost:1433;databaseName=offline_settings;encrypt=true;trustServerCertificate=false;sslProtocol=TLSv1";
         
         try {
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             Connection connection = DriverManager.getConnection(url, userName, password);
             connection.close(); 
         } catch (ClassNotFoundException e) {
             e.printStackTrace();
         } catch (SQLException e) {
             e.printStackTrace();
             
         }
	}
	
	
 
}