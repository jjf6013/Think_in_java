package com.jjf.learn;

interface CanFight{
    void fight();
}

interface CanSwim{
    void swim();
}

interface CanFly{
    void fly();
}

class ActionCharacter{
    public void fight(){}
}

class Hero extends ActionCharacter
        implements CanFight, CanSwim, CanFly{
    public void fly(){}
    public void swim(){}
}

public class Adventure {
    static void t(CanFight x){x.fight();}
    static void u(CanSwim x){x.swim();}
    static void v(CanFly x){x.fly();}
    static void w(ActionCharacter x){x.fight();}

    public static void main(String[] args){
        Hero i = new Hero();

        t(i);
        u(i);
        v(i);
        w(i);
    }
}
