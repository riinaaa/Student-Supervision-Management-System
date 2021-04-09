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
    
    /**
     *
     * @return from user input in the mainHome interface
     */
   
    /**
     *
     * @param email from user input in the mainHome interface
     */
   

    /**
     *
     * @return from user input in the mainHome interface
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return from user input in the mainHome interface 
     */
    public String getID() {
        return ID;
    }

    /**
     *
     * @param ID  set user id 
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
     *
     * 
     * @param password of the user 
     * @param ID of the user
     */
   


    
    
    public static int AuthLogin(String pass, String guiID) throws IOException {
        String line[];
        String ll;
   
		try {
               BufferedReader bf = new BufferedReader(new FileReader("AccountsInfo.txt"));
                    while ((ll=bf.readLine())!=null) {
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
     *this method checks if the ID entered by the user is correct to access the system 
     * @param ID of the employee
     * @return  check if the ID is stored in the system employee can enter
     * @throws FileNotFoundException
     */
    
    public static boolean isEmployee(String ID) {
     if(ID.startsWith("2"))
         return true;
     return false;
}
    public  boolean isStudent (String ID){
     if(ID.startsWith("1"))
         return true;
     return false;
    }
}
