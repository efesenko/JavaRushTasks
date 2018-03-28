package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int id = Integer.parseInt(reader.readLine());
        String name = reader.readLine();
*/
        HashMap<String, Integer> map = addValues();
        displayItem(map);

    }

    public static HashMap<String, Integer> addValues(){
        HashMap<String, Integer> input = new HashMap<String, Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



        while (true) {
            try {
                int id = Integer.parseInt(reader.readLine());
                String name = reader.readLine();
                if (name.length()!=0){
                    input.put(name, id);
                }
                else break;
            } catch (Exception e) {
                break;
            }
        }
        return input;
    }
    public static void displayItem (HashMap<String, Integer> map ){
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}
