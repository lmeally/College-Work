package ca3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteProduct {

public static void main(String [] args) {
	
// database URL
final String DATABASE_URL = "jdbc:mysql://localhost/customerpurchases";
String Product_Type = "Wooden Panel";
Connection connection = null;
PreparedStatement pstat = null;
int i = 0;


try{
// establish connection to database
connection = DriverManager.getConnection(
DATABASE_URL, "root", "" );

//create Statement for deleting from table
pstat = connection.prepareStatement("Delete From product Where Product_Type = ?");
pstat.setString(1, Product_Type);

//Delete data in database
i = pstat.executeUpdate();
System.out.println(i + " Records sucessfully removed from the database.");

}
catch(SQLException sqlException ) {
sqlException . printStackTrace () ;
}
finally {
try{
pstat.close () ;
connection.close () ;
}
catch ( Exception exception ){
exception . printStackTrace () ;

			}
		}
	} // end main
} // end class


