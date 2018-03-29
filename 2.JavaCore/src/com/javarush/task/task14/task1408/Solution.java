package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            //напишите тут ваш код

            return hen;
        }
    }
    abstract class Hen {
        abstract int getCountOfEggsPerMonth();
        String getDescription(){
            return "Я - курица.";
        }
    }
    class RussianHen extends Hen {
        @Override
        int getCountOfEggsPerMonth() {
            return 0;
        }

        @Override
        String getDescription() {
            return "Я путен";
        }
    }
    class MoldovanHen extends Hen {
        @Override
        int getCountOfEggsPerMonth() {
            return 19;
        }

        @Override
        String getDescription() {
            return "Я молдован, а не курица";
        }
    }
    class UkrainianHen extends Hen {
        @Override
        int getCountOfEggsPerMonth() {
            return 25;
        }

        @Override
        String getDescription() {
            return "Я укроКурица";
        }
    }
    class BelarusianHen extends Hen {
        @Override
        int getCountOfEggsPerMonth() {
            return 20;
        }

        @Override
        String getDescription() {
            return "Я картоха, а не курица";
        }
    }


}
