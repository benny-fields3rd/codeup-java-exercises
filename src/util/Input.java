package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input(Scanner scanner) {
//        this.scanner = new Scanner(System.in);
        this.scanner = scanner;
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {

        String input = getString();
        if (input.equalsIgnoreCase("yes")) {
            return true;
        } else if (input.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }
    public int getInt() {
        if (!scanner.hasNextInt()) {
            System.out.println("Not valid integer, try again");
            scanner.nextLine();
            return getInt();
        } else {
            return scanner.nextInt();
        }
    }

    public int getInt(int min, int max){
        int numberInput = getInt(); // Use the above getInt method
        if (numberInput >= min && numberInput <= max){
//            System.out.println("Your number is: " + numberInput + " and is within range. Good job!");
            return numberInput;
        } else {
            System.out.println("Your number is out of range! Try again please.");
            return getInt(min, max); // calling getInteger for invalid input
        }
    }

    public double getDouble() {
        if (!scanner.hasNextDouble()) {
            System.out.println("Not valid double, try again");
            scanner.nextLine();
            return getDouble();
        } else {
            return scanner.nextDouble();
        }
    }

    public double getDouble(double min, double max){
            double doubleInput = getDouble();
            if (doubleInput >= min && doubleInput <= max) {
                return doubleInput;
            } else {
                System.out.println("Your number is out of range! Try again please.");
                return getDouble(min, max); // calling getInteger for invalid input
            }
        }
    }

