import java.util.Scanner;

public class java_string_bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        ================================= JAVA STRING BONUSES
//
//                ----BONUS 1
//        Create date format converter application.
//                Take in the following format:
//        MM/DD/YYYY
//
//        Output the following:
//        MonthName DD, YYYY

//        Example:
//        input - 12/01/1999
//        output - December 01, 1999
        String mm = "";
        String dd;
        String yyyy;

        System.out.println("Enter a date in the following format: MM/DD/YYYY: ");
        scanner.nextLine();

        if (mm.equals("01")) {
            mm = "January";
        } else if (mm.equals("02")) {
            mm = "February";
        } else if (mm.equals("03")) {
            mm = "March";
        } else if (mm.equals("04")) {
            mm = "April";
        } else if (mm.equals("05")) {
            mm = "May";
        } else if (mm.equals("06")) {
            mm = "June";
        } else if (mm.equals("07")) {
            mm = "July";
        } else if (mm.equals("08")) {
            mm = "August";
        } else if (mm.equals("09")) {
            mm = "September";
        } else if (mm.equals("10")) {
            mm = "October";
        } else if (mm.equals("11")) {
            mm = "November";
        } else if (mm.equals("12")) {
            mm = "December";
        }
        System.out.println(mm);

//                ----BONUS 2
//
//        Create an application that allows the user to enter a sentence
//        and tells them how many vowels and consonants were used.
//
//        Example:
//
//        input - "The hill are alive."
//        output - 5 vowels and 10 consonants
//
//
//                ----BONUS 3
//
//        Create a command line calculator application.
//
//        The program should welcome the user, prompt them for a calculation,
//        and give the result. The user should be prompted after each result is
//        outputted if they want to enter another calculation. When they
//        say no, give them an exit message. Allow the user first to specify
//        how many operands they will enter. Do not worry about
//        input validation (assume user enters correct data type).
//
//        Example program:
//
//...
//
//        WELCOME TO THE CALCULATOR APP!!! (program output)
//
//        Do you wish to enter a new calculation? (program output)
//        yes (user inputs this)
//
//        How many operands will you calculate? (program output)
//        2 (user inputs this)
//
//        Please enter a calculation: (program output)
//        2 + 2 (user enters this or something like this)
//        The output of 2 + 2 is 4. (program outputs this)
//
//        Do you wish to enter a new calculation? (program outputs this)
//        no (user enters this)
//
//        GOODBYE!!!
    }
}
