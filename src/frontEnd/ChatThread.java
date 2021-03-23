/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontEnd;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mac
 */
public class ChatThread {
      Socket s;

    public ChatThread(Socket s) {
        this.s = s;

    }
    
    public void run() {

        try {
            String msgin = "";
           
           DataInputStream  in = new DataInputStream(s.getInputStream());
           DataOutputStream out = new DataOutputStream(s.getOutputStream());

            while (!msgin.trim().equalsIgnoreCase("BYE")) {
                msgin = in.readUTF();
              //  clientGUI.messageA.setText(n.getText() + "\n Customer : " + msgin);
            }

        } catch (IOException ex) {
            Logger.getLogger(ChatThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    

    }
}
