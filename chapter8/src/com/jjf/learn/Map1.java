package com.jjf.learn;

import java.util.*;

public class Map1 {
    public final static String[][] testData1 = {
        { "Happy", "Cheerful disposition" },
        { "Sleepy", "Prefers dark, quiet places" },
        { "Grumpy", "Needs to work on attitude" },
        { "Doc", "Fantasizes about advanced degree"},
        { "Dopey", "'A' for effort" },
        { "Sneezy", "Struggles with allergies" },
        { "Bashful", "Needs self-esteem workshop"}
    };

    public final static String[][] testData2 = {
        { "Belligerent", "Disruptive influence" },
        { "Lazy", "Motivational problems" },
        { "Comatose", "Excellent behavior" }
    };

    public static Map fill(Map m, Object[][] o){
        for (int i = 0; i < o.length; i++)
            m.put(o[i][0], o[i][1]);
        return m;
    }

    public static void printKeys(Map m){
        System.out.print("Size = " + m.size() + ",");
        System.out.print("Keys:");
        Collection1.print(m.keySet());
    }

    public static void printValues(Map m){
        Collection entries = m.entrySet();
    }
}
