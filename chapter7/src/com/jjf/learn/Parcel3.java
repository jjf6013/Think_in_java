package com.jjf.learn;

abstract class Contents{
    abstract public int value();
}

interface Destination{
    String readLabel();
}

public class Parcel3 {
    private class PContents extends Contents{
        private int i = 11;
        public int value(){
            return i;
        }
    }

    protected class PDestination implements Destination{
        private String lable;
        private PDestination(String whereTo){
            lable = whereTo;
        }
        public String readLabel(){
            return lable;
        }
    }

    public Destination dest(String s){
        return new PDestination(s);
    }

    public Contents cont(){
        return new PContents();
    }
}

class Test{
    public static void main(String[] args){
        Parcel3 p = new Parcel3();
        Contents c = p.cont();
        Destination d = p.dest("我是你爸爸");
//        Parcel3.PContents s = p.new PContents();
    }
}
