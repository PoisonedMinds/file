
package file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Steven Biro
 * @teacher Mr. J. Carron
 * @date 11-Mar-2015 10:51:46 AM
 */
public class fileWrite {

    public static void write(ArrayList towrite, String path) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(path));
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
