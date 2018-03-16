package com.company;

class MainActivity extends Activity{
    public MainActivity(){
        super("Main");
    }

    @Override
    public void show(){
        MyClass myClass = new MyClass(20);
        myClass.show();
        /*
        super.show();
        System.out.println(super.a);*/
    }
}
