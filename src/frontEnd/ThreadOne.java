/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontEnd;

import static frontEnd.Home.ID;
import static frontEnd.Home.print;
import static frontEnd.Home.svNam;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mac
 */
public class ThreadOne extends Thread{

    public ThreadOne() {
    }
    
    
    //this thread will write to the file the loggin info
    public void run (){
         print.print(Home.ID.getText());
                    print.print(",");
                    print.print(Home.svNam);//print in the file the successful login info
                    Calendar calendar = Calendar.getInstance();
                    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");//print in the loggintracking file
                    //the date of the login
                    System.out.println(formatter.format(calendar.getTime()));
                    print.print(",");
                    print.print(calendar.getTime());
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadOne.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
