package com.company;

public class Main {
    public static void main(String[] args) {
        MainActivity a = new MainActivity();
        a.show();
        //MyClass myClass = new MyClass(20);
        //myClass.show();
        //Scanner in = new Scanner(System.in);
        //String s = in.next();
        //System.out.println(s);
    }
}

class MyClass {
    private int a;
    public MyClass(int a)
    {
        this.a = a;
    }

    public void show()
    {
        System.out.println(this.a);
    }
}
