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
     * @param email of the student
     * @param password of the student 
     * @param ID of the employee
     */
   

    /**
     *this method checks if the email the student entered contains these letteres to verify its a KAU email
    since this system is made for KAU students
     * @param email KAU email
     * @return check KAU if true user can enter if false user will not be able to enter the system
     */
    
    

    /**
     *A KAU student password must start with A and a thus this method checks if the password starts with A followed by a
     * @param password  Student password
     * @return checkPass check KAU if true user can enter if false user will not be able to enter the system
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
    
    
    
//    public boolean isCorrectPasswordSTD(String password){
//        this.password=password;
//        boolean checkPass;
//        System.out.println(password.charAt(0));
//        checkPass = password.charAt(0) =='A' && password.charAt(1)=='a';
//            return checkPass;
//    }
//
//    /**
//     *not every person can add books to the system. only employees thus, this method checks if the entered password by the employees
//    after checking their ID is correct according to the data stored in the file
//     * @param password
//     * @param ID
//     * @return check if the password of the employee corect
//     * @throws FileNotFoundException
//     */
//   
//    public static boolean isCorrectPasswordEmp(String password, String ID) throws FileNotFoundException{
//      
//   boolean check = false;
//   //employee ID then password stored in the file
//           File output = new File("Employee.txt");
//           Scanner read = new Scanner(output);
//      while(read.hasNext()){
//          switch(read.next()){
//              case "1" : 
//                 String info [] = read.next().split(",");
//                 if(password.equals(info[2])){
//            check=true;
//                 }
//            break;
//              case "2": 
//                 String info2 [] =read.next().split(",");
//                 if(password.equals(info2[2])){
//            check=true; }break;
//              case "3":
//                      String info3 [] = read.next().split(",");
//                 if(password.equals(info3[2])){
//            check=true;}
//              break;
//              case "4":
//                      String info4 [] = read.next().split(",");
//                 if(password.equals(info4[2])){
//            check=true;}
//            break;
//            case "5" : 
//                              String info5 [] = read.next().split(",");
//                 if(password.equals(info5[2])){
//            check=true;
//                      break;
//      }
//    
//    }
// 
//    }
//       return check;
//    }
     
    /**
     *this method checks if the ID entered by the user is correct to access the system and be able to add books to the system
     * @param ID of the employee
     * @return  check if the ID is stored in the system employee can enter
     * @throws FileNotFoundException
     */
    
    public static boolean isEmployee(String ID) {
     if(ID.startsWith("2"))
         return true;
     return false;
}
    public static boolean isStudent (String ID){
     if(ID.startsWith("1"))
         return true;
     return false;
    }
}
