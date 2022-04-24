package org.launchcode.studio7.complete;

public class Main {

    public static void main(String[] args){

        CD daveMatthews = new CD("Dave Matthews Tribute", 640, "CD-R", 200);
        DVD lionKing = new DVD("Lion King", 5000, "DVD-R", 1400);

        // call interface methods
        lionKing.spinDisc();

        // call abstract class methods
        System.out.println(daveMatthews.writeData(3));

    }
}
