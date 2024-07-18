import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initializing variables and scanner
        Scanner scnr = new Scanner(System.in);
        int arrowBaseHeight;
        int arrowBaseWidth;
        int arrowHeadWidth = 0;

        // Collecting user's inputs
        System.out.println("Enter arrow base height:");
        arrowBaseHeight = scnr.nextInt();

        System.out.println("Enter arrow base width:");
        arrowBaseWidth = scnr.nextInt();

        // Ensuring that arrow head width is greater than arrow base width
        while (arrowHeadWidth <= arrowBaseWidth) {
            System.out.println("Enter arrow head width:");
            arrowHeadWidth = scnr.nextInt();
        }
        System.out.println();

        // Printing the arrow base using the specified height and width
        for(int counterHeight = 0; counterHeight < arrowBaseHeight; counterHeight++) {
            for(int counterWidth = 0; counterWidth < arrowBaseWidth; counterWidth++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Printing the arrow head with decreasing width
        for(int counterHeadWidth = arrowHeadWidth; counterHeadWidth > 0 ; counterHeadWidth--) {
            for(int counterHeadHeight = 0 ; counterHeadHeight < counterHeadWidth; counterHeadHeight++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
