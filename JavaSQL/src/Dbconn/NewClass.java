package Dbconn;

import java.sql.*;

public class NewClass {
final static String connectionURL = "jdbc:mysql://localhost:3306/Skoczkowie";
								//nazwa.sterownika:nazwa servBazodanowego:nrPortu/nazwa db
final static String name = "root"; 
final static String pass = "Hwdpik.hwdpik4"; 


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//rejestracja klasy sterownika
		Class.forName("com.mysql.jdbc.Driver"); 
		//utworzenie polaczenia
		Connection con = DriverManager.getConnection(connectionURL, name, pass); 
		//utworzenie wyrazenia sql 
		Statement stmt = con.createStatement(); 
		//wykonanie zapytania
		//con.setAutoCommit(false);
		con.setAutoCommit(true);
		ResultSet rs = stmt.executeQuery("select * from zawodnicy"); 
		stmt.executeQuery("delete froma zawodnicy where imie= 'Georg'"); 

		while(rs.next()) {
			System.out.println(rs.getInt(1)+ " " + rs.getString(2)+ " " + rs.getString(3)+ " " + rs.getString(4)+ " " + rs.getString(5)+ " " + rs.getInt(6)+ " " + rs.getInt(7));
		//zamkniecie polaczenia 
			
			
		}
		con.close();


	}

}
