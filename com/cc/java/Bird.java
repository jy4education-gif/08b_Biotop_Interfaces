package com.cc.java;

public class Bird implements Flyable, IFeathers{

    @Override
    public String fly() {
        return "I fly at 20mph!";
    }

    @Override
    public String hasFeathers() {
        return "I'm a Bird - I have feathers!";
    }

}
