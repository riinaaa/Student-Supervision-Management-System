/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontEnd;

import static frontEnd.Home.bwSD;
import static frontEnd.Home.stuInfo;
import static frontEnd.Home.svName;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

/**
 *
 * @author mac
 */
public class addStudent extends javax.swing.JFrame  {
    static int stuID;
    static BufferedWriter bfSV;
    static String stuMajor;
    static String stuName;
    static String line;
    static String line1;
    static String line2;
    static String line3;
    static String line4;
    static String line5;
    static String line6;
    static Supervisor sv ;
    static Connection connection;
    static ArrayList<String> linesNo = new ArrayList<>();
  //  static ArrayList<Student> stds;
//    static final ArrayList <Student> stuInfo = new ArrayList<>();
//    static FileWriter bwSD ;//= new BufferedWriter (new FileWriter ("Student.txt"));

    /**
     * Creates new form addStudent
     */
    public addStudent(ArrayList <Student> stuInfo ,FileWriter bwSD  ) throws IOException {
        bwSD = new FileWriter ("Student.txt",true);
        initComponents();setLocationRelativeTo(null);
        System.out.println(Home.svName);
        boolean b = connect();
        System.out.println("Response of DB connection: " + b);
        //add students' info in a file without the supervisor's name because the sv's name will
        //be added after the supervisor adds the students
//        RandomAccessFile ra = new RandomAccessFile("student1.txt", "rw");
//        RandomAccessFile raa = new RandomAccessFile("student1.txt", "r");
        //arraylist of objects -- size of students is unpredictable
       /*stds = new ArrayList<>();
       //declare student one object
       //(String stuID, String stuName, double stuGPA, String natID, int hours, String stuStatus, String stuMajor, String svName) {
       Student std1 = new Student("1807227","MarwaAhmed",4.44,"110922222", 75, "Active", "IT", null);
       Student std2 = new Student("1806443","SaraAhmed",4.60,"119829233", 96, "Active", "IT", null);
       Student std3 = new Student("1802234","LeenaNour",4.80,"11092983", 34, "Active", "IS", null);
       Student std4 = new Student("1807589","HindAsli",4.76,"11829273", 58, "Active", "CS", null);
       Student std5 = new Student("1801236","WaadBunaider",4.22,"10028923", 27, "Active", "IS", null);
       Student std6 = new Student("1809981","MaryamFahad",4.55,"11822193", 60, "Active", "IT", null);
       //add them to the array
       stds.add(std1); stds.add(std2); stds.add(std3); stds.add(std4);stds.add(std5);stds.add(std6);
       //write them to the file
       bwSD = new FileWriter ("Student.txt");//(new FileWriter ("Student.txt"));
        for (int i = 0; i < stds.size(); i++) {
            bwSD.write(stds.get(i).getStuName()+","+stds.get(i).getStuMajor() +"," + stds.get(i).getStuID() + "," +stds.get(i).getStuGPA()
                  +","+stds.get(i).getHours()  +"," + stds.get(i).getNatID()+"," + stds.get(i).getStuStatus()+ "," + stds.get(i).getSvName()
           +"\r\n" );            
        }
        
        System.out.println("size of array " + stds.size());
        bwSD.flush();*/
//        System.out.println("before writing: " + ra.getFilePointer());
//        ra.seek(1);
//       
//        for (int i = 0; i < stds.size(); i++) {
//            ra.writeUTF("0, ");
//            ra.writeUTF(stds.get(i).getStuMajor());
//            ra.writeUTF(",");
//            ra.writeUTF(stds.get(i).getStuID());
//            ra.writeUTF(",");
//            ra.writeDouble(stds.get(i).getStuGPA());
//            ra.writeUTF(",");
//            ra.writeInt(stds.get(i).getHours());
//            ra.writeUTF(",");
//            ra.writeUTF(stds.get(i).getNatID());
//            ra.writeUTF(",");
//            ra.writeUTF(stds.get(i).getStuStatus());
//            ra.writeUTF(",");
//            ra.writeUTF("null");
//            ra.writeUTF("\n");
//        }
          

        
//        System.out.println("after writing: " + ra.getFilePointer());//375
//        ra.seek(1);
//        System.out.println(ra.readUTF());
//        System.out.println(ra.readUTF());
//        System.out.println(ra.readUTF());
//        System.out.println(ra.getFilePointer());
//        System.out.println(ra.readUTF());
//        System.out.println(ra.readUTF());
//        System.out.println(ra.readDouble());
//        System.out.println(ra.readUTF());
//        System.out.println(ra.readInt());
//        System.out.println(ra.readUTF());
//        System.out.println(ra.readUTF());
//        System.out.println(ra.readUTF());
//        System.out.println(ra.readUTF());
//        System.out.println(ra.readUTF());
//        System.out.println(ra.readUTF());
//        System.out.println(ra.getFilePointer());
        
        
       /* ra.seek(13);//id position
        System.out.println("13 is " +ra.readUTF().trim());
         
        ra.seek(89);//id position
        System.out.println("89 is " +ra.readUTF().trim());
          
        ra.seek(165);//id position
        System.out.println("165 is " +ra.readUTF().trim());

        ra.seek(265);//id position
        System.out.println("241 is " +ra.readUTF().trim());
        
        ra.seek(317);//sv
        System.out.println("317 is " +ra.readUTF().trim());*/
         
        //supervisor seeks
        //ra.seek(72);//id position
        //System.out.println("70 is " +ra.readUTF().trim());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        add = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        IT = new javax.swing.JRadioButton();
        CS = new javax.swing.JRadioButton();
        IS = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 77));

        jLabel1.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setText("Enter Student Info");

        jLabel2.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 255));
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 255));
        jLabel3.setText("Name ");

        id.setBackground(new java.awt.Color(51, 51, 77));
        id.setFont(new java.awt.Font("Apple LiSung", 0, 14)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        add.setBackground(new java.awt.Color(255, 204, 102));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("ADD");

        javax.swing.GroupLayout addLayout = new javax.swing.GroupLayout(add);
        add.setLayout(addLayout);
        addLayout.setHorizontalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel5)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        addLayout.setVerticalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 255));
        jLabel6.setText("Major");

        jLabel7.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 255));

        name.setBackground(new java.awt.Color(51, 51, 77));
        name.setFont(new java.awt.Font("Apple LiSung", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        IT.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        IT.setText("IT");

        CS.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        CS.setText("CS");

        IS.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        IS.setText("IS");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cpit305project/icons/back-2.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(IT)
                                                .addGap(82, 82, 82)
                                                .addComponent(CS)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(IS))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel2)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(285, 285, 285)))))
                .addGap(252, 252, 252))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(72, 72, 72))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(IT)
                    .addComponent(CS)
                    .addComponent(IS))
                .addGap(36, 36, 36)
                .addComponent(jLabel7)
                .addGap(77, 77, 77)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 750, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        BufferedReader brSD = null;
        String line = "";
       
        String[] split;
        try {
            stuID = Integer.parseInt(id.getText());
            stuName = name.getText();
      //supervisor added this student under his supervision 
      
            for (int i = 0; i < stuInfo.size(); i++) {
                if(stuInfo.get(i).getStuID().equalsIgnoreCase(stuID+"")){
                    System.out.println("enter to iiiiiiiiiiiiiiiifffffffffff loop");
                  stuInfo.get(i).setSvName(Home.svName);
                  break;
                }
            }
           
            for (int i = 0; i < stuInfo.size(); i++) {
            bwSD.write(stuInfo.get(i).getStuName()+","+stuInfo.get(i).getStuMajor() +"," + stuInfo.get(i).getStuID() + "," +stuInfo.get(i).getStuGPA()
                  +","+stuInfo.get(i).getHours()  +"," + stuInfo.get(i).getNatID()+"," + stuInfo.get(i).getStuStatus()+ "," + stuInfo.get(i).getSvName()
           +"\r\n" );            
        }
           
            bwSD.close();
        } catch (NumberFormatException ex) {
            System.out.println("the entered numbers is string not integer cannot be casted to integer");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(addStudent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(addStudent.class.getName()).log(Level.SEVERE, null, ex);
        } finally { //this code is so important it must be implemented

            if (IT.isSelected() && CS.isSelected() == true || IT.isSelected() == true && IS.isSelected() == true || CS.isSelected() == true
                    && IS.isSelected() == true) {
                UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(
                        "serif", Font.BOLD, 16)));
                JOptionPane.showMessageDialog(this, " You have to select one major");
            } else if (IT.isSelected() == true && CS.isSelected() == true && IS.isSelected() == true) {
                UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(
                        "serif", Font.BOLD, 16)));
                JOptionPane.showMessageDialog(this, " You have to select one major");
            } else {
                if (IT.isSelected() == true && CS.isSelected() == false && IS.isSelected() == false) {//it is IT
                    stuMajor = "IT";
                    System.out.println("entered IT");
                     sv = new Supervisor("50",Home.svName,"10025555");
                    try {
                        sv.addStudent(Home.svName, stuMajor, id.getText());
                    } catch (IOException ex) {
                        Logger.getLogger(addStudent.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else if (IT.isSelected() == false && CS.isSelected() == true && IS.isSelected() == false) {//CS
                    stuMajor = "CS";
                    System.out.println("entered CS");
                     sv = new Supervisor("50",Home.svName,"10025555");
                    try {
                        sv.addStudent(Home.svName, stuMajor, id.getText());
                    } catch (IOException ex) {
                        Logger.getLogger(addStudent.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                } else {//IS
                    System.out.println("entered IS");
                    stuMajor = "IS";
                     sv = new Supervisor("50",Home.svName,"10025555");
                    try {
                        sv.addStudent(Home.svName, stuMajor, id.getText());
                    } catch (IOException ex) {
                        Logger.getLogger(addStudent.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } // Finally
    }//GEN-LAST:event_addMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        supervisorMenu sv = new supervisorMenu (null,null);
        sv.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked
        public boolean connect()
{
      try
        {
            // (1) load  JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // (2) set the path for the database
            String ConnectionURL = "jdbc:mysql://localhost:3306/sys";
            
            // (3) create connection
            connection = DriverManager.getConnection(ConnectionURL,"root","ManarInKorea2022") ;
        }
         catch(Exception exception)
        {
            System.out.println("This is DB exception:"+exception);
             return false ;
        }

        if(connection != null)
            return true ;
        else
            return false ;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(addStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new addStudent(stuInfo , bwSD).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(addStudent.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton CS;
    private javax.swing.JRadioButton IS;
    private javax.swing.JRadioButton IT;
    private javax.swing.JPanel add;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}
