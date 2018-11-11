import java.util.Scanner;
import java.lang.Math;
import java.util.concurrent.TimeUnit;

public class MethodsExercises {


    public static void main(String[] args) throws Exception {

        System.out.println("Adding: " + addition(1, 5));
        System.out.println("Subtracting: " + subtraction(10, 5));
        System.out.println("Multiplying: " + multiplication(4, 4));
        System.out.println("Dividing: " + division(10, 5));
        System.out.println("Modulus: " + modulus(18, 5));

        factorial(getInteger(1, 10));
        rollDiceAsk();

    }

//  Basic Arithmetic
//  Create four separate methods. Each will perform an arithmetic operation:
//
//          Addition
//          Subtraction
//          Multiplication
//          Division

//  Each function needs to take two parameters/arguments so that the operation can be performed.
//
//  Test your functions and verify the output.
//
//  Add a modulus function that finds the modulus of two numbers.
//
//  Food for thought: What happens if we try to divide by zero? What should happen?

    //  Bonus ********
//  Create your multiplication method without the * operator (Hint: a loop might be helpful).
//  Do the above with recursion.

    public static int addition(int num1, int num2){
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2){
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2){
        return num1 * num2;
    }

    public static int division(int num1, int num2){
        return num1 / num2;
    }

    public static int modulus(int num1, int num2){
        return num1 % num2;
    }

// Create a method that validates that user input is in a certain range
//  The method signature should look like this:
//      public static int getInteger(int min, int max);

//  and is used like this:
//      System.out.print("Enter a number between 1 and 10: ");

//  int userInput = getInteger(1, 10);
//  If the input is invalid, prompt the user again.
//
//  Hint: recursion might be helpful here!

    // method to ask user for integer input, then
    // informing user that the input is between a
    // certain range using min and max integers
    public static int getInteger(int min, int max){
        System.out.print("Enter a number between 1 and 10: ");
        Scanner sc =  new Scanner(System.in);
        int input = sc.nextInt();

            if (input >= min && input <= max){
                System.out.println("Your number is: " + input + " and is within range. Good job!");
                return input;
            } else {
                System.out.println("Your number is out of range! Try again please.");
                return getInteger(min, max); // calling getInteger for invalid input
            }
    }

// Calculate the factorial of a number************
//  Prompt the user to enter an integer from 1 to 10.
//  Display the factorial of the number entered by the user.
//  Ask if the user wants to continue.
//  Use a for loop to calculate the factorial.
//  Assume that the user will enter an integer, but verify it’s between 1 and 10.
//  Use the long type to store the factorial.
//  Continue only if the user agrees to.
//  A factorial is a number multiplied by each of the numbers before it.
//  Factorials are denoted by the exclamation point (n!). Ex:
//
//  1! = 1               = 1
//  2! = 1 x 2           = 2
//  3! = 1 x 2 x 3       = 6
//  4! = 1 x 2 x 3 x 4   = 24

    // method to figure out factor of the user input
    public static int factorial(int input){
        long factor = 1;
        for(long i = 1; i <= input; i++) {
            factor *= i; // same as factor = factor * i
        }
        System.out.println("The factor of " + input + " is " + factor);
        return 0;
    }

// Create an application that simulates dice rolling.******************
//  Ask the user to enter the number of sides for a pair of dice.
//  Prompt the user to roll the dice.
//  "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//  Use static methods to implement the method(s) that generate the random numbers.
//  Use the .random method of the java.lang.Math class to generate random numbers.

    // asking for user input for sides of dice and if they want to roll dice
    public static void rollDiceAsk() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sides for a pair of dice [1-6]: ");
        int input = sc.nextInt();
        sc.nextLine();
        System.out.println("Would you like to roll [yes or no]?");
        String answer = sc.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            rollDice(input);
        } else {
            System.out.println("Oh well. Thanks for playing");
        }
    }
    // method to perform dice roll and get random numbers
    // also used delayed print to simulate rolling action
    public static int rollDice(int input) throws Exception {
        printWithDelays("Rolling\n", TimeUnit.MILLISECONDS, 350);
//        System.out.println(" ");
        int dieOne = (int)(Math.random()*input) + 1;
        int dieTwo = (int)(Math.random()*input) + 1;
        System.out.printf("\nDie one is %d.", dieOne);
        System.out.printf("\nDie two is %d.\n", dieTwo);
        System.out.println("The total roll is: " + (dieOne + dieTwo));
        System.out.println("\nWould you like to roll again?");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            rollDice(input);
        } else {
            System.out.println("OK..thanks for playing");
        }
        return 0;
    }
    // delay print function
    // https://stackoverflow.com/questions/19882885/making-text-appear-delayed
    public static void printWithDelays(String data, TimeUnit unit, long delay)
            throws InterruptedException {
        for (char ch:data.toCharArray()) {
            System.out.print(ch);
            unit.sleep(delay);
        }
    }



}
