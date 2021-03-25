package ca3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class InvoiceDisplay {

	// database URL
	static final String DATABASE_URL = "jdbc:mysql://localhost/customerpurchases";
	
	public static void main(String[] args) {
		
		Connection connection = null;
		PreparedStatement pstat = null;
		ResultSet resultSet = null;

		try{
			// establish connection to database
			connection = DriverManager.getConnection(
			DATABASE_URL, "root", "" );
			// create PreparedStatement for querying table
			pstat = connection.prepareStatement("SELECT Date_Purchased, Product_Price, Quantity FROM invoice");
			// query database
			resultSet = pstat.executeQuery();
		
			// process query results
			ResultSetMetaData metaData = resultSet.getMetaData();
			int numberOfColumns = metaData.getColumnCount();
			System.out.println("Invoice Table of CustomerPurchases Database:\n" );
			for ( int i = 1; i <= numberOfColumns; i++ )
			System.out.print(metaData.getColumnName(i) + "\t");
			System.out.println(); 
			
			while( resultSet .next() ){
				for ( int i = 1; i <= numberOfColumns; i++ )
				System.out. print ( resultSet .getObject( i ) + "\t\t");
				System.out. println () ;
				}
				}
				catch(SQLException sqlException ) {
				sqlException . printStackTrace () ;
				}
				finally {
				try{
				resultSet . close () ;
				pstat. close () ;
				connection. close () ;
				}
				catch ( Exception exception ){
				exception . printStackTrace () ;
				}
				}
				} // end main
				} // end class

		
		

	


