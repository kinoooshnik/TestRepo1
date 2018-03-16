package com.company;

import java.util.Random;

public class Stringen extends Thread {
    private int min;
    private int max;
    private String string;

    // делает из this.string рандомную строку рандомной длины в интервале от this.min до this.max
    private void generate(){
        Random rand = new Random();
        string = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        int length = rand.nextInt((max - min) + 1) + min;
        for (int i = 0; i < length; ++i)
            string += alphabet.charAt(rand.nextInt(alphabet.length()));

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
