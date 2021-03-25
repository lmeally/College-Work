package ca3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertProduct {
	
public static void main(String [] args) {
// database URL
	final String DATABASE_URL = "jdbc:mysql://localhost/customerpurchases";
	
	Connection connection = null;
	PreparedStatement pstat = null;
	String Product_Type = "Wooden Panel";
	String Product_Cost = "30";
	String Stock_Available = "25";
	String Product_ID = "1";
	int i=0;
	
try{
	// establish connection to database
	connection = DriverManager.getConnection(
	DATABASE_URL, "root", "" );
	
	// create Statement for inserting into table
	pstat = connection.prepareStatement("INSERT INTO product (Product_Type, Product_Cost, Stock_Available, Product_ID) VALUES (?,?,?,?)");
	pstat.setString (1,Product_Type);
	pstat.setString (2,Product_Cost);
	pstat.setString (3,Stock_Available);
	pstat.setString (4,Product_ID); 
	
	// Insert Data into database
	i = pstat.executeUpdate();
	System.out.println(i + " record sucessfully added to the database.");
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





	