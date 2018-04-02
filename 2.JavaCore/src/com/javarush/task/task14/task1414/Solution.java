package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {

        String key = reader.readLine();
        Movie movie = MovieFactory.getMovie(key);

        /*while ((key = reader.readLine()).equals("cartoon")||(key = reader.readLine()).equals("thriller")||(key = reader.readLine()).equals("soapOpera")) {
            movie = MovieFactory.getMovie(key);
            System.out.println(movie.getClass().getSimpleName());
        }*/

        if (!(key.equals("soapOpera") || key.equals("cartoon") || key.equals("thriller"))) {
            break;
        } else {
            System.out.println(movie.getClass().getSimpleName());
        }



    }
        reader.close();
        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }
            else if ("thriller".equals(key)) {
                movie = new Thriller();
            }
            else if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie{

    }
    static class Thriller extends Movie {

    }

    //Напишите тут ваши классы, пункт 3
}
