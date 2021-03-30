/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontEnd;

import static frontEnd.searchStudent.con;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
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

        //Creation of Database
//       try
//       {
//        // (1) load  JDBC driver
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        
//        // (2) set the path for the database
//        String ConnectionURL = "jdbc:mysql://localhost:3306";
//        // (3) create connection
//        con = DriverManager.getConnection(ConnectionURL,"root","") ;//add your password
//        // (4) create statment object
//        Statement st = con.createStatement();
//        
//        // (5) excute sql statment
//        st.executeUpdate("CREATE DATABASE 305PROJECT_GROUP4");
//        
//        System.out.println("1 row(s) affacted");
//        // (6) close connection
//        con.close();
//        
        //------------------------------------------------------------------
        // Student Table
//          try {
//            // (1) load  JDBC driver
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            
//            // (2) set the path for the database
//            String ConnectionURL = "jdbc:mysql://localhost:3306/305PROJECT_GROUP4";
//
//            // (3) create connection
//            con = DriverManager.getConnection(ConnectionURL, "root", ""); //add your password
//
//            // (4) create statment object
//            Statement st = con.createStatement();
//            // (5) execute sql statment
//            String sql = "CREATE TABLE STUDENT (ID INTEGER NOT NULL,"
//                    + " NAME VARCHAR(50), MAJOR VARCHAR(10),"
//                    + " GPA DOUBLE PRECISION, NATID VARCHAR(20), "
//                    + "TYPE VARCHAR(10), ADVISOR VARCHAR(20), "
//                    + "CREDITS INTEGER,"
//                    + "PRIMARY KEY (ID))";
//
//            st.executeUpdate(sql);
//            st.executeUpdate("INSERT INTO STUDENT" + " VALUES(1807227,'MARWA AHMED','IT', 4.44, '11092222','ACTIVE','FELWA',75)");
//            st.executeUpdate("INSERT INTO STUDENT" + " VALUES(1806443,'SARA AHMED','IT', 4.6,'119829233','ACTIVE', 'AFRAA',96)");
//            st.executeUpdate("INSERT INTO STUDENT" + " VALUES(1802234,'LEENA YOUSEF','IS', 4.8, '1192983','ACTIVE','NULL',34)");
//            st.executeUpdate("INSERT INTO STUDENT" + " VALUES(1807589,'HIND ASLI','CS',4.76, '11829273','ACTIVE','NULL',27)");
//            st.executeUpdate("INSERT INTO STUDENT" + " VALUES(1801236,'WAAD BUNAIDER','IS', 4.22, '10028923','ACTIVE','AFRAA',58)");
//            st.executeUpdate("INSERT INTO STUDENT" + " VALUES(1809981,'MARYAM FAHAD','IT', 4.55, '11822193','ACTIVE','NOOR',60)");
//            System.out.println("1 row affected");

        //------------------------------------------------------------------
        // Advisor Table
        try {
            //  load  JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // set the path for the database
            String ConnectionURL = "jdbc:mysql://localhost:3306/305PROJECT_GROUP4";

            // create connection
            con = DriverManager.getConnection(ConnectionURL, "root", ""); //add your password

            // create statment object
            Statement st = con.createStatement();
            // execute sql statment
            String sql = "CREATE TABLE ADVISOR "
                    + "(id INTEGER not NULL, "
                    + " name VARCHAR(100), "
                    + " natID VARCHAR(100), "
                    + " phone VARCHAR(100), "
                    + " dateOfBirth VARCHAR(100), "
                    + " PRIMARY KEY ( id ))";

            st.executeUpdate(sql);

            st.executeUpdate("INSERT INTO ADVISOR" + " VALUES(227635,'Noor','10092029','050693920','9-7-1989')");
            st.executeUpdate("INSERT INTO ADVISOR" + " VALUES(221330,'Felwa','10089211','054324552','9-7-1988')");
            st.executeUpdate("INSERT INTO ADVISOR" + " VALUES(231278,'Wafaa','10345615','057543674','9-7-1975')");
            st.executeUpdate("INSERT INTO ADVISOR" + " VALUES(251489,'Doaa','100926211','050625567','9-7-1984')");
            st.executeUpdate("INSERT INTO ADVISOR" + " VALUES(261821,'Soaad','10887394','055636566','9-7-1983')");
            st.executeUpdate("INSERT INTO ADVISOR" + " VALUES(229089,'Afraa','106637883','059048325','9-7-1988')");
            st.executeUpdate("INSERT INTO ADVISOR" + " VALUES(212635,'Nada','102838977','050577648','9-7-1981')");
            System.out.println("1 row affected");

            //close connection
            con.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(searchStudent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(searchStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
