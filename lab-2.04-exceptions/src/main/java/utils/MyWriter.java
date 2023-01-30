package utils;

import classes.Person;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class MyWriter {

    public static void myWriter(Person p, String path) throws IOException {

        File newFile = new File(path);
        FileWriter writer = new FileWriter(newFile, false);

        writer.write(p.toString());
        writer.close();
    }


    //String path para que sea mas escalable la manera de darle ruta al archivo.




}


