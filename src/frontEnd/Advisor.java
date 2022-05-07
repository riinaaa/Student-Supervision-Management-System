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
  
    private String advisorID;
    private String advisorName;
    private String natID;

     //---- ALL ADVISOR' INFO IN THIS CLASS -----

      
    public Advisor() {

    }

    public Advisor(String svID, String svName, String natID) {
        this.advisorID = svID;
        this.advisorName = svName;
        this.natID = natID;
    }

    public String getAdvisorID() {
        return advisorID;
    }

    public void setAdvisorID(String advisorID) {
        this.advisorID = advisorID;
    }

    public String getAdvisorName() {
        return advisorName;
    }

    public void setAdvisorName(String advisorName) {
        this.advisorName = advisorName;
    }

   

    public String getNatID() {
        return natID;
    }

    public void setNatID(String natID) {
        this.natID = natID;
    }

    
}
