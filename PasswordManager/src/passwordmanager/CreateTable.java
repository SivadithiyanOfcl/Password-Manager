package passwordmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class CreateTable{
	public static void main(String args[])throws Exception{
		try {
			
			JOptionPane.showMessageDialog(null, "Make sure you create a database named 'mydb' separately with password 'root'");
			JOptionPane.showMessageDialog(null, "Make sure to extract the jdbc connector and set the classpath");
			
			Class.forName("com.mysql.jdbc.Driver");
	        Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
	        PreparedStatement insert;
	        
	        insert = con1.prepareStatement("CREATE TABLE LoginDetails(NAME VARCHAR(30),USERID VARCHAR(30),PASSWORD VARCHAR(30))");
    		insert.executeUpdate();
    		
    		insert = con1.prepareStatement("CREATE TABLE LoginDetails(NAME VARCHAR(30),USERID VARCHAR(30),PASSWORD VARCHAR(30))");
    		insert.executeUpdate();
    		
    		JOptionPane.showMessageDialog(null, "Tables Created");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
