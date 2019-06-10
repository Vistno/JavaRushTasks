package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    public static class First extends Thread {
        @Override
        public void run() {
            while (true) {

            }
        }
    }

    public static class Second extends Thread {
        int e;
        @Override
        public void run() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e1) {
                System.out.println("InterruptedException");
            }
        }

    }

    public static class Third extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class Forth extends Thread implements Message {

        @Override
        public void showWarning() {
            this.interrupt();
        }

        @Override
        public void run() {
            while (!isInterrupted()) {

            }
        }
    }

    public static class Fifth extends Thread {
        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int result = 0;
            while (true) {
                try {
                    if (!reader.ready()) break;
                    else {
                        String s = reader.readLine();
                        if (s.equals("N")) {
                            System.out.println(result);
                            break;
                        }
                        else
                            result = result + Integer.parseInt(s);
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    static {
        threads.add(new First());
        threads.add(new Second());
        threads.add(new Third());
        threads.add(new Forth());
        threads.add(new Fifth());
    }



    public static void main(String[] args) {
    }
}