package com.jjf.learn;

interface Monster{
    void menace();
}

interface DangerousMonster extends Monster{
    void destroy();
}

interface Lethal{
    void kill();
}

class DragonZilla implements DangerousMonster{
    public void menace(){}

    public void destroy(){}
}

interface Vampire extends DangerousMonster{
    void drinkBlood();
}

public class HorrorShow {
    static void u(Monster b){
        b.menace();
    }

    static void v(DangerousMonster d){
        d.destroy();
        d.menace();
    }

    public static void main(String[] args){
        DragonZilla if2 = new DragonZilla();
        u(if2);
        v(if2);
    }
}
