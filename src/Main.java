import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Type your code here. */

        // Creating a Scanner object to read inputs
        Scanner scnr = new Scanner(System.in);
        // Creating an array to store 5 weights
        double[] weights = new double[5];

        // Loop to read and store weights in the array
        for( int counter = 0; counter < weights.length; counter++) {
            System.out.println("Enter weight " + (counter + 1) + ": ");
            weights[counter] = scnr.nextDouble();
        }

        // Displaying the entered weights
        System.out.println("");
        System.out.print("You entered: ");
        for(int counter = 0; counter < weights.length; counter++){
            System.out.print(weights[counter] + " ");
        }

        // Calculating the total weight
        double totalWeight = 0;
        for(int counter = 0; counter < weights.length; counter++){
            totalWeight += weights[counter];
        }
        System.out.println("");
        System.out.println("Total weight: " + totalWeight);

        // Calculating and printing the average weight
        double averageWeight = totalWeight/weights.length;
        System.out.println("Average weight: " + averageWeight);

        // Find and print the maximum weight
        double max = weights[0];
        for(int counter = 1; counter < weights.length; counter++){
            if (weights[counter] > max) {
                max = weights[counter];
            }
        }
        System.out.println("Max weight: " + max);

        return;
    }
}

