package com.jjf.learn;

class Game{
    Game(int i){
        System.out.println("Game构建器");
    }
}

class BoardGame extends Game{
    BoardGame(int i){
        super(i);//必须位于构建器的第一行
        System.out.println("BoardGame构建器");
    }
}

public class Chess extends BoardGame{
    Chess(int i){
        super(i);
        System.out.println("Chess构建器");
    }

    public static void main(String[] args){
        Chess c = new Chess(11);
    }
}
