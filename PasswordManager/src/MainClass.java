import java.sql.*;

import javax.swing.JOptionPane;

public class MainClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try  
        {  
            WelcomePage ld = new WelcomePage();  
            ld.setVisible(true);
            ld.setSize(700,400);
            //ld.setLocationRelativeTo(null);
            ld.setResizable(false);
        }  
        catch(Exception e)  
        {     
            JOptionPane.showMessageDialog(null, e.getMessage());
        }   
	}

}
