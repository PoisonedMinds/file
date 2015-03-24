
package file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Steven Biro
 * @teacher Mr. J. Carron
 * @date 11-Mar-2015 10:51:46 AM
 */
public class fileRead {

    public static ArrayList read(String path) {
        int num = 0;
        ArrayList contents = new ArrayList();
        String line;
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader(path));

            while ((line = br.readLine()) != null) {
                contents.add(num, line);
                num++;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
            System.exit(0);

        } catch (IOException ex) {
            System.out.println("An error has occured");
            System.exit(1);
        }
        return contents;
    }
}
