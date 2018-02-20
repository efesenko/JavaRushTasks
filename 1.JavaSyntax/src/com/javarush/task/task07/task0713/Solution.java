package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> input = new ArrayList<>();
        ArrayList<Integer> na3 = new ArrayList<>();
        ArrayList<Integer> na2 = new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            input.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < input.size(); i++) {
            if((input.get(i) % 3) == 0) na3.add(input.get(i));
            if((input.get(i) % 2) == 0) na2.add(input.get(i));
            else if((input.get(i) % 3) != 0) other.add(input.get(i));
        }
        printList(na3);
        printList(na2);
        printList(other);


    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
