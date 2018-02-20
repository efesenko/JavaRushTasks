package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        map.put("Фесенко", "Mama12313");
        map.put("фесенко1", "Mila");
        map.put("фесенко2", "Ramu1");
        map.put("Фесенко3", "Mama1");
        map.put("фесенко12", "Mila");
        map.put("фесенко23", "Ramu1");
        map.put("Фесенко213", "Mama2");
        map.put("фесенко11", "Mila");
        map.put("фесенко2322", "Ramu");
        map.put("фесенко23221", "Ramu2323");

    return (HashMap<String, String>)map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
                List<String> list = new LinkedList<>(map.values());

        for (String s : list) {
            if (Collections.frequency(map.values(), s) > 1) {
                removeItemFromMapByValue(map, s);
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
