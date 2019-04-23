package com.javarush.task.task06.task0617;

/* 
Блокнот для новых идей
*/

public class Solution {
    public static void main(String[] args) {
        printIdea(new Idea());
    }

    public static class Idea {
        //public static String idea = new Idea().getDescription();
        //public static String idea = Idea.getDescription();


        public String getDescription() {
            //String idea = "Yes";
            return "Yes";
        }

    }

    public static void printIdea(Idea idea) {
        //new Idea() = Idea.getDescription(idea);
        System.out.println(idea.getDescription());
    }
    //напишите тут ваш код
}
