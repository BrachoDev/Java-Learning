# Java Notes

## Learning Resources:

- [W3Schools](https://www.w3schools.com/java/default.asp) - java Documentation
- [Java Full Course fo free ☕](https://www.youtube.com/watch?v=xk4_1vDrzzo) - YouTube Video ⏯️ by Bro Code

## Table of Contents:

- [Class](#class)
- [Print to console](#print-to-console)
- [Comments](#comments)
- [Data Types](#data-types)

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
|:----------|:--------|:----------------------------------------------------------------------------------|
| byte      | 1 byte  | Stores whole numbers from -128 to 127                                             |
| short     | 2 bytes | Stores whole numbers from -32,768 to 32,767                                       |
| int       | 4 bytes | Stores whole numbers from -2,147,483,648 to 2,147,483,647                         |
| long      | 8 bytes | Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| float     | 4 bytes | Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits           |
| double    | 8 bytes | Stores fractional numbers. Sufficient for storing 15 decimal digits               |
| boolean   | 1 bit   | Stores true or false values                                                       |
| char      | 2 bytes | Stores a single character/letter or ASCII values                                  |
