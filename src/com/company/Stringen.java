package com.company;

import java.util.Random;

public class Stringen extends Thread {
    int min;
    int max;
    String string;

    public void generate(){
        Random rand = new Random();
        String string = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        int length = rand.nextInt((max - min) + 1) + min;
        for (int i = 0; i < length; ++i)
            string += alphabet.charAt(rand.nextInt(alphabet.length()));

        this.string = string;
    }

    public String getString() {
        return string;
    }

    public Stringen(int min, int max){
        this.min = min;
        this.max = max;
    }


    public void run(){
        while (true){
            try {
                sleep(1000);
            } catch (Exception e){}
           generate();
        }


    }
}
