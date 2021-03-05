package ca3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UpdateCustomer {
	

public static void main(String [] args) {

// database URL
final String DATABASE_URL = "jdbc:mysql://localhost/customerpurchases";
String firstname= "Lisa";
String lastname= "Smith";
Connection connection = null;
PreparedStatement pstat = null;
int i=0;


try{
	
	// establish connection to database
	connection = DriverManager.getConnection(
	DATABASE_URL, "root", "" );
	// create PreparedStatement for updating table
    pstat = connection.prepareStatement("Update authors SET LastName=? Where FirstName=?");
    pstat.setString(1, lastname);
    pstat.setString(2, firstname);
    
    //Update data in database
    i = pstat.executeUpdate();
    System.out.println(i + "record sucessfully updated in the database.");
    
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
