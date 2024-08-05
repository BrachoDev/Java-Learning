import java.util.Scanner;

public class ParseStrings {
    public static void main(String[] args) {
        // Scanner object and initializing variables
        Scanner scnr = new Scanner(System.in);
        String userInput;
        String firstWord;
        String secondWord;

        // loop to extend program unless user enters "q" to quit
        while (true) {
            // Prompt to get user's input
            System.out.println("Enter input string: ");
            userInput = scnr.nextLine();

            // Condition to exit program
            if (userInput.equals("q")) {
                break;
            }

            // Validating input to make sure it contains ","
            if (userInput.contains(",")) {
                // Taking Input and converting it in a list
                String[] wordsList = userInput.split(",", 2);

                // Assigning first and second words
                firstWord = wordsList[0].trim();
                secondWord = wordsList[1].trim();

                // Outputting both words
                System.out.println("First word: " + firstWord);
                System.out.println("Second word: " + secondWord);
                System.out.println("");
                System.out.println("");
            }
            // Catching any errors
            else {
                System.out.println("Error: No comma in string");
            }
        }

        // Closing the Scanner
        scnr.close();
    }
}