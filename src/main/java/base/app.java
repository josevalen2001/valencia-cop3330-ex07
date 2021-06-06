package base;
import java.text.DecimalFormat;
import java.util.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jose Valencia
 */

public class app {

    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);

        //input
        System.out.print("What is the length of the room in feet? ");
        int length = newScan.nextInt();

        System.out.print("What is the width of the room in feet? ");
        int width = newScan.nextInt();

        //Calculations
        int areaFeet = length * width;
        double areaMeters = areaFeet * 0.09290304;

        //Output
        DecimalFormat numFormat = new DecimalFormat("#.000");
        System.out.println("The area is ");
        System.out.println(areaFeet + " square feet\n" + numFormat.format(areaMeters) + " square meters");
    }
}
