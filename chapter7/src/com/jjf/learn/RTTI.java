package com.jjf.learn;

class Useful{
    public void f(){}
    public void g(){}
}

class MoreUseful extends Useful{
    public void u(){}
    public void v(){}
    public void w(){}
}

public class RTTI {
    public static void main(String[] args){
        Useful[] x = {new Useful(),new MoreUseful()};

        x[0].f();
        x[1].g();
//        x[1].u();//基础类中没有u方法，但可以通过强转的方式：
        ((MoreUseful)x[1]).u();
//        ((MoreUseful)x[0]).u();//编译出错
    }
}
