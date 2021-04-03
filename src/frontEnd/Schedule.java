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
    private int level;

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

   
    //----------------------------------------------------------------------------------------------------------------
    public void writeToAFile(ArrayList<String> subjects, int no, int level) throws FileNotFoundException, IOException{
        FileWriter f = new FileWriter("blocks.txt",true);
        BufferedWriter out = new BufferedWriter(f);
        System.out.println(level);
        if (level == 5) {
            out.write("\n"+"------------------------------------"+ "\n");
            out.write("\n"+"THE LEVEL : " + level + "th" +"\n");
            out.write("\n"+"THE SUBJECTS : " + "\n");
            for (int i = 0; i < subjects.size(); i++) {
                if (subjects.get(i).equals("CPIT210")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR : Doaa Sinnari " +"\n");
                } else {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR : Abeer Alhothali "+"\n");
                }
            }
            out.write("\n"+"------------------------------------"+ "\n");
        } else if (level == 6) {
              out.write("\n"+"THE LEVEL : " + level + "th" +"\n");
      
            out.write("\n"+"THE SUBJECTS : " + "\n");
            for (int i = 0; i < subjects.size(); i++) {
                if (subjects.get(i).equals("CPIT250")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR : Abeer Makky " +"\n");
                } else if (subjects.get(i).equals("CPIT260")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR : Shireen Saifudain " +"\n");
                } else if (subjects.get(i).equals("CPIT240")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR : Sara Ahmed "+"\n");
                } else if (subjects.get(i).equals("CPIT285")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR : Wafaa Shalash "+"\n");
                }
            }
           out.write("\n"+"------------------------------------"+ "\n");
        } else if (level == 7) {
              out.write("\n"+"THE LEVEL : " + level + "th" +"\n");

            out.write("\n"+"THE SUBJECTS : " + "\n");
            for (int i = 0; i < subjects.size(); i++) {
                if (subjects.get(i).equals("CPIT251")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR : Doaa Sinnari"+"\n");
                } else if (subjects.get(i).equals("CPIT280")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR : Felwa Kareem"+"\n");
                } else if (subjects.get(i).equals("CPIT380")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR : Soaad Baawidan"+"\n");
                } else if (subjects.get(i).equals("CPIT370")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR : Lina Mohasain"+"\n");
                }
            }
           out.write("\n"+"------------------------------------ "+ "\n");
        } else if (level == 8) {
              out.write("\n"+"THE LEVEL : " + level + "th" +"\n");
            out.write("\n"+"THE SUBJECTS : " + "\n");
            for (int i = 0; i < subjects.size(); i++) {
                if (subjects.get(i).equals("CPIT305")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR : Abeer Hakeem " +"\n");
                } else if (subjects.get(i).equals("CPIT425")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR : Manal Bayousef" +"\n");
                } else if (subjects.get(i).equals("CPIT252")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR : Nada Almani"+"\n");
                } else if (subjects.get(i).equals("CPIT330")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR : Hanan Alotaibi"+"\n");
                }
            }
            out.write("\n"+"------------------------------------"+ "\n");
        } else if (level == 9) {
              out.write("\n"+"THE LEVEL : " + level + "th" +"\n");
            out.write("\n"+"THE SUBJECTS : " + "\n");
            for (int i = 0; i < subjects.size(); i++) {
                if (subjects.get(i).equals("CPIT340")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR : Noor Bajunaid"+"\n");
                } else if (subjects.get(i).equals("CPIT470")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR : Afraa Attiah"+"\n");
                } else if (subjects.get(i).equals("CPIT405")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR : Wafaa Alsaggaf"+"\n");
                } else if (subjects.get(i).equals("CPIT345")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR : Felwa Kareem"+"\n");
                }
            }
            out.write("\n"+"------------------------------------"+ "\n");
        } else {
              out.write("\n"+"THE LEVEL : " + 10 + "th" +"\n");
            out.write("\n"+"THE SUBJECTS : " + "\n");
            for (int i = 0; i < subjects.size(); i++) {
                if (subjects.get(i).equals("CPIT435")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR : Wafaa Shalash"+"\n");
                } else if (subjects.get(i).equals("CPIS428")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR : Asmaa Rasheed"+"\n");
                } else if (subjects.get(i).equals("CPIT455")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR : Monairah Taileb"+"\n");
                } else if (subjects.get(i).equals("CPIT340")) {
                    out.write(subjects.get(i) + "," + "INSTRUCTOR : Noor Bajunaid"+"\n");
                }
            }
        }
        out.write("------------------------------------");
        out.close();
    }
}
