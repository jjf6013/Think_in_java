package com.jjf.learn;

import java.util.*;

public class Set1 {
    public static void testVisual(Set a){
        Collection1.fill(a);
        Collection1.fill(a);
        Collection1.fill(a);
        Collection1.print(a);

        a.addAll(a);
        a.add("one");
        a.add("one");
        a.add("one");
        Collection1.print(a);

        System.out.println("a.contains(\"one\"):" + a.contains("one"));
    }

    public static void main(String[] args){
        testVisual(new HashSet());
        testVisual(new TreeSet());
    }
}
