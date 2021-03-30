/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontEnd;

import static frontEnd.searchStudent.con;
import static frontEnd.searchStudent.st;
import java.awt.Font;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

/**
 *
 * @author mac
 */
public class Advisor {
    private String svID;
    private String svName;
    private String natID;

     

      
    public Advisor() {

    }

    public Advisor(String svID, String svName, String natID) {
        this.svID = svID;
        this.svName = svName;
        this.natID = natID;
    }

    

    public String getSvID() {
        return svID;
    }

    public void setSvID(String svID) {
        this.svID = svID;
    }

    public String getSvName() {
        return svName;
    }

    public void setSvName(String svName) {
        this.svName = svName;
    }

   

    public String getNatID() {
        return natID;
    }

    public void setNatID(String natID) {
        this.natID = natID;
    }

    
    public  void addStudent (String id,String name, String major, double gpa,String natiD,String type, String advisor,String credits) throws IOException, ClassNotFoundException, SQLException{
   /*  Class.forName("com.mysql.cj.jdbc.Driver");
       // (2) set the path for the database
        String ConnectionURL = "jdbc:mysql://localhost:3306/305PROJECT_GROUP4";

        // (3) create connection
        con = DriverManager.getConnection(ConnectionURL, "root", "");

        // (4) create statment object
        st = con.createStatement();
       
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(
                "serif", Font.BOLD, 16)));
        while (true) {
            if (id!= null && name != null && major!= null && gpa!= null && natID!= null && type != null && advisor!= null) {
                st.executeUpdate("INSERT INTO STUDENT" + " VALUES(" + Integer.parseInt(id) + ",'" + name + "','" + major + "', " + Double.parseDouble(gpa) + ", '" + natID+ "','" + type + "','" + advisor + "'," + Integer.parseInt(credits) + ")");
                //updateList();
                JOptionPane.showMessageDialog(this, " Student added successfully");
                break;
            }
            JOptionPane.showMessageDialog(this, "Please enter all fields information");
        }    */    
                
    }
    public void updateStudent (String id){
        
    }
    public void deleteStudent(String id){
        
    }
}
