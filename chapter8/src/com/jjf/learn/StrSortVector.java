package com.jjf.learn;

import java.util.*;

public class StrSortVector {
    private SortVector v = new SortVector(
            new Compare() {
                @Override
                public boolean lessThan(Object l, Object r) {
                    return ((String)l).toLowerCase().compareTo(((String)r).toLowerCase()) < 0;
                }

                @Override
                public boolean lessThanOrEqual(Object l, Object r) {
                    return ((String)l).toLowerCase().compareTo(((String)r).toLowerCase()) <= 0;
                }
            }
    );

    private boolean sorted = false;

    public void addElement(String s){
        v.addElement(s);
        sorted = false;
    }

    public String elementAt(int index){
        if (!sorted){
            v.sort();
            sorted = true;
        }
        return (String)v.elementAt(index);
    }

    public Enumeration elements(){
        if (!sorted){
            v.sort();
            sorted = true;
        }

        return  v.elements();
    }

    public static void main(String[] args){
        StrSortVector sv = new StrSortVector();

        sv.addElement("d");
        sv.addElement("A");
        sv.addElement("C");
        sv.addElement("c");
        sv.addElement("b");
        sv.addElement("B");
        sv.addElement("D");
        sv.addElement("a");

        Enumeration e = sv.elements();
        while (e.hasMoreElements()) System.out.println(e.nextElement());
    }
}
