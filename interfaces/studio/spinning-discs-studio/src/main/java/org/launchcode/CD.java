package org.launchcode;

public class CD extends Discs implements OpticalDiscActions{
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    //discType = CD;

    public CD(String name, double capacity, String contents, String discType){
        super (name, capacity, discType, contents);
    }

    @Override
    public void spinDisc() {

        System.out.println("A CD spins at a rate of 200 - 500 rpm.");

    }
    //A CD spins at a rate of 200 - 500 rpm.
    @Override
    public void readData() {
        System.out.println("Data was read from the CD");
    }

    @Override
    public void writeData() {
        System.out.println("Data was written to the CD using a laser");

    }

    @Override
    public void setSpinSpeed() {


    }
}
