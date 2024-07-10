# Java Notes

## Learning Resources:

- [W3Schools](https://www.w3schools.com/java/default.asp) - java Documentation
- [Java Full Course fo free ☕](https://www.youtube.com/watch?v=xk4_1vDrzzo) - YouTube Video ⏯️ by Bro Code

## Table of Contents:

- [Class](#class)
- [Print to console](#print-to-console)
- [Comments](#comments)
- [Data Types](#data-types)
- [Variables and data types usage](#variables-and-data-types-usage)
- [User Input](#user-input)

### Class:

A class is a collection of related code. It looks like this:

```java
public class Main { // The word `Main` is the name of the class
    public static void main(String[] args) { // public static void main(String[] args) is our main method and is needed to compile Java code

    }
}
```

### Print to console:

To print to console we use the following: `System.out.print("Hello World")` This will print "Hello World" in the console.

```java
public class Main { // The word `Main` is the name of the class
    public static void main(String[] args) { // public static void main(String[] args) is our main method and is needed to compile Java code
        System.out.println("I love pizza"); // To print message in another line we need to use `println`
        System.out.print("It's really good!");
        }
}
```

- note that we can also use an escape sequence like `\n` to print in new lines too like: `System.out.print("I love pizza\n");`
- also we can use `\t` to tab the message in the console:
  ```java
  public class Main { // The word `Main` is the name of the class
      public static void main(String[] args) { // public static void main(String[] args) is our main method and is needed to compile Java code
          System.out.println("\tI love pizza"); // To print message in another line we need to use `println`
          System.out.print("It's really good!");
          }
  }
  ```
  Output:
  ```
      I love pizza
  It's really good!
  ```

We can print in many ways. See the table that explains each method:

| Method                 | Description                                                            | Example Code                                                                          | Output                                                                        |
| ---------------------- | ---------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `System.out.print()`   | Prints text to the console without a newline at the end.               | `System.out.print("Hello, World!");`                                                  | `Hello, World!` (no newline)                                                  |
| `System.out.println()` | Prints text to the console with a newline at the end.                  | `System.out.println("Hello, World!");`                                                | `Hello, World!\n` (with newline)                                              |
| `System.out.printf()`  | Prints formatted text to the console.                                  | `System.out.printf("Hello, %s! You have %d new messages.%n", "Carlos", 5);`           | `Hello, Carlos! You have 5 new messages.\n` (formatted)                       |
| `System.err.print()`   | Prints text to the standard error stream without a newline at the end. | `System.err.print("Error occurred!");`                                                | `Error occurred!` (no newline, error stream)                                  |
| `System.err.println()` | Prints text to the standard error stream with a newline at the end.    | `System.err.println("Error occurred!");`                                              | `Error occurred!\n` (with newline, error stream)                              |
| `System.err.printf()`  | Prints formatted text to the standard error stream.                    | `System.err.printf("Error: %s occurred at %s%n", "NullPointerException", "line 42");` | `Error: NullPointerException occurred at line 42\n` (formatted, error stream) |

### Comments:

To put comments in the code we use `//` for inline comments and `/*` for multiline comments:

```java
// This is a comment

/*
This
is
a
comment
*/
```

### Data Types:

There are eight primitive data types in Java:

| Data Type | Size    | Description                                                                       |
| :-------- | :------ | :-------------------------------------------------------------------------------- |
| byte      | 1 byte  | Stores whole numbers from -128 to 127                                             |
| short     | 2 bytes | Stores whole numbers from -32,768 to 32,767                                       |
| int       | 4 bytes | Stores whole numbers from -2,147,483,648 to 2,147,483,647                         |
| long      | 8 bytes | Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| float     | 4 bytes | Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits           |
| double    | 8 bytes | Stores fractional numbers. Sufficient for storing 15 decimal digits               |
| boolean   | 1 bit   | Stores true or false values                                                       |
| char      | 2 bytes | Stores a single character/letter or ASCII values                                  |

### Variables and data types usage

To create a variable, you must specify the type and assign it a value:

```java
String name = "John";
System.out.println(name);
```

or

```java
int myNum = 5;
float myFloatNum = 5.99f;
char myLetter = 'D';
boolean myBool = true;
String myText = "Hello";
```

We can also use type casting to change the data type of a variable after it was specified.

This is done by puttin '(dataType)' before the variable. Look at the example where myDouble is changed to int:

```java
public class Main {
  public static void main(String[] args) {
    double myDouble = 9.78d;
    int myInt = (int) myDouble; // Manual casting: double to int

    System.out.println(myDouble);   // Outputs 9.78
    System.out.println(myInt);      // Outputs 9
  }
}
```

### User Input

The `Scanner` class is used to get user input, and it is found in the `java.util package`.

```java
import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
  }
}
```

The input types are the following:

| Method        | Description                         |
| ------------- | ----------------------------------- |
| nextBoolean() | Reads a boolean value from the user |
| nextByte()    | Reads a byte value from the user    |
| nextDouble()  | Reads a double value from the user  |
| nextFloat()   | Reads a float value from the user   |
| nextInt()     | Reads an int value from the user    |
| nextLine()    | Reads a String value from the user  |
| nextLong()    | Reads a long value from the user    |
| nextShort()   | Reads a short value from the user   |
