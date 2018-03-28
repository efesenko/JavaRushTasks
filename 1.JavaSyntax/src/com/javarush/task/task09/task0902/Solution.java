package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();

    }

    public static String method1() {
        method2();
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
       // for (int i=0; i < elements.length; i++) System.out.println(elements[i]);
        return elements[2].getMethodName();

        //напишите тут ваш код
    }

    public static String method2() {
        method3();
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        //System.out.println("------------2-------------");
       //for (int i=0; i < elements.length; i++) System.out.println(elements[i]);
        return elements[2].getMethodName();
        //напишите тут ваш код
    }

    public static String method3() {
        method4();
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
       // System.out.println("-------------3------------");
      // for (int i=0; i < elements.length; i++) System.out.println(elements[i]);

        return elements[2].getMethodName();
        //напишите тут ваш код
    }

    public static String method4() {
        method5();
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        //System.out.println("-------------4------------");
        //for (int i=0; i < elements.length; i++) System.out.println(elements[i]);
        return elements[2].getMethodName();
        //напишите тут ваш код
    }

    public static String method5() {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
      //  System.out.println("-------------5------------");
       //for (int i=0; i < elements.length; i++) System.out.println(elements[i]);
        return elements[2].getMethodName();
        //напишите тут ваш код
    }
}
