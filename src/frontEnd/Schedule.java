/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontEnd;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author mac
 */
public class Schedule {
    
    //blocks
    private int noOfStudents;
    private int block;
    private ArrayList<String> instreuctors; 
    private ArrayList<String> subjects ;
    private int level;
    public ArrayList<String> getInstreuctors() {
        return instreuctors;
    }

    public void setInstreuctors(ArrayList<String> instreuctors) {
        this.instreuctors = instreuctors;
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }
   

    public Schedule() {
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

   

    public Schedule(int noOfStudents, int block, ArrayList<String> subjects, ArrayList<String> instName , int level) {
        this.noOfStudents = noOfStudents;
        this.block = block;
        this.subjects = subjects;
        this.level=level;
    }

   
    //----------------------------------this will print each block info(courses and instructors) to file---------------------------------------------
    public void writeToAFile(ArrayList<String> subjects, int no, int level) throws FileNotFoundException, IOException{
        FileWriter f = new FileWriter("blocks.txt",true);
        BufferedWriter out = new BufferedWriter(f);
        System.out.println(level);
        if (level == 5) {
            out.write("THE,LEVEL," + level + "th" +",");
            out.write(","+"THE SUBJECTS,");
            for (int i = 0; i < subjects.size(); i++) {
                if (subjects.get(i).equals("CPIT210")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR,Doaa Sinnari " +",");
                } else { //subject will be CPCS204
                    out.write(subjects.get(i) + "," + "INSTRUCTOR,Abeer Alhothali "+"");
                }
            }
        
        } else if (level == 6) {
            out.write("\n"+"THE,LEVEL," + level + "th" +",");
            out.write(","+"THE SUBJECTS,");
            for (int i = 0; i < subjects.size(); i++) {
                if (subjects.get(i).equals("CPIT250")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR,Abeer Makky " +",");
                } else if (subjects.get(i).equals("CPIT260")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR,Shireen Saifudain " +",");
                } else if (subjects.get(i).equals("CPIT240")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR,Sara Ahmed "+",");
                } else if (subjects.get(i).equals("CPIT285")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR,Wafaa Shalash "+"");
                }
            }
        } else if (level == 7) {
            out.write("\n"+"THE LEVEL," + level + "th" +",");
            out.write(","+"THE SUBJECTS,");
            for (int i = 0; i < subjects.size(); i++) {
                if (subjects.get(i).equals("CPIT251")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR,Doaa Sinnari"+",");
                } else if (subjects.get(i).equals("CPIT280")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR,Felwa Kareem"+",");
                } else if (subjects.get(i).equals("CPIT380")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR,Soaad Baawidan"+",");
                } else if (subjects.get(i).equals("CPIT370")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR,Lina Mohasain"+"");
                }
            }
           
        } else if (level == 8) {
            out.write("\n"+"THE LEVEL," + level + "th" +",");
            out.write(","+"THE SUBJECTS,");
            for (int i = 0; i < subjects.size(); i++) {
                if (subjects.get(i).equals("CPIT305")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR,Abeer Hakeem" +",");
                } else if (subjects.get(i).equals("CPIT425")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR,Manal Bayousef" +",");
                } else if (subjects.get(i).equals("CPIT252")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR,Nada Almani"+",");
                } else if (subjects.get(i).equals("CPIT330")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR,Hanan Alotaibi"+"");
                }
            }
           
        } else if (level == 9) {
            out.write("\n"+"THE LEVEL," + level + "th" +",");
            out.write(","+"THE SUBJECTS,");
            for (int i = 0; i < subjects.size(); i++) {
                if (subjects.get(i).equals("CPIT340")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR,Noor Bajunaid"+",");
                } else if (subjects.get(i).equals("CPIT470")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR,Afraa Attiah"+",");
                } else if (subjects.get(i).equals("CPIT405")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR,Wafaa Alsaggaf"+",");
                } else if (subjects.get(i).equals("CPIT345")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR,Felwa Kareem"+"");
                }
            }
         
        } else {
            out.write("\n"+"THE LEVEL," + 10 + "th" +",");
            out.write(","+"THE SUBJECTS,");
            for (int i = 0; i < subjects.size(); i++) {
                if (subjects.get(i).equals("CPIT435")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR,Wafaa Shalash"+",");
                } else if (subjects.get(i).equals("CPIS428")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR,Asmaa Rasheed"+",");
                } else if (subjects.get(i).equals("CPIT455")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR,Monairah Taileb"+",");
                } else if (subjects.get(i).equals("CPIT340")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR,Noor Bajunaid"+"");
                }
            }
        }
       
        out.close();
    }
}
