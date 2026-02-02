package com.cc.java.bees;

public class Worker extends HoneyBee{
    
    @Override
    public String doYourJob() {
        return "I'm a worker bee, I work all day!";
    }

    @Override
    public String fly() {
        return "I can fly at 14mph!";
    }

}
