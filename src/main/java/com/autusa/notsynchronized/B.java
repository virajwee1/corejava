package com.autusa.notsynchronized;

public class B extends Thread {

    A a = new A();

    @Override
    public void run() {
        a.addNew(100);
    }
}
