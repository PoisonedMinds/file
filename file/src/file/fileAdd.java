/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Steven Biro
 */
public class fileAdd {

    public static void add(ArrayList towrite, String path) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(path,true));
            for (Object towrite1 : towrite) {
                writer.println(towrite1);
            }
            writer.close();
        } catch (IOException ex) {
            System.out.println("An error has occured.");
            Logger.getLogger(fileWrite.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        }
    }
}
