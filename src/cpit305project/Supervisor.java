/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit305project;

import static cpit305project.addStudent.stds;
import static cpit305project.addStudent.stuID;
import static cpit305project.addStudent.stuMajor;
import static cpit305project.addStudent.stuName;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import static sun.jvm.hotspot.debugger.amd64.AMD64ThreadContext.CS;
import static sun.tools.jconsole.Messages.IS;

/**
 *
 * @author mac
 */
public class Supervisor {
 private String svID;
  private String svName;
  private String natID;

    Supervisor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public Supervisor(String svID, String svName, String natID) {
        this.svID = svID;
        this.svName = svName;
       
        this.natID = natID;
    }
    
    public  void addStudent (String sv, String major, String id) throws IOException{
       if(major.equals("IT")){
                    System.out.println("entered IT");
                    //check is ID entered by the sv matches the student's to add the sv
                    for (int i = 0; i < stds.size(); i++) {
                        if (stds.get(i).getStuID().equals(id)) {
                            System.out.println("entered ID " + stds.get(i).getStuID());
                            FileWriter fr = new FileWriter ("addstudent.txt");
                            fr.append(sv);
                            //stds.get(i).setSvName(Home.svName);
                       
                            //to modify the supervisor's attribute we need to reach to a specific position
                            //thus, random file is used.
                            //***** WEDYAN HERE *****
                           /* final int EOF = -1;
                            try {
                            RandomAccessFile ra = new RandomAccessFile("student1.txt", "rw");
                         
                                ra.seek(70);
                                ra.writeUTF("noor");
                           
                          } catch (FileNotFoundException ex) {
                                Logger.getLogger(addStudent.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException ex) {
                                Logger.getLogger(addStudent.class.getName()).log(Level.SEVERE, null, ex);
                       }*/
                   UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(
                           "serif", Font.BOLD, 16)));
                   JOptionPane.showMessageDialog(null, " Student Added Succesfully");
               }
           }

                } else if (major.equals("CS")) {//CS
                    stuMajor = "CS";
                     System.out.println("entered CS");
                    //check is ID entered by the sv matches the student's to add the sv
                    for (int i = 0; i < stds.size(); i++) {
                      
                        if (stds.get(i).getStuID().equals(id)) {
                            System.out.println("entered ID " + stds.get(i).getStuID());
                            stds.get(i).setSvName(Home.svName);
                            System.out.println(stds.get(i).getSvName());
                            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(
                           "serif", Font.BOLD, 16)));
                   JOptionPane.showMessageDialog(null, " Student Added Succesfully");
                        } 
                    }
                } else {//IS
                    System.out.println("entered IS");
                    stuMajor = "IS";
                    //check is ID entered by the sv matches the student's to add the sv
                    for (int i = 0; i < stds.size(); i++) {
                        System.out.println(stds.get(i).getStuID());
                        System.out.println(id);
                        if (stds.get(i).getStuID().equals(id)) {
                            System.out.println("entered ID " + stds.get(i).getStuID());
                            stds.get(i).setSvName("noor");
                            final int EOF = -1;
                            try {
                                RandomAccessFile ra = new RandomAccessFile("student1.txt", "rw");
                                while (ra.read() != EOF) {
                                    ra.seek(13);
                                    System.out.println(ra.readUTF());
                                    System.out.println(ra.readUTF().equals(id));
                                    if (ra.readUTF().equals(id)) {
                                        ra.seek(70);
                                        ra.writeUTF("noor");
                                        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(
                                                "serif", Font.BOLD, 16)));
                                        JOptionPane.showMessageDialog(null, " Student Added Succesfully");

                                    }

                                }
                            }
                            
                                catch (FileNotFoundException ex) {
                                Logger.getLogger(addStudent.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (IOException ex) {
                                Logger.getLogger(addStudent.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.println(stds.get(i).getSvName());
                        } 
                    }
                }
    }

}
    

