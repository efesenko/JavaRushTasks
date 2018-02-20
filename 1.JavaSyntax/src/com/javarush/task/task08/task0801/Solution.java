package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.HashSet;


public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashSet<String> HashSet = new HashSet<String>();

        HashSet.add("арбуз");
        HashSet.add("банан");
        HashSet.add("вишня");
        HashSet.add("груша");
        HashSet.add("дыня");
        HashSet.add("ежевика");
        HashSet.add("жень-шень");
        HashSet.add("земляника");
        HashSet.add("ирис");
        HashSet.add("картофель");


        for (String text : HashSet)
        {
            System.out.println(text);
        }


    }
}
