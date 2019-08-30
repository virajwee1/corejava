package com.autusa.notsynchronized;

public class Main {

    public static void main(String[] args) {
        B b = new B();

        Thread t1 = new Thread(b);
        Thread t2 = new Thread(b);
        t1.setName("T1");
        t2.setName("T2");

        t1.start();
        t2.start();

    }
    /**
     * Sample output I got
     * T2-100
     * T1-100
     * T2-101
     * T2-102
     * T2-103
     * T1-101
     * T2-104
     * T1-102
     * T2-105
     * T1-103
     * T1-104
     * T1-105
     *
     *
     * if we use synchronized for method addNew in class A then only the result be like
     * T1-100
     * T1-101
     * T1-102
     * T1-103
     * T1-104
     * T1-105
     * T2-100
     * T2-101
     * T2-102
     * T2-103
     * T2-104
     * T2-105
     */
}
