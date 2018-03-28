package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("first", 100);
        map.put("second", 501);
        map.put("third", 1499);
        map.put("fourth", 2499);
        map.put("fifth", 4399);
        map.put("sixth", 505);
        map.put("seventh", 600);
        map.put("eighth", 602);
        map.put("ninth", 1300);
        map.put("tenth", 900);

        return (HashMap<String, Integer>)map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String,Integer>> iter = map.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry<String,Integer> entry = iter.next();
            if (entry.getValue() < 500) {
                iter.remove();
            }
        }
    }



    public static void main(String[] args) {

    }
}