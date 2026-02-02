package com.cc.java;

import com.cc.java.bees.Drone;
import com.cc.java.bees.HoneyBee;
import com.cc.java.bees.Queen;
import com.cc.java.bees.Worker;
import com.cc.java.birds.Bird;
import com.cc.java.interfaces.IFeathers;
import com.cc.java.interfaces.IFlyable;

public class App {
    
    public static void main(String[] args) {

        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();   
        Bird bird = new Bird();

        pollObj(queen);
        pollObj(worker);
        pollObj(drone);
        pollObj(bird);
     
    }


    private static void pollObj(IFlyable obj) {
    output(obj.fly());

    // Prüfung auf Bienen-Verhalten
    if (obj instanceof HoneyBee) {
        HoneyBee bee = (HoneyBee) obj;
        output(bee.doYourJob());
    }

    // Prüfung auf Feder-Eigenschaft (Das hat nur der Bird)
    if (obj instanceof IFeathers) {
        IFeathers birdWithFeathers = (IFeathers) obj;
        output(birdWithFeathers.hasFeathers());
    }

    output("-------------------");
    }


    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}


