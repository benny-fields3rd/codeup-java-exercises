import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//  1. Loop Basics
//  a. While
//  Create an integer variable i with a value of 5.
//  Create a while loop that runs so long as i is less than or equal to 15
//  Each loop iteration, output the current value of i, then increment i by one.
//  Your output should look like this:
//
//  5 6 7 8 9 10 11 12 13 14 15

//        int i = 5;
//        while(i <= 15) {
//            System.out.print(i++ + " ");
//        }

//  b. Do While
//  Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        int num = 0;
//        do {
//            System.out.println(num);
//            num += 2;
//        } while (num <= 100);

//  Alter your loop to count backwards by 5's from 100 to -10.
//        int num2 = 100;
//        do {
//            System.out.println(num2);
//            num2 -= 5;
//        } while (num2 >= -10);

//  Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:

//  2
//  4
//  16
//  256
//  65536

//        double x = 2;
//        do {
//            int num3 = (int) x;
//            System.out.println(num3);
//            x *= x;
//        } while (x <= 1000000);

//  c. For
//  refactor the previous two exercises to use a for loop instead
//        for (int x = 5; x <= 15; x++) {
//            System.out.print(x + " ");
//        }

//        for (int i = 2; i <= 100; i += 2) {
//            System.out.println(i);
//        }
//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        for (long i = 2; i <= 1000000; i *= i) {
//            System.out.println(i);
//        }

//  2. Fizzbuzz
//
//  One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to test basic looping and conditional logic skills.
//
//  Write a program that prints the numbers from 1 to 100.
//  For multiples of three print “Fizz” instead of the number
//  For the multiples of five print “Buzz”.
//  For numbers which are multiples of both three and five print “FizzBuzz”.

//    for (int i = 1; i <=100; i++){
//    //    System.out.println(i);
//        if (i % 3 == 0 && i % 5 ==0){
//            System.out.println("FizzBuzz");
//        } else if (i % 3 == 0) {
//            System.out.println("Fizz");
//        } else if (i % 5 == 0) {
//            System.out.println("Buzz");
//        } else {
//            System.out.println(i);
//        }
//    }

//  4. Display a table of powers.

//  Prompt the user to enter an integer.
//  Display a table of squares and cubes from 1 to the value entered.
//  Ask if the user wants to continue.
//  Assume that the user will enter valid data.
//  Only continue if the user agrees to.

//  Example Output
//  What number would you like to go up to? 5

//          Here is your table!
//          number | squared | cubed
//          ------ | ------- | -----
//          1      | 1       | 1
//          2      | 4       | 8
//          3      | 9       | 27
//          4      | 16      | 64
//          5      | 25      | 125

        String more;
        do {
            System.out.println("Enter a number you would like to go up to: ");
            // declare multiple variables
            int i, numLimit, square, cube;
            // assign user input to numLimit and
            // pulls ints out of string
            numLimit = Integer.parseInt(scanner.nextLine());

            System.out.println("Number | Squared | Cubed");
            System.out.println("------ | ------- | -----");
            // for loop
            for(i = 1; i <= numLimit; i++){
                // calculate square and cube
                square = i * i;
                cube = i * i * i;
                // using printf and specify number of tabs/indents/spaces
                System.out.printf(" %-5d | %-6d  | %d %n", i, square, cube);
            }
            System.out.println("Would you like to continue? ");
            // assign user input to more
            more = scanner.nextLine();
          // allows for both lowercase and uppercase
        } while (more.equalsIgnoreCase("yes"));
        System.out.println("Have a great day!");

//   Convert given number grades into letter grades.
//
//   Prompt the user for a numerical grade from 0 to 100.
//   Display the corresponding letter grade.
//   Prompt the user to continue.
//   Assume that the user will enter valid integers for the grades.
//   The application should only continue if the user agrees to.
//   Grade Ranges:
//
//   A : 100 - 88
//   B : 87 - 80
//   C : 79 - 67
//   D : 66 - 60
//   F : 59 - 0

        String someMore;

          do {
              System.out.println("Enter a number from 0 to 100 for your grade: ");
              int grade = Integer.parseInt(scanner.nextLine());

              if (grade <= 100 && grade >= 88) {
                  System.out.printf("You entered: %d. The grade is A!\n", grade);
              } else if (grade >= 80) {
                  System.out.printf("You entered: %d. The grade is B!\n", grade);
              } else if (grade >= 67) {
                  System.out.printf("You entered: %d. The grade is C!\n", grade);
              } else if (grade >= 60) {
                  System.out.printf("You entered: %d. The grade is D!\n", grade);
              } else if (grade >= 0) {
                  System.out.printf("You entered: %d. The grade is F!\n", grade);
              } else {
                  System.out.println("You didn't enter a grade!\n");
              }
              System.out.println("Would you like to continue? ");
              someMore = scanner.nextLine();
          } while (someMore.equalsIgnoreCase("yes"));
            System.out.println("Have a great day!");
    }
}

