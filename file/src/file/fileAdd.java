/*
 * Copyright 2015 Steven Biro.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


/**
 * @author Steven Biro
 * @teacher Mr. J. Carron
 * @date 11-Mar-2015 10:51:46 AM
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
            System.exit(0);
        }
    }
}
