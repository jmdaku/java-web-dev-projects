package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd1 = new CD("The Stone Roses", 80, "13 song album", "Music");

        DVD dvd1 = new DVD("Oblivion", 3, "Game", "game in the Elder Scrolls series");



        // TODO: Call each CD and DVD method to verify that they work as expected.
        cd1.spinDisc();
        cd1.readData();
        cd1.writeData();
        dvd1.spinDisc();
        dvd1.readData();
        dvd1.writeData();

        System.out.println(cd1.name + " is a " + cd1.discType + "disc");


    }
}