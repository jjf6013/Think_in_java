package com.jjf.learn;

class Gizmo{
    public void spin(){}
}

public class FinalArguments {
    void with(final Gizmo g){
//        g = new Gizmo();//不能更改g的句柄
        g.spin();
    }

    void without(Gizmo g){
        g = new Gizmo();
        g.spin();
    }

//    void f(final int i){
//        i++;
//    }//i是不可变的常数
    int g(final int i){
        return i + 1;//i并没有变，只是参与了计算
    }

    public static void main(String[] args){
        FinalArguments fa = new FinalArguments();
        fa.with(new Gizmo());
        fa.without(null);
    }
}
