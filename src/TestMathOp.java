/********************************
Name: Benny A. Fields III
Program name: TestMathOp.java
Date: 23 April 2018
Purpose: The TestMathOp program receives input from
         the user in the form of two numbers and an operator.
         The program will perform addition, subtraction,
         division, and multiplication based off the user input.
********************************/
import java.util.Scanner;

class TestMathOp extends MathOp2 { // Tests classes MathOp and MathOp2

  public static void main(String[] args) {

    double firstNum, secondNum, sum;
    char response;
    char operator;
    MathOp add = new MathOp();
    MathOp sub = new MathOp();
    MathOp2 mul = new MathOp2();
    MathOp2 div = new MathOp2();
    Scanner data = new Scanner(System.in);
    response = ' ';

    do { // asks for the first number
      System.out.println("Enter the First number>> ");
      firstNum = data.nextDouble();
        // asks for the second number
      System.out.println("\nEnter the Second number>> ");
      secondNum = data.nextDouble();
        // asks for the operator
      System.out.println("Enter operator>> ");
      operator = data.next().charAt(0);

      if(operator == '+') { // adds 1st and 2nd numbers
        sum = add.MathAdd(firstNum, secondNum);
        System.out.println("The answer is " + sum);
      }
      else if(operator == '-') { // subtracts 1st and 2nd numbers
        sum = sub.MathSub(firstNum, secondNum);
        System.out.println("The answer is " + sum);
      }
      else if(operator == '*') { // multiplies 1st and 2nd numbers
        sum = mul.MathMul(firstNum, secondNum);
        System.out.println("The answer is " + sum);
      }
      else if(operator == '/') { // divides 1st and 2nd numbers
        sum = div.MathDiv(firstNum, secondNum);
        System.out.println("The answer is " + sum);
      }
      else { // this will inform the user that they did not type in a correct operator
        System.out.println("\nSorry, you did not select either the +, -, *, or / operator");
      }
      System.out.println("\nDo you want another operation (Y/N)?");
      response = data.next().charAt(0);

      if(response == 'N') {
        System.out.println("\nThanks for using our system.");
      }
      else { // this returns back to the loop
        System.out.println("\nLet's do this again!");
      }
    }
      // start of a while loop-will return to do loop if user enters 'Y'
      while(response != 'N');
  } // end of main method
} // end of TestMathOp class
