package com.cc.java.bees;
import com.cc.java.interfaces.IFlyable;

public class Drone extends HoneyBee{

    @Override
    public String doYourJob() {
        return "I'm a drone, I'm going to date our Queen!";    
    }

    @Override
    public String fly() {
        return "I can fly at 10mph!";
    }

    
}
