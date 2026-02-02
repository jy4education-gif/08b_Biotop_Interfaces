package com.cc.java;
import com.cc.java.bees.*;
import com.cc.java.birds.*;
import com.cc.java.interfaces.*;

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


