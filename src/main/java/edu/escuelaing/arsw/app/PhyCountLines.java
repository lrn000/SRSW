package edu.escuelaing.arsw.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PhyCountLines {

     private static long numberOfLines = 0;

    public static long numberOfLines(String fileName)  {
        try{
            FileReader fr = new FileReader(fileName);
            BufferedReader bf = new BufferedReader(fr);
            numberOfLines=bf.lines().count();
        }catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(numberOfLines);
        return numberOfLines;
    }


}
