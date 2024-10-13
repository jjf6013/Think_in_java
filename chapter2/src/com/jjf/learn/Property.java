package com.jjf.learn;

import java.util.*;

public class Property {

    public static void main(String[] args) {
        // 打印当前日期和时间
        System.out.println(new Date());

        // 获取系统属性
        Properties p = System.getProperties();

        // 列出所有系统属性
        p.list(System.out);

        // 打印内存使用情况
        System.out.println("--- Memory Usage:");
        Runtime rt = Runtime.getRuntime();

        // 打印总内存和空闲内存
        System.out.println("Total Memory = " + rt.totalMemory());
        System.out.println("Free Memory = " + rt.freeMemory());
    }
}
