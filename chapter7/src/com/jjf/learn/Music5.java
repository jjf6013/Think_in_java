package com.jjf.learn;

interface Instrument5{
    int i = 5; //static and final
    void play();
    String what();
    void adjust();
}

class Wind5 implements Instrument5{
    public void play(){
        System.out.println("Wind5.play()");
    }

    public void adjust(){}

    public String what(){
        return "Wind5.what()";
    }
}

class Percussion5 implements Instrument5{
    public void play(){
        System.out.println("Percussion5.play()");
    }
    public String what(){return "Percussion5.what()";}
    public void adjust(){}
}

class Stringed5 implements Instrument5{
    public void play(){
        System.out.println("Stringed5.play()");
    }
    public String what(){return "Stringed5.what()";}
    public void adjust(){}
}

class Brass5 extends Wind5{
    public void play(){
        System.out.println("Brass5.play()");
    }
    public void adjust(){
        System.out.println("Brass5.adjust()");
    }
}

class Woodwind5 extends Wind5{
    public void play(){
        System.out.println("Woodwind5.play()");
    }
    public String what(){
        return "Woodwind5.what()";
    }
}

public class Music5 {
    static void tune(Instrument5 i){
        i.play();
    }

    static void tuneAll(Instrument5[] e){
        for (int i = 0; i < e.length; i++){
            tune(e[i]);
        }
    }

    public static void main(String[] args){
        Instrument5[] x = new Instrument5[5];
        int i = 0;
        x[i++] = new Wind5();
        x[i++] = new Percussion5();
        x[i++] = new Stringed5();
        x[i++] = new Brass5();
        x[i++] = new Woodwind5();
        tuneAll(x);
    }
}
