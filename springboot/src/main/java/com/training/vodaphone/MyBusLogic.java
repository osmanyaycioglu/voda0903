package com.training.vodaphone;

public class MyBusLogic {


    private final String str;

    public MyBusLogic(final String str) {
        this.str = str;
    }

    public String func1() {
        return "func 1 " + this.str;
    }

    public String func2() {
        return "func 2 " + this.str;
    }

}
