package com.pluralsight;

import java.util.ArrayList;

public class Main {

        /*
    https://programmingbydoing.com/
    Basic arraylists 0 - Assignment #177
     */

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(-133);
        integers.add(-133);
        integers.add(-133);
        integers.add(-133);
        integers.add(-133);
        integers.add(-133);
        integers.add(-133);
        integers.add(-133);
        integers.add(-133);
        integers.add(-133);


        System.out.println("Slot 1 contains a " + integers.get(0));
        System.out.println("Slot 2 contains a " + integers.get(1));
        System.out.println("Slot 3 contains a " + integers.get(2));
        System.out.println("Slot 4 contains a " + integers.get(3));
        System.out.println("Slot 5 contains a " + integers.get(4));
        System.out.println("Slot 6 contains a " + integers.get(5));
        System.out.println("Slot 7 contains a " + integers.get(6));
        System.out.println("Slot 8 contains a " + integers.get(7));
        System.out.println("Slot 9 contains a " + integers.get(8));
        System.out.println("Slot 10 contains a " + integers.get(9));

    }
}
