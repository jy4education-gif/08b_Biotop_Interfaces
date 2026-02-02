package com.cc.java.bees;

public class Queen extends HoneyBee{

    @Override
    public String doYourJob(){
        return "I'm a Queen, any questions?";
    }

    @Override
    public String fly() {
        return "I can fly at 12mph!";
    }


}
