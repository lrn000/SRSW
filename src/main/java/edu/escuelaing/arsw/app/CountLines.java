package edu.escuelaing.arsw.app;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class CountLines
{
    public static void main( String[] args ) {
        String  typeOfCount= args[0];
        String fileName = args[1];
        
        if(typeOfCount.equals("phy")){
            System.out.println(PhyCountLines.numberOfLines(fileName));
        }if(typeOfCount.equals("log")){
            System.out.println(LocCountLines.numberOfLines(fileName));
        }else{
            System.out.println("El archivo no se encuetra");
        }
    }
}
