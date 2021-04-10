/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontEnd;

import static frontEnd.Home.bwSD;
import static frontEnd.Home.stuInfo;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

/**
 *
 * @author mac
 */
public class searchStudent extends javax.swing.JFrame {

    static Connection con;
    static ArrayList<String> ids = new ArrayList<>();
    static String split[];
    static BufferedReader bw;
    static ResultSet res;
    static Statement st;
    DefaultListModel dlm;

    /**
     * Creates new form searchStudent
     */
    public searchStudent(ArrayList<Student> stuInfo, FileWriter bwSD) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        bwSD = new FileWriter("Student.txt", true);
        initComponents();
        Class.forName("com.mysql.cj.jdbc.Driver");

        // (2) set the path for the database
        String ConnectionURL = "jdbc:mysql://localhost:3306/305PROJECT_GROUP4";

        // (3) create connection
        con = DriverManager.getConnection(ConnectionURL, "root", "");

        // (4) create statment object
        st = con.createStatement();
        setLocationRelativeTo(null);

        updateList();

    }

    // updating the list so in case of updating/deleting to the student's info
    public void updateList() throws SQLException {
        DefaultListModel dlm = new DefaultListModel();
        res = st.executeQuery("SELECT ID FROM STUDENT ");
        while (res.next()) {
            String i = res.getString("ID");
            System.out.println(i);
            dlm.addElement(i);
            list.setModel(dlm);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        natID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        major = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        gpa = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        credits = new javax.swing.JTextField();
        advisor = new javax.swing.JTextField();
        type = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        contact = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        add = new javax.swing.JPanel();
        addStu = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        update = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        clear = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        deleteStu = new javax.swing.JLabel();
        delete1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        deleteStu1 = new javax.swing.JLabel();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(880, 660));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 77));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 255));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 764, -1, -1));

        jLabel2.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setText("Student's ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 166, -1, -1));

        list.setBackground(new java.awt.Color(255, 204, 102));
        list.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 255)));
        list.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        list.setForeground(new java.awt.Color(0, 51, 102));
        list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1", "2", "3", "4" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(list);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 216, 200, 329));

        jLabel3.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 102));
        jLabel3.setText("Search Student ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 28, -1, 75));

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 255)));

        jLabel6.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("Naional ID");

        jLabel8.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setText("Major");

        jLabel9.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 102));
        jLabel9.setText("Student Name");

        jLabel10.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
        jLabel10.setText("ID");

        jLabel11.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 102));
        jLabel11.setText("Credits");

        jLabel12.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 102));
        jLabel12.setText("GPA");

        jLabel13.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 102));
        jLabel13.setText("Acdemic Advisor");

        jLabel14.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 102));
        jLabel14.setText("Student Type");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(102, 102, 102)
                .addComponent(jLabel11)
                .addGap(57, 57, 57))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(natID, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(39, 39, 39)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(major, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(gpa, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(credits, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(advisor)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(82, 82, 82))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(natID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(major, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(credits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(advisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 216, -1, -1));

        jLabel5.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 102));
        jLabel5.setText("Information");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 166, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cpit305project/icons/back-2.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 72, 84));

        contact.setBackground(new java.awt.Color(255, 204, 255));
        contact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactMouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel15.setText("Contact");

        javax.swing.GroupLayout contactLayout = new javax.swing.GroupLayout(contact);
        contact.setLayout(contactLayout);
        contactLayout.setHorizontalGroup(
            contactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contactLayout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(67, 67, 67)
                .addComponent(jLabel16)
                .addGap(155, 155, 155))
        );
        contactLayout.setVerticalGroup(
            contactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 563, -1, -1));

        add.setBackground(new java.awt.Color(255, 204, 255));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });

        addStu.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        addStu.setText("ADD");
        addStu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addStuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout addLayout = new javax.swing.GroupLayout(add);
        add.setLayout(addLayout);
        addLayout.setHorizontalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(145, 145, 145))
            .addGroup(addLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addStu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addLayout.setVerticalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addLayout.createSequentialGroup()
                .addComponent(addStu, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 2, Short.MAX_VALUE))
        );

        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 563, 44, -1));

        update.setBackground(new java.awt.Color(255, 204, 255));
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel19.setText("UPDATE");

        javax.swing.GroupLayout updateLayout = new javax.swing.GroupLayout(update);
        update.setLayout(updateLayout);
        updateLayout.setHorizontalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );
        updateLayout.setVerticalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(updateLayout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 563, 70, -1));

        clear.setBackground(new java.awt.Color(255, 204, 255));
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });

        deleteStu.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        deleteStu.setText("CLEAR");
        deleteStu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteStuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout clearLayout = new javax.swing.GroupLayout(clear);
        clear.setLayout(clearLayout);
        clearLayout.setHorizontalGroup(
            clearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clearLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(170, 170, 170))
            .addGroup(clearLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(deleteStu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        clearLayout.setVerticalGroup(
            clearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clearLayout.createSequentialGroup()
                .addComponent(deleteStu, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 600, 200, 31));

        delete1.setBackground(new java.awt.Color(255, 204, 255));
        delete1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete1MouseClicked(evt);
            }
        });

        deleteStu1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        deleteStu1.setText("DELETE");
        deleteStu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteStu1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout delete1Layout = new javax.swing.GroupLayout(delete1);
        delete1.setLayout(delete1Layout);
        delete1Layout.setHorizontalGroup(
            delete1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, delete1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(170, 170, 170))
            .addGroup(delete1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteStu1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        delete1Layout.setVerticalGroup(
            delete1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete1Layout.createSequentialGroup()
                .addComponent(deleteStu1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 563, 71, 31));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 930, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        supervisorMenu sv = new supervisorMenu(null, null);
        sv.setVisible(true);

    }//GEN-LAST:event_jLabel1MouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked


    }//GEN-LAST:event_addMouseClicked

    // contact the chosen student button will open the serverGUI
    private void contactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactMouseClicked
        serverGUI g;
        try {
            g = new serverGUI();
            g.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(searchStudent.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_contactMouseClicked

    // the supervisor can update the student's info then clicking the update button to update the DB as well
    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked

        double gppa = Double.valueOf(gpa.getText());
        int idd = Integer.valueOf(id.getText());
        int cred = Integer.valueOf(credits.getText());

        try {
            Statement st = con.createStatement();
            String query = "update STUDENT set ID=?, Name=?, Major=?, GPA=?, NATID=?, type=?, advisor=?, CREDITS=? where ID=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, idd);
            ps.setString(2, name.getText());
            ps.setString(3, major.getText());
            ps.setDouble(4, gppa);
            ps.setString(5, natID.getText());
            ps.setString(6, type.getText());
            ps.setString(7, advisor.getText());
            ps.setInt(8, cred);
            ps.setString(9, list.getSelectedValue());

            ps.executeUpdate();
            ps.close();
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(
                    "serif", Font.BOLD, 16)));
            JOptionPane.showMessageDialog(null, "The student was updated succesfully");

        } catch (SQLException ex) {
            Logger.getLogger(searchStudent.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_updateMouseClicked

    //clear the form to make it easier for adding new students
    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        gpa.setText(null);
        major.setText(null);
        natID.setText(null);
        advisor.setText(null);
        credits.setText(null);
        type.setText(null);
        name.setText(null);
        id.setText(null);

    }//GEN-LAST:event_clearMouseClicked

    // this will show student's information that the supervisor chose
    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked
        ResultSet r;
        try {
            r = st.executeQuery("SELECT * FROM STUDENT ");
            while (r.next()) {
                String i = r.getString("ID");
                if (list.getSelectedValue().equals(i)) {
                    gpa.setText(r.getString("GPA"));
                    major.setText(r.getString("MAJOR"));
                    natID.setText(r.getString("NATID"));
                    advisor.setText(r.getString("ADVISOR"));
                    credits.setText(r.getString("CREDITS"));
                    type.setText(r.getString("TYPE"));
                    name.setText(r.getString("NAME"));
                    id.setText(r.getString("ID"));

                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(searchStudent.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_listMouseClicked
    // deleting a specific student from the supervisor's list
    private void deleteStuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteStuMouseClicked
        ResultSet r;
        try {
            r = st.executeQuery("SELECT * FROM STUDENT ");
            while (r.next()) {
                String i = r.getString("ID");
                if (list.getSelectedValue().equals(i)) {
                    String sql = "DELETE FROM STUDENT WHERE ID =" + id.getText();
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(
                            "serif", Font.BOLD, 16)));
                    int delete = st.executeUpdate(sql);
                    if (delete == 1) {
                        gpa.setText("");
                        major.setText("");
                        natID.setText("");
                        advisor.setText("");
                        credits.setText("");
                        type.setText("");
                        name.setText("");
                        id.setText("");
                        updateList();
                    } else {
                        System.out.println("Student is not deleted.");
                    }
                    break;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(searchStudent.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_deleteStuMouseClicked

    // the supervisor will add a new student's and fill the information form
    private void addStuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addStuMouseClicked
        try {
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(
                    "serif", Font.BOLD, 16)));
            while (true) {
                if (id.getText() != null && name.getText() != null && major.getText() != null && gpa.getText() != null && natID.getText() != null && type.getText() != null && advisor.getText() != null) {
                    st.executeUpdate("INSERT INTO STUDENT" + " VALUES(" + Integer.parseInt(id.getText()) + ",'" + name.getText() + "','" + major.getText() + "', " + Double.parseDouble(gpa.getText()) + ", '" + natID.getText() + "','" + type.getText() + "','" + advisor.getText() + "'," + Integer.parseInt(credits.getText()) + ")");
                    updateList();
                    JOptionPane.showMessageDialog(this, " Student added successfully");
                    break;
                }
                JOptionPane.showMessageDialog(this, "Please enter all fields information");
            }

        } catch (SQLException ex) {
            Logger.getLogger(searchStudent.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_addStuMouseClicked

    private void deleteStu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteStu1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteStu1MouseClicked

    private void delete1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete1MouseClicked
        ResultSet r;
        try {
            r = st.executeQuery("SELECT * FROM STUDENT ");
            while (r.next()) {
                String i = r.getString("ID");
                if (list.getSelectedValue().equals(i)) {
                    String sql = "DELETE FROM STUDENT WHERE ID =" + id.getText();
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(
                            "serif", Font.BOLD, 16)));
                    int delete = st.executeUpdate(sql);
                    if (delete == 1) {
                        gpa.setText("");
                        major.setText("");
                        natID.setText("");
                        advisor.setText("");
                        credits.setText("");
                        type.setText("");
                        name.setText("");
                        id.setText("");
                        updateList();
                        JOptionPane.showMessageDialog(this, " Student is deleted successfully");
                    } else {
                        JOptionPane.showMessageDialog(this, " Student is not deleted successfully");
                    }
                    break;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(searchStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_delete1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException {
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
            java.util.logging.Logger.getLogger(searchStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(searchStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(searchStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(searchStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new searchStudent(stuInfo, bwSD).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(searchStudent.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(searchStudent.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(searchStudent.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        con.close();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add;
    private javax.swing.JLabel addStu;
    private javax.swing.JTextField advisor;
    private javax.swing.JPanel clear;
    private javax.swing.JPanel contact;
    private javax.swing.JTextField credits;
    private javax.swing.JPanel delete1;
    private javax.swing.JLabel deleteStu;
    private javax.swing.JLabel deleteStu1;
    private javax.swing.JTextField gpa;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> list;
    private javax.swing.JTextField major;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField natID;
    private javax.swing.JTextField type;
    private javax.swing.JPanel update;
    // End of variables declaration//GEN-END:variables
}
