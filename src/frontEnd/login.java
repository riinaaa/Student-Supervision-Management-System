/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontEnd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author mac
 */
public class login {

    private String password;
    private String ID;


    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password --> from the file
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return from user input in the Home interface
     */
    public String getID() {
        return ID;
    }

    /**
     *
     * @param ID set user id
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     *
     */
    public login() {
    }


    /**
     * this method will read user's ID and passwords from file and compare it to
     * the ones used in logging in, will return an id cause its needed to
     * compare in the interfaces if either id or password didnt match the ones
     * from file it will return -1
     *
     * 
     * @return -1 mismatch or match
     */
    public static int AuthLogin(String pass, String guiID) throws IOException {
        String line[];
        String ll;

        try {
            BufferedReader bf = new BufferedReader(new FileReader("AccountsInfo.txt"));
            while ((ll = bf.readLine()) != null) {
                line = ll.split(",");
                System.out.println(line[0] + "," + line[1] + "");
                String userID = line[0];
                String Password = line[1];
                if (userID.equalsIgnoreCase(guiID.trim()) && Password.equals(pass.trim())) {
                    return Integer.parseInt(guiID);
                }
            }
            return -1;
        } catch (FileNotFoundException ex) {
            System.out.println("Error:File not found");
            return -1;
        }
    }

    /**
     * this method checks if the ID entered by the user is an employee ID which
     * starts with 2
     *
     * @param ID of the employee
     * @return check if the ID is an employee
     * @throws FileNotFoundException
     */
    public static boolean isEmployee(String ID) {
        if (ID.startsWith("2")) {
            return true;
        }
        return false;
    }

    /**
     * this method checks if the ID entered by the user is a student ID which
     * starts with 1
     *
     * @param ID of the employee
     * @return check if the ID is a student
     */
    public boolean isStudent(String ID) {
        if (ID.startsWith("1")) {
            return true;
        }
        return false;
    }
}
