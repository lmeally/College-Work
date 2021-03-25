package ca3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UpdateProduct {
	

public static void main(String [] args) {

// database URL
final String DATABASE_URL = "jdbc:mysql://localhost/customerpurchases";
String Product_Type = "test";
String Product_Cost = "test";
String Stock_Available = "test";
String Product_ID = "test";
Connection connection = null;
PreparedStatement pstat = null;
int i=0;


try{
	
	// establish connection to database
	connection = DriverManager.getConnection(
	DATABASE_URL, "root", "" );
	// create PreparedStatement for updating table
    pstat = connection.prepareStatement("Update product SET Product_Type=? Where Product_ID=?");
    pstat.setString(1, Product_Type);
    pstat.setString(2, Product_Cost);
    pstat.setString(3, Stock_Available);
    pstat.setString(4, Product_ID);
    
    //Update data in database
    i = pstat.executeUpdate();
    System.out.println(i + " record sucessfully updated in the database.");
    
    }
	catch(SQLException sqlException ) {
	sqlException.printStackTrace () ;
	}
	finally {
	try{
	pstat.close() ;
	connection.close() ;
	}
	catch ( Exception exception ){
	exception . printStackTrace () ;
	}
	}
	} // end main
	} // end class

