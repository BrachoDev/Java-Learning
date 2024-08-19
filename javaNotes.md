# Java Notes

## Learning Resources:

- [W3Schools](https://www.w3schools.com/java/default.asp) - java Documentation
- [Java Full Course fo free ☕](https://www.youtube.com/watch?v=xk4_1vDrzzo) - YouTube Video ⏯️ by Bro Code for learning how to code in java.
- [Exercism.io](https://exercism.org/) - This community-oriented website allows you to explore a number of different programming languages, including Java. You will be given a coding problem and upload a solution, which will be reviewed by a “coach.” There are numerous problems that will allow you to continue practicing the skills you’ve learned in this course and develop new ones.
- [Project Euler](https://projecteuler.net/) - This website gives you the opportunity to explore math-oriented programming problems and create solutions. It is a language-agnostic website, so you could practice implementing solutions to the problems in any programming language. Check out the “Archives” tab first to see some of the sample problems you can work to solve.
- [Book: Learning Java by Building Android Games : Learn Java and Android From Scratch by Building Five Exciting Games, 3rd Edition](https://eds-p-ebscohost-com.ezproxy.snhu.edu/eds/detail/detail?vid=0&sid=0461ed1b-a56b-46d8-aa9d-037c829c915b%40redis&bdata=JnNpdGU9ZWRzLWxpdmUmc2NvcGU9c2l0ZQ%3d%3d#AN=2901983&db=nlebk) - This Shapiro Library reading will review the fundamentals of Java programming through building Android games. Exploring this resource will give you the opportunity to review many of the concepts and principles (such as loops, OOP principles, and so on) through problems based around Android games. As a note, the library only has access to one copy of this resource, so you may have to continue checking for when it is available.
- [Neetcode.io](https://neetcode.io/) - Neetcode is a coding interview prep platform with tons of courses to help both beginners and experienced developers learn the coding skills they need to pass technical coding interviews.

## Table of Contents:

- [Class](#class)
- [Print to console](#print-to-console)
- [Comments](#comments)
- [Data Types](#data-types)
- [Variables and data types usage](#variables-and-data-types-usage)
- [User Input](#user-input)
- [Java Conditions and If Statements](#Java-Conditions-and-If-Statements)
- [Types of loops in java](#types-of-loops-in-java)
- [Arrays](#arrays)
- [Array List](#array-list)
- [UML Class Diagrams](#uml-class-diagrams)
- [Using Classes in OOP](#using-classes-in-oop)
- [Exceptions - Try...Catch](#exceptions---trycatch)
- [APIs](#apis)

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

### Java Conditions and If Statements

Java supports the usual logical conditions from mathematics:

- **Less than**: `a < b`
- **Less than or equal to**: `a <= b`
- **Greater than**: `a > b`
- **Greater than or equal to**: `a >= b`
- **Equal to**: `a == b`
- **Not Equal to**: `a != b`

You can use these conditions to perform different actions based on different decisions.

**_Java Conditional Statements_**

Java has the following conditional statements:

- **`if`**: Specifies a block of code to be executed if a specified condition is true.
- **`else`**: Specifies a block of code to be executed if the condition in the `if` statement is false.
- **`else if`**: Specifies a new condition to test if the previous condition(s) were false.
- **`switch`**: Specifies many alternative blocks of code to be executed.

**_Syntax_**

**if Statement**

```java
if (condition) {
  // block of code to be executed if the condition is true
}
```

**if-else Statement**

```java
if (condition) {
    // code to be executed if condition is true
} else {
    // code to be executed if condition is false
}
```

**else-if Statement**

```java
if (condition1) {
    // code to be executed if condition1 is true
} else if (condition2) {
    // code to be executed if condition1 is false and condition2 is true
} else {
    // code to be executed if condition1 and condition2 are false
}
```

**switch Statement**

```java
switch (variable) {
    case value1:
        // code to be executed if variable equals value1
        break;
    case value2:
        // code to be executed if variable equals value2
        break;
    // you can have any number of case statements
    default:
        // code to be executed if variable does not match any case
        break;
}
```

### Types of Loops in Java:

In Java, there are three primary types of loops: the for loop, the while loop, and the do-while loop. Each of these loops allows you to repeat a block of code multiple times, but they differ in their syntax and use cases.

#### For Loop:

The for loop is used when you know in advance how many times you want to execute a statement or a block of statements. The syntax of a for loop is:

```java
for (initialization; condition; update) {
    // statements
}
```

**Example**

```java
for (int i = 0; i < 5; i++) {
    System.out.println("i = " + i);
}
```

#### While Loop:

The while loop is used when you want to execute a block of statements repeatedly as long as a condition is true. The syntax of a while loop is:

```java
while (condition) {
    // statements
}
```

**Example**

```java
int i = 0;
while (i < 5) {
    System.out.println("i = " + i);
    i++;
}
```

#### Do-While Loop:

The do-while loop is similar to the while loop, but it guarantees that the block of code is executed at least once. The syntax of a do-while loop is:

```java
do {
    // statements
} while (condition);
```

**Example**

```java
int i = 0;
do {
    System.out.println("i = " + i);
    i++;
} while (i < 5);
```

### Arrays:

`Array` = used to store multiple values in a sigle variable.

`NOTE`: The data must be the same. If the Array contains Strings, we should only use Strings and nothing else

```java
public class Main {
    public static void main(String[] args){
        String[] cars = {"Camaro", "Corvette", "Tesla"}; // This is how a Array looks like.

        cars[0] = "Mustang"; // Accessing the Array at index [0] and updating it with a new value

    }
}
```

We can also create the array and add the values later. For example:

```java
public class Main {
    public static void main(String[] args){
        String[] cars = new String[3] // Here, we are creating an array that can have max 3 elements.

        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";

    }
}
```

To use **_For Loops_** in arrays we get the `.length` of the Array like this:

```java
public class Main {
    public static void main(String[] args){
        String[] cars = new String[3] // Here, we are creating an array that can have max 3 elements.

        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";

        for(int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]); // This will print each element in the "cars" array.
        }

    }
}
```

### Array List:

- ArraysList is a resizable array.
- Elements can be added and removed after compilation phase.
- Store reference data types only.

**Set an ArrayList**

```java
public class Main {
    public static void main(String[] args){

        ArrayList<String> food = new ArrayList<String>(); // Setting an ArrayList that uses "Strings". We can also set "Integers", or any other type.

        // Use the `.add` method to add values Array.
        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        // Use `.set()` to replace values at specific index in the array.
        food.set(0, "Sushi");

        // To remove values in an Array we use the `.remove()` Method.
        food.remove(2);

        // To clear our Array we use `.clear()`
        food.clear();

        // Similar to Arrays, we can loop throught tthis ArrayList by getting the size of the array. We use `.size()` to accomplish this.
        for(int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i)); // Use '.get()' to access the value in an Array.
        }


    }
}
```

### UML Class Diagrams:

- [Lucidchart tutorial on UML diagrams](https://www.youtube.com/watch?v=UI6lqHOVHic)

- [UML to code tutorial](https://www.youtube.com/watch?v=6wyk5BrgOFo&t=185s)

### Using Classes in OOP:

- Using classes in Java is a fundamental concept of object-oriented programming (OOP). A class is like a blueprint for creating objects. It defines the properties (attributes) and behaviors (methods) that the objects created from the class can have.

**Basic Structure of a Class**

Here's a simple breakdown of how a class is structured in Java:

1. Class Declaration: The first step is to declare the class. The class name should start with an uppercase letter.
2. Attributes: These are the variables that hold data for the class. They are sometimes called fields or properties.
3. Methods: These are the functions that define the behaviors of the class.

**Example of a Class**

Let's break down the example of using classes in Java with the `ItemToPurchase` and `ShoppingCartPrinter` classes, which simulate a simple shopping cart system.

**ItemToPurchase**

- The `ItemToPurchase` class represents an item that a customer can add to their shopping cart. It has attributes to store the item's name, price, and quantity, along with methods to set and get these values.

```java
public class ItemToPurchase {
    // Attributes (fields)
    private String itemName;
    private int itemPrice;
    private int itemQuantity;

    // Constructor
    public ItemToPurchase() {
        this.itemName = "none";
        this.itemPrice = 0;
        this.itemQuantity = 0;
    }

    // Mutator (setter) methods
    public void setName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    // Accessor (getter) methods
    public String getName() {
        return itemName;
    }

    public int getPrice() {
        return itemPrice;
    }

    public int getQuantity() {
        return itemQuantity;
    }

    // Method to print item details
    public void printItemPurchase() {
        System.out.println(itemName + " " + itemQuantity + " @ $" + itemPrice + " = $" + (itemPrice * itemQuantity));
    }
}
```

#### **_Explanation_**

**Attributes (Fields)**

- `itemName`, `itemPrice`, and `itemQuantity` are variables that store information about the item. They're private, meaning they can only be accessed within this class.

**Constructor**

- The constructor `ItemToPurchase()` initializes the attributes with default values. It's called when you create a new object of this class.

**Mutator (Setter) Methods**

- Methods like `setName()`, `setPrice()`, and `setQuantity()` allow you to set the values of the attributes.

**Accessor (Getter) Methods**

Methods like `getName()`, `getPrice()`, and `getQuantity()` allow you to retrieve the values of the attributes.

**Other Methods**

- `printItemPurchase()` displays the item's details.

**ShoppingCartPrinter**

The `ShoppingCartPrinter` class contains the main method, which is the entry point of the program:

```java
import java.util.Scanner;

public class ShoppingCartPrinter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String productName;
        int productPrice;
        int productQuantity;
        int cartTotal;

        // Create two ItemToPurchase objects
        ItemToPurchase item1 = new ItemToPurchase();
        ItemToPurchase item2 = new ItemToPurchase();

        // Get details for item1 from user
        System.out.println("Item 1");
        System.out.print("Enter the item name: ");
        productName = scnr.nextLine();
        item1.setName(productName);

        System.out.print("Enter the item price: ");
        productPrice = scnr.nextInt();
        item1.setPrice(productPrice);

        System.out.print("Enter the item quantity: ");
        productQuantity = scnr.nextInt();
        item1.setQuantity(productQuantity);
        scnr.nextLine();  // Consume newline

        // Get details for item2 from user
        System.out.println("\nItem 2");
        System.out.print("Enter the item name: ");
        productName = scnr.nextLine();
        item2.setName(productName);

        System.out.print("Enter the item price: ");
        productPrice = scnr.nextInt();
        item2.setPrice(productPrice);

        System.out.print("Enter the item quantity: ");
        productQuantity = scnr.nextInt();
        item2.setQuantity(productQuantity);

        // Calculate and display total cost
        cartTotal = (item1.getPrice() * item1.getQuantity()) + (item2.getPrice() * item2.getQuantity());
        System.out.println("\nTOTAL COST");
        item1.printItemPurchase();
        item2.printItemPurchase();
        System.out.println("Total: $" + cartTotal);
    }
}
```

#### **_Explanation_**

1. Creating Objects:

   - `ItemToPurchase item1 = new ItemToPurchase();` creates an object item1 of the `ItemToPurchase` class.

2. Getting User Input:

   - The program uses a `Scanner` object to get item details (name, price, and quantity) from the user.

3. Setting Values:

   - The details entered by the user are set to `item1` and `item2` using the setter methods (`setName()`, `setPrice()`, and `setQuantity()`).

4. Calculating Total Cost:

   - The total cost is calculated by multiplying the price and quantity of each item and summing them up.

5. Displaying Information:

   - The details of each item and the total cost are displayed using the `printItemPurchase()` method and `System.out.println()`.

### Exceptions - Try...Catch:

- Exceptions are events that occur during the execution of a program that, disrupts the normal flow of instruction.

- We use exception along with `try` and `catch` to catch errors and handle them better.

**Example dividing a number by zero error:**

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a whole number to divide: ");
        int x = scanner.nextInt();

        System.out.println("Enter a whole number to divide by: ");
        int y = scanner.nextInt();

        int z = x/y;

        System.out.println("result: " + z);
    }
}
```

**To fix this we can do the following by using `try` and `catch`:**

```java
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try { // Here we put the code we want to try.

            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println("result: " + z);
        }
        // This catches an ArithmeticException, meaning that there is a math error
        catch (ArithmeticException e) {// Here we put the exception we try to catch and give it a name.
            System.out.println("You can't divide by zero! IDIOT!");
        }
        // This catches an input mismatch like putting a word instead of a number in this case.
        catch (InputMismatchException e) {
            System.out.println("PLEASE ENTER A NUMBER OMFG!!!");
        }
        // This catches all kinds of exceptions, but it is considered lazy to use.
        catch (Exception e) {
            System.out.println("Something went wrong");
        }
        // This is a finally exception. it is usually used to close scanners or any other files we may have open.
        finally {
            Scanner.close();
        }
    }
}
```

### APIs

- [Oracle's Java API specification](https://docs.oracle.com/en/java/javase/12/docs/api/index.html)
