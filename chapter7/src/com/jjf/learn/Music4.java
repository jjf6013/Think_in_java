package com.jjf.learn;

abstract class Instrument4{
    public abstract void play();
    public String what(){
        return "Instrument4.what()";
    }
    public abstract void adjust();
}

class Wind4 extends Instrument4{
    public void play(){
        System.out.println("Wind4.play()");
    }
    public String what(){return "Wind4.what()";}
    public void adjust(){}//必须继承所有的抽象方法编译才不会出错
}

class Percussion4 extends Instrument4{
    public void play(){
        System.out.println("Percussion4.play()");
    }
    public String what(){return "Percussion4.what()";}
    public void adjust(){}
}

class Stringed4 extends Instrument4{
    public void play(){
        System.out.println("Stringed4.play()");
    }
    public String what(){return "Stringed4.what()";}
    public void adjust(){}
}

class Brass4 extends Wind4{
    public void play(){
        System.out.println("Brass4.play()");
    }
    public void adjust(){
        System.out.println("Brass4.adjust()");
    }
}

class Woodwind4 extends Wind4{
    public void play(){
        System.out.println("Woodwind4.play()");
    }
    public String what(){
        return "Woodwind4.what()";
    }
}

public class Music4 {
    static void tune(Instrument4 i){
        i.play();
    }

    static void tuneAll(Instrument4[] e){
        for (int i = 0; i < e.length; i++){
            tune(e[i]);
        }
    }

    public static void main(String[] args){
        Instrument4[] orchestra = new Instrument4[5];
        int i = 0;
        orchestra[i++] = new Wind4();

        orchestra[i++] = new Percussion4();

        orchestra[i++] = new Stringed4();

        orchestra[i++] = new Brass4();

        orchestra[i++] = new Woodwind4();

        tuneAll(orchestra);
    }
}
