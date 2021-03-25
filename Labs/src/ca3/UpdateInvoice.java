package ca3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UpdateInvoice {
	

public static void main(String [] args) {

// database URL
final String DATABASE_URL = "jdbc:mysql://localhost/customerpurchases";
String Date_Purchased = "2021/02/12";
String Product_Price = "5";
Connection connection = null;
PreparedStatement pstat = null;
int i=0;


java.util.Date dt = new java.util.Date();

java.text.SimpleDateFormat sdf = 
     new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

String currentTime = sdf.format(dt);


try{
	
	// establish connection to database
	connection = DriverManager.getConnection(
	DATABASE_URL, "root", "" );
	// create PreparedStatement for updating table
    pstat = connection.prepareStatement("Update invoice SET Date_Purchased=? Where Product_Price=?");
    pstat.setString(1, Date_Purchased);
    pstat.setString(2, Product_Price);
    
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

