package org.launchcode;

public class DVD extends Discs implements OpticalDiscActions {
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    public DVD(String name, double capacity, String discType, String contents){
        super (name, capacity, discType, contents);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void readData() {
        System.out.println("Data was read from the DVD");

    }

    @Override
    public void writeData() {
        System.out.println("Data was written to the DVD using a laser");
    }

    @Override
    public void setSpinSpeed() {


    }
}
