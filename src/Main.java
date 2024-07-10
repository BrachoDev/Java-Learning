import java.util.Scanner;

public class Main {

    /* Define your method here */
    static double drivingCost(double milesPerGallon, double dollarsPerGallon, double milesDriven) {
        return (milesDriven / milesPerGallon) * dollarsPerGallon; // Creating a formula to calculate the gas cost
    }

    public static void main(String[] args) {
        /* Type your code here. */
        Scanner scnr = new Scanner(System.in); // Creating Scanner Object

        double milesPerGallon = scnr.nextDouble(); // input for milesPerGallon
        double dollarsPerGallon = scnr.nextDouble(); // input for dollarsPerGallon

        // Printing each value by calling drivinCost() at 10, 50 and 400 miles:
        System.out.printf("%.2f ", drivingCost(milesPerGallon, dollarsPerGallon, 10));
        System.out.printf("%.2f ", drivingCost(milesPerGallon, dollarsPerGallon, 50));
        System.out.printf("%.2f\n", drivingCost(milesPerGallon, dollarsPerGallon, 400));

    }
}
