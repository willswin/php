package inventory;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


import dataBaseAccess.Login;
import gui.Sale;
import gui.StockItem;

// File Name Changed from Sale to SalesDB to prevent clashes with GUI Sale.java

// See Inventory.Java for SQL method Comments

public class SalesDB
{
	 protected Connection connect = null;
	 protected Statement statement = null;
	 protected PreparedStatement preparedStatement = null;
	 protected ResultSet resultSet = null;
	 protected int amount = 0;
	 protected int bar = 0;
	 protected int obsolescence = 0; // 0 = not discontinues, 1 = discontinued
	 protected double price = 0; // adds zero price
	 protected String name = "";
	 protected String category = "";
	 protected ResultSet SaleRecordSet = null;
	 protected ResultSet SaleItemSet = null;
	private String Staff_id;
	
	 public void AddSaleRec(String Sale_id, String Staff_id, LocalDateTime TimeofSale, String Staff_notes) throws Exception
	 {
		 try {
				connect = DriverManager.getConnection("jdbc:mysql://localhost/"+Login.Database+"?", Login.USRN, Login.USRP);
				statement = connect.createStatement();
				String sql = "INSERT INTO salerecord Values ('" + Sale_id +"','" + Staff_id + "','" + TimeofSale + "','" + Staff_notes + "')";
				statement.executeUpdate(sql);
				} 
	        catch (Exception e) { throw e; }    
	        finally { close();  }
	 }
	
	 public void AddSaleItem(String Sale_id, int Barcode,  int Amount, double Price) throws Exception
	 {
		 try {
				connect = DriverManager.getConnection("jdbc:mysql://localhost/"+Login.Database+"?", Login.USRN, Login.USRP);
				statement = connect.createStatement();
				String sql = "INSERT INTO saleitem Values ('" + Sale_id +"','" + Barcode + "','" + Amount + "','" + Price + "')";
				statement.executeUpdate(sql);
				} 
	        catch (Exception e) { throw e; }    
	        finally { close();  }
	 }
	
	
	public void RetrieveSaleRec()
	{
		
	}
	
	public void RetrieveSaleItem()
	{
		
	}
	
	 public ArrayList<Sale> RetrieveSales(ArrayList<Sale> theSales) throws Exception 
	 {
		 try {
             Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/"+Login.Database+"?", Login.USRN, Login.USRP);
            statement = connect.createStatement();
            // Result set receives the results of the SQL query
            SaleRecordSet = statement.executeQuery("select * from "+Login.Database+".salerecord");
            
            String[] RecordId = null;
            String[] StaffId = null;
            LocalDateTime[] DateTimeofSale = null;
            int RecordCount = 0;
          /*  while(SaleRecordSet.next())
            {
            	RecordId[RecordCount] = SaleRecordSet.getString("Sale_Code");
            	StaffId[RecordCount] = SaleRecordSet.getString("Staff_Code");
            	DateTimeofSale[RecordCount] = SaleRecordSet.getObject("Sale_Time", LocalDateTime.class);
            	
            	Sale newSale = new Sale(StaffId[RecordCount], "noName" , StaffId[RecordCount], 10, DateTimeofSale[RecordCount]);
            	theSales.add(newSale);
            	RecordCount++;
            }
           int RecordLength = RecordCount;*/
          //NotRequired- For Console Testing only//  
          //  SaleItemSet = statement.executeQuery("select * from "+Login.Database+".saleitem");
          for(int i =0; i< RecordCount; i++)
          { // For loop, running through recordId, compare to resultset.next(), if it matches write new sale with info else do nothing and loop over for next one
            	while (SaleItemSet.getString("Sale_Code") == SaleRecordSet.getString("Sale_Code")) 
            	{
            		
            		int Barcode = SaleItemSet.getInt("item_barcode");  
            		int Amount = SaleItemSet.getInt("item_quantity"); 
            		double Price = SaleItemSet.getDouble("item_price");
            	
            		String miname = "not currently implemented"; // Will 
					String Sale_id = SaleItemSet.getString("Sale_Code");
					Sale newSale = new Sale(Sale_id, miname , Staff_id, Amount, DateTimeofSale[1]);
            		//Sale newSale = new Sale(menuID, miname, saleid, itmsaleid, daysold);
            		theSales.add(newSale);
            	}
          }
          return theSales;
          
            
        	}
       
        catch (Exception e) { throw e; }    
        finally 
        	{ 	    	close();	     	
        	}
	 }
		/* try {
             Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/"+Login.Database+"?", Login.USRN, Login.USRP);
            statement = connect.createStatement();
            // Result set receives the results of the SQL query
            SaleRecordSet = statement.executeQuery("select * from "+Login.Database+".salerecord");
          //NotRequired- For Console Testing only//  
           menu = writeResultSet(resultSet, menu);
           // ResultSet returnable = resultSet;
            
        	}
       
        catch (Exception e) { throw e; }    
        finally 
        	{ 	    	close();	     	}*/
	
	 private void close() 
		{// Ends all threads
	 		try {
	 			if (resultSet != null) 
	 			{
	 				resultSet.close();
	 			}

	 			if (statement != null)
	 			{
	 				statement.close();
	 			}

	 			if (connect != null) 
	 			{
	 				connect.close();
	 			}
	 	
	 			}
	 			catch (Exception e)
	 			{

	 			}
	 	
		}
	
}
