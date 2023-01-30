package main;

import classes.Person;
import utils.MyWriter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {



        Person juan = new Person("Juan", 2, 30,"NET Developer");

        try{MyWriter.myWriter(juan,"C:\\Prueba\\MyFile.txt");

        }catch (Exception e){
            System.out.println("ERROR: " + e.getMessage());
        }





    }
}
