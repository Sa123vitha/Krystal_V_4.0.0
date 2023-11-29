package com.krystal.project;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionClass {

	public static Connection  sQLOffLineRnV_3_0_0() throws ClassNotFoundException, SQLException {
		Connection OffLineRnV_3_0_0 = null;
		try {
			// Your database operations here...
				String connectionURL = "jdbc:jtds:sqlserver://192.168.11.18:1433/Offline_Siddharth_OffLineRnV_3_0_0;user=sa;password=panacea;";
		        String user = "sa";
		        String password = "panacea";
		
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			OffLineRnV_3_0_0 = DriverManager.getConnection(connectionURL,user,password);
		
			 
			}  catch ( SQLException ex) {
	            if ((ex.getMessage() == "Network error IOException: Host unreachable"))
	            {
	            	//  return "1";
	            }
	              else {
	            	System.out.println("Cannot open database \"CCB_Service\" requested by the login. The login failed.");
	            
	            		 ex.printStackTrace();
	             //   return "2";
	            }
			} catch( ClassNotFoundException ex) {
				 ex.printStackTrace();
			//	return "3";
	        } catch ( Exception ex) {
	        	 ex.printStackTrace();
	        //    return "4";
	        }
	        catch( Throwable ex ) {
	            ex.printStackTrace();
	        }
		return OffLineRnV_3_0_0;
		}
public static Connection  sQLOffSettings_3_0_0() throws ClassNotFoundException, SQLException {
	Connection OffLineRnV_3_0_0 = null;
	try {
		// Your database operations here...
			String connectionURL = "jdbc:jtds:sqlserver://192.168.11.18:1433/Offline_Settings_4_0_0;user=sa;password=panacea;";
	        String user = "sa";
	        String password = "panacea";
	
		Class.forName("net.sourceforge.jtds.jdbc.Driver");
		OffLineRnV_3_0_0 = DriverManager.getConnection(connectionURL,user,password);
	
		 
		}  catch ( SQLException ex) {
            if ((ex.getMessage() == "Network error IOException: Host unreachable"))
            {
            	//  return "1";
            }
              else {
            	System.out.println("Cannot open database \"Offline Settings_4.0.0\" requested by the login. The login failed.");
            
            		 ex.printStackTrace();
             
            }
		} catch( ClassNotFoundException ex) {
			 ex.printStackTrace();
			 
		//	return "3";
        } catch ( Exception ex) {
        	 ex.printStackTrace();
        //    return "4";
        }
        catch( Throwable ex ) {
            ex.printStackTrace();
        }
	return OffLineRnV_3_0_0;
	}


public static Connection  sQLservice() throws ClassNotFoundException, SQLException {
	Connection OffLineRnV_3_0_0 = null;
	try {
		// Your database operations here...
			String connectionURL = "jdbc:jtds:sqlserver://192.168.11.18:1433/Sd_CCB_Service;user=sa;password=panacea;";
	        String user = "sa";
	        String password = "panacea";
	
		Class.forName("net.sourceforge.jtds.jdbc.Driver");
		OffLineRnV_3_0_0 = DriverManager.getConnection(connectionURL,user,password);
	
		 
		}  catch ( SQLException ex) {
            if ((ex.getMessage() == "Network error IOException: Host unreachable"))
            {
            	//  return "1";
            }
              else {
            	System.out.println("Cannot open database \"Offline Settings_4.0.0\" requested by the login. The login failed.");
            
            		 ex.printStackTrace();
             
            }
		} catch( ClassNotFoundException ex) {
			 ex.printStackTrace();
			 
		//	return "3";
        } catch ( Exception ex) {
        	 ex.printStackTrace();
        //    return "4";
        }
        catch( Throwable ex ) {
            ex.printStackTrace();
        }
	return OffLineRnV_3_0_0;
	}


public static Connection  sQLfsservice() throws ClassNotFoundException, SQLException {
	Connection OffLineRnV_3_0_0 = null;
	try {
		// Your database operations here...
			String connectionURL = "jdbc:jtds:sqlserver://192.168.11.18:1433/Fs_CCB_Service;user=sa;password=panacea;";
	        String user = "sa";
	        String password = "panacea";
	
		Class.forName("net.sourceforge.jtds.jdbc.Driver");
		OffLineRnV_3_0_0 = DriverManager.getConnection(connectionURL,user,password);
	
		 
		}  catch ( SQLException ex) {
            if ((ex.getMessage() == "Network error IOException: Host unreachable"))
            {
            	//  return "1";
            }
              else {
            	System.out.println("Cannot open database \"Offline Settings_4.0.0\" requested by the login. The login failed.");
            
            		 ex.printStackTrace();
             
            }
		} catch( ClassNotFoundException ex) {
			 ex.printStackTrace();
			 
		//	return "3";
        } catch ( Exception ex) {
        	 ex.printStackTrace();
        //    return "4";
        }
        catch( Throwable ex ) {
            ex.printStackTrace();
        }
	return OffLineRnV_3_0_0;
	}


public static Connection  sQLccbservice() throws ClassNotFoundException, SQLException {
	Connection OffLineRnV_3_0_0 = null;
	try {
		// Your database operations here...
			String connectionURL = "jdbc:jtds:sqlserver://192.168.11.18:1433/CCB_Service;user=sa;password=panacea;";
	        String user = "sa";
	        String password = "panacea";
	
		Class.forName("net.sourceforge.jtds.jdbc.Driver");
		OffLineRnV_3_0_0 = DriverManager.getConnection(connectionURL,user,password);
	
		 
		}  catch ( SQLException ex) {
            if ((ex.getMessage() == "Network error IOException: Host unreachable"))
            {
            	//  return "1";
            }
              else {
            	System.out.println("Cannot open database \"Offline Settings_4.0.0\" requested by the login. The login failed.");
            
            		 ex.printStackTrace();
             
            }
		} catch( ClassNotFoundException ex) {
			 ex.printStackTrace();
			 
		//	return "3";
        } catch ( Exception ex) {
        	 ex.printStackTrace();
        //    return "4";
        }
        catch( Throwable ex ) {
            ex.printStackTrace();
        }
	return OffLineRnV_3_0_0;
	}
}
