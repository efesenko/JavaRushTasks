package com.javarush.task.task13.task1304;

/* 
Selectable и Updatable
*/

//import javax.xml.bind.SchemaOutputResolver;

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }
public class Screen implements Selectable, Updatable {
    @Override
    public void onSelect() {
        System.out.println("Selected");
    }

    @Override
    public void refresh() {
        System.out.println("Updated");
    }
}
    //напишите тут ваш класс
}
