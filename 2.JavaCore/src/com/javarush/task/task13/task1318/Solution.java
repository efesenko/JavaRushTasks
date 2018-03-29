package com.javarush.task.task13.task1318;

<<<<<<< HEAD
import java.io.*;
import java.util.Scanner;
=======
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;
>>>>>>> e12375f90a500f07375981d66da907790325583c

/* 
Чтение файла
*/

public class Solution {
<<<<<<< HEAD
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream stream = new FileInputStream(fileName);

        while (stream.available() > 0) {
            System.out.print((char) stream.read());
        }
        System.out.println();

        reader.close();
        stream.close();
    }
}
=======
    public static void main(String[] args) {
        // напишите тут ваш код
    }
}
>>>>>>> e12375f90a500f07375981d66da907790325583c
