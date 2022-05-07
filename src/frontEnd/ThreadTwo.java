/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontEnd;

import static frontEnd.Home.print;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mac
 */
public class ThreadTwo extends Thread{

    public ThreadTwo() {
        
    }
    
    @Override
    //this thread will display the menu to the user 
    public void run() {
        if (Home.ID.getText().startsWith("1")) {
            try {
                sdmenu sd = new sdmenu();sd.setVisible(true);
    } catch (IOException ex) {
        Logger.getLogger(ThreadTwo.class.getName()).log(Level.SEVERE, null, ex);
    }
         }else{
            supervisorMenu sv = new supervisorMenu(null,null);
            sv.setVisible(true);
         }
        
    try {
        Thread.sleep(10);
    } catch (InterruptedException ex) {
        Logger.getLogger(ThreadTwo.class.getName()).log(Level.SEVERE, null, ex);
    }
     }
        
}
