package com.jjf.learn;

class Egg{
    protected class York{
        public York(){
            System.out.println("Egg.Yolk");
        }
    }

    private York y;
    public Egg(){
        System.out.println("New Egg()");
        y = new York();
    }
}

public class BigEgg extends Egg{
    public class Yolk{
        public Yolk(){
            System.out.println("BigEgg.Yolk");
        }
    }
    public static void main(String[] args){
        BigEgg b = new BigEgg();
        BigEgg.Yolk y = b.new Yolk();
    }
}
