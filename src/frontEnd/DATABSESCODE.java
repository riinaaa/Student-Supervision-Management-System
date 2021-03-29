/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontEnd;

import static frontEnd.searchStudent.con;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mac
 */
public class DATABSESCODE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          try {
            // (1) load  JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // (2) set the path for the database
            String ConnectionURL = "jdbc:mysql://localhost:3306/305PROJECT_GROUP4";

            // (3) create connection
            con = DriverManager.getConnection(ConnectionURL, "root", "ManarInKorea2022");

            // (4) create statment object
            Statement st = con.createStatement();

            // (5) execute sql statment
            String sql = "CREATE TABLE STUDENT (ID INTEGER NOT NULL,"
                    + " NAME VARCHAR(50), MAJOR VARCHAR(10),"
                    + " GPA DOUBLE PRECISION, NATID VARCHAR(20), "
                    + "TYPE VARCHAR(10), ADVISOR VARCHAR(20), "
                    + "CREDITS INTEGER,"
                    + "PRIMARY KEY (ID))";

            st.executeUpdate(sql);
            st.executeUpdate("INSERT INTO STUDENT" + " VALUES(1807227,'MARWA AHMED','IT', 4.44, '11092222','ACTIVE','FELWA',75)");
            st.executeUpdate("INSERT INTO STUDENT" + " VALUES(1806443,'SARA AHMED','IT', 4.6,'119829233','ACTIVE', 'AFRAA',96)");
            st.executeUpdate("INSERT INTO STUDENT" + " VALUES(1802234,'LEENA YOUSEF','IS', 4.8, '1192983','ACTIVE','NULL',34)");
            st.executeUpdate("INSERT INTO STUDENT" + " VALUES(1807589,'HIND ASLI','CS',4.76, '11829273','ACTIVE','NULL',27)");
            st.executeUpdate("INSERT INTO STUDENT" + " VALUES(1801236,'WAAD BUNAIDER','IS', 4.22, '10028923','ACTIVE','AFRAA',58)");
            st.executeUpdate("INSERT INTO STUDENT" + " VALUES(1809981,'MARYAM FAHAD','IT', 4.55, '11822193','ACTIVE','NOOR',60)");
            System.out.println("1 row affected");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(searchStudent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(searchStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
