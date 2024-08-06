// Carlos Bracho

import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        
        final double squareFeetPerGallons = 350.0;

        // Variable to control loops for input validation
        boolean validInput;

        // Getting wall height from user's input and validating input using a do-while loop
        validInput = false;
        do {
            try {
                System.out.println("Enter wall height (feet): ");
                wallHeight = Double.parseDouble(scnr.nextLine());
                if (wallHeight > 0) {
                    validInput = true;
                } else {
                    System.out.println("Please enter a valid number greater than zero.");
                    System.out.println("");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input. Please enter a valid number.");
                System.out.println("");
            }
        } while (!validInput);


        // Getting wall width from user's input and validating input using a do-while loop
        validInput = false;
        do {
            try {
                System.out.println("Enter wall width (feet): ");
                wallWidth = Double.parseDouble(scnr.nextLine());
                if (wallWidth > 0) {
                    validInput = true;
                } else {
                    System.out.println("Please enter a valid number greater than zero.");
                    System.out.println("");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input. Please enter a valid number.");
                System.out.println("");
            }
        } while (!validInput);

        // Calculate and output the wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculating and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");
    }
}
