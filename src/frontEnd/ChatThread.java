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
public class ChatThread extends Thread{
      Socket s;

    public ChatThread(Socket s) {
        this.s = s;

    }
    
    public void run() {
        System.out.println("running");
        try {
            String msgin = "";
            DataInputStream in = new DataInputStream(s.getInputStream());
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            System.out.println("entered try run");
            while (!in.readUTF().equals("bye")) {
                System.out.println("entered bye");
                msgin = in.readUTF();
                clientGUI.messageA.setText(clientGUI.messageA.getText() + "\n Customer : " + msgin);
            }
            s.close();

        } catch (IOException ex) {
            Logger.getLogger(ChatThread.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
}
