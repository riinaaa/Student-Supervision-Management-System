/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontEnd;

/**
 *
 * @author mac
 */
public class Student {
    private String stuID;
    private String stuName;
    private double stuGPA;
    private String natID;
    private int hours;
    private String stuStatus;
    private String stuMajor;
    private String advisorName;
    //---- ALL STUDENT' INFO IN THIS CLASS -----
    
    //CONSTRUCTOR
    public Student(String stuID, String stuName, double stuGPA, String natID, int hours, String stuStatus, String stuMajor, String svName) {
        this.stuID = stuID;
        this.stuName = stuName;
        this.stuGPA = stuGPA;
        this.natID = natID;
        this.hours = hours;
        this.stuStatus = stuStatus;
        this.stuMajor = stuMajor;    
        this.advisorName = svName;
    }

    public String getSvName() {
        return advisorName;
    }

    public void setSvName(String svName) {
        this.advisorName = svName;
    }
  
    public String getStuID() {
        return stuID;
    }

    public void setStuID(String stuID) {
        this.stuID = stuID;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public double getStuGPA() {
        return stuGPA;
    }

    public void setStuGPA(double stuGPA) {
        this.stuGPA = stuGPA;
    }

    public String getNatID() {
        return natID;
    }

    public void setNatID(String natID) {
        this.natID = natID;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getStuStatus() {
        return stuStatus;
    }

    public void setStuStatus(String stuStatus) {
        this.stuStatus = stuStatus;
    }

    public String getStuMajor() {
        return stuMajor;
    }

    public void setStuMajor(String stuMajor) {
        this.stuMajor = stuMajor;
    }

  
}
