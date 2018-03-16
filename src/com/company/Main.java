package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("ell");
        Stringen strg = new Stringen(0, 10);
        strg.start();

        Scanner in = new Scanner(System.in);
        String line;
        while (!(line = in.nextLine()).equals("quit")){
            System.out.println(strg.getString());
        }

    }

}