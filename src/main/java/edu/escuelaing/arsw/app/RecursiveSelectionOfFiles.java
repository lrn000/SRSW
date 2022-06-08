package edu.escuelaing.arsw.app;

import java.io.File;

public class RecursiveSelectionOfFiles {

    public static void main( String[] args ) {
       recursiveSelectionOfFiles(args);
    }

    public static long recursiveSelectionOfFiles(String[] params){
        String  typeOfCount= params[0];
        File fileName= new File(params[1]);
        long lines=0;
        if(fileName.isDirectory()) {
            for (File fileNameO : fileName.listFiles()) {
                if (typeOfCount.equals("phy")) {
                    PhyCountLines.numberOfLines(fileNameO.getName());
                } else {
                    LocCountLines.numberOfLines(fileNameO.getName());
                }
            }
        }
        System.out.println(lines);
        return 0;
    }
}
