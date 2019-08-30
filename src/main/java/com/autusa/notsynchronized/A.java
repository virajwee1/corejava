package com.autusa.notsynchronized;

public class A {

    /**
     *
     * @param i
     */
    synchronized void addNew(int i){
        Thread t = Thread.currentThread();

        for(int n=0;n<=5;n++){
            System.out.println(t.getName()+"-"+(i+n));
        }
    }
}
