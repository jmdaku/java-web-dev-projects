package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle: ");
        double circleRadius = input.nextDouble();
        double area = Circle.getArea(circleRadius);
        System.out.println("The area of your circle is " + area);
    input.close();
    }
}
