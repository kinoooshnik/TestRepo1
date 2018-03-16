package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stringen st = new Stringen(100, 202);
        st.start();

        Scanner in = new Scanner(System.in);
        String line;
        while (!(line = in.nextLine()).equals("exit")) {
            if (line.equals("Как закрыть долги?")) {
                System.out.println(st.string);
            }
            else {
                System.out.println(line);
            }
        }
    }
}