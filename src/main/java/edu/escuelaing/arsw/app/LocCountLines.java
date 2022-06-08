package edu.escuelaing.arsw.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *Cuenta las lineas de un archivo sin tener en cueta
 * los espacios y lineas de comentarios
 *
 */

public class LocCountLines {
    static long totalLines = 0;
    static long invalidLines = 0;
    static long total = 0;

    /**
     *fileName nombre del archivo
     *return el número de lineas
     */
    public static long numberOfLines(String fileName) {
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader bf = new BufferedReader(fr);
            //
            String line;
            while ((line = bf.readLine()) != null) {
                totalLines++;
                if (line.isEmpty()) {
                    invalidLines++;
                } else {
                    if (nonEmptyCharacter(line) == '*' || nonEmptyCharacter(line) == '/') {
                        invalidLines++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(invalidLines);
        System.out.println(totalLines);
        total = totalLines - invalidLines;
        return total;
    }


    /**
     *Encuentra la posición en la que está el primer
     * caracter si la linea no esta vacias
     * line linea del archivo
     * return primer caracter
     */
    public static char nonEmptyCharacter(String line) {
        char character = ' ';
        try {
            int count = 0;
            while (!line.isEmpty() && line.charAt(count) == ' ') {
                count++;
            }
            character = line.charAt(count);
        } catch (Exception exception) {
        }
        return character;

    }


}

