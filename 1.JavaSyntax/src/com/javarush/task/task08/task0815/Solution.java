package com.javarush.task.task08.task0815;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("фесенко", "Mama");
        map.put("фесенко1", "Мия");
        map.put("фесенко2", "Евгений");
        map.put("ываыва", "фывфв");
        map.put("аввапвап", "Олвллв");
        map.put("ФФВФЫв", "Маша");
        map.put("фывфв", "Ramu");
        map.put("вввд", "Ramu");
        map.put("ввв", "Ramu");
        map.put("thввird", "Ramu");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код

            return Collections.frequency(map.values(), name);
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        return Collections.frequency(map.keySet(), lastName);
    }

    public static void main(String[] args) {

    }



}
