package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //напишите тут ваш код
        double a = (x2-x1);
        double b = y2 -y1;
        return Math.sqrt((a*a)+(b*b));

    }

    public static void main(String[] args) {

    }
}
