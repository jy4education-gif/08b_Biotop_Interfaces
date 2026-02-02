package com.cc.java.birds;
import com.cc.java.interfaces.IFlyable;
import com.cc.java.interfaces.IFeathers;

public class Bird implements IFlyable, IFeathers{

    @Override
    public String fly() {
        return "I fly at 20mph!";
    }

    @Override
    public String hasFeathers() {
        return "I'm a bird - I have feathers!";
    }

}
