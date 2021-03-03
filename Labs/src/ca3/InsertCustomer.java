package ca3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertCustomer {
	
public static void main(String [] args) {
// database URL
	final String DATABASE_URL = "jdbc:mysql://localhost/customerpurchases";
	
	Connection connection = null;
	PreparedStatement pstat = null;
	String CustomerID = "1A";
	String FirstName = "Lisa";
	String LastName = "Smith";
	int i=0;
	
try{
	// establish connection to database
	connection = DriverManager.getConnection(
	DATABASE_URL, "root", "" );
	
	// create Statement for inserting into table
	pstat = connection.prepareStatement("INSERT INTO customers (CustomerID, FirstName, LastName) VALUES (?,?)");
	pstat.setString (1,CustomerID);
	pstat.setString (2,FirstName);
	pstat.setString (3,LastName); 
	
	// Insert Data into database
	i = pstat.executeUpdate();
	System.out.println(i + "record sucessfully added to the database.");
}

catch(SQLException sqlException ) {
sqlException.printStackTrace();
}
finally {
try{
pstat.close();
connection.close();
}
catch ( Exception exception ){
exception . printStackTrace () ;
}
}
} // end main
} // end class





	