package com.jjf.learn;

class Measurement{
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;

    void prt(){
        System.out.println(
            "Data type      Inital value\n" +
            "boolean        " + t + "\n" +
            "char           " + c + "\n" +
            "byte           " + b + "\n" +
            "short          " + s + "\n" +
            "int            " + i + "\n" +
            "long           " + l + "\n" +
            "float          " + f + "\n" +
            "double         " + d
        );
    }
}

public class InitialValues {
    public static void main(String[] String){
        Measurement m = new Measurement();
        m.prt();

//        new Measurement().prt();//也可这样写
    }
}
