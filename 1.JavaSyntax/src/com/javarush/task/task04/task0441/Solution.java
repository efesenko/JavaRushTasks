package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader( new InputStreamReader (System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(s);

        s = reader.readLine();
        int b = Integer.parseInt(s);

        s = reader.readLine();
        int c = Integer.parseInt(s);

        int mid = a;
        if (((a >= b) && (a <= c)) || ((a <= b) && (a >= c))) mid = a;
        else if (((b >= a) && (b <= c)) || ((b <= a) && (b >= c))) mid = b;
        else if (((c >= b) && (c <= a)) || ((c <= b) && (c >= a))) mid = c;

        System.out.println(mid);
    }
}
