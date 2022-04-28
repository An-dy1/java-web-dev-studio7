package org.launchcode.studio7.complete;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        CD daveMatthews = new CD("Dave Matthews Tribute", 640, "CD-R", 200);
        DVD lionKing = new DVD("Lion King", 5000, "DVD-R", 1400);

        // ********************************
        // INTERFACE METHODS
        // benefits of interface: can extend multiple; can share behavior among unrelated classes; abstraction - separate the what of a program from the how

        // classic interface method
        lionKing.spinDisc();
        // default interface method
        daveMatthews.spinDiscMaxSpeed("CD");
        // ********************************



        // ********************************
        // PARENT ABSTRACT CLASS METHODS
        // benefits of abstract class: share behavior among related classes; abstraction - separate what from how

        // call a public method in the abstract class
        // characteristics: doesn't refer to child class fields; doesn't have to be overridden in child class
        System.out.println(daveMatthews.writeData(3));
        System.out.println(lionKing.diskInfo());

        // call abstract class abstract methods
        // have to be implemented in child class
        daveMatthews.setTrackList(new ArrayList<>(Arrays.asList("Livin on a Prayer", "Electric Feel", "Shoulders", "Medicine")));
        daveMatthews.printNumberOfTotalSections();
        // ********************************



        // ********************************
        // CHILD METHODS
        // methods that are specific to this one type of object; methods that refer to child class fields
        lionKing.makeBlueRayCompatible();
        // ********************************
    }
}
