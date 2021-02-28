/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit305project;

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
    public static final int name = 10;

    public static int getName() {
        return name;
    }

    public static int getId() {
        return id;
    }

    public static int getGpa() {
        return gpa;
    }

    public static int getMajor() {
        return major;
    }

    public static int getHourss() {
        return hourss;
    }

    public static int getSvname() {
        return svname;
    }
   public static final int id = 4;
   public static final int gpa = 4;
    public static final int major = 10;
   public static final int hourss = 4;
   public static final int svname = 10;

    public static int getRECORD_SIZE() {
        return RECORD_SIZE;
    }
   public static final int RECORD_SIZE = (name + id + gpa+ major+hourss+svname) + 1;  
  
    private String svName;

    public Student(String stuID, String stuName, double stuGPA, String natID, int hours, String stuStatus, String stuMajor, String svName) {
        this.stuID = stuID;
        this.stuName = stuName;
        this.stuGPA = stuGPA;
        this.natID = natID;
        this.hours = hours;
        this.stuStatus = stuStatus;
        this.stuMajor = stuMajor;
     
        this.svName = svName;
    }

    public String getSvName() {
        return svName;
    }

    public void setSvName(String svName) {
        this.svName = svName;
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
