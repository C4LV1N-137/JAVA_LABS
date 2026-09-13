/*
*Calvin Moyo
*19001309
*Lab 4
*/

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class Question1 {
    public static void main(String[] args) {
        String[] names = new String[20]; //String array of capacity 20
        int count = 0;

        try{
            File file = new File("names.txt");
            Scanner fileScanner = new Scanner(file);

            //Read one word at a time until the file runs out or array is full
            while (fileScanner.hasNext() && count < names.length) {
                names[count] = fileScanner.next();
                count++;
            }

            fileScanner.close();

            //Printing what was read from the file
            System.out.println("Words read from names.txt:");
            for (int i = 0; i < count; i++) {
                System.out.println(names[i]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not find names.txt.");
        }

    }
}