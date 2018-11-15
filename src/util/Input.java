package util;
import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input(Scanner scanner) {
//        this.scanner = new Scanner(System.in);
        this.scanner = scanner;
    }

    public Scanner getScanner() {
        return this.scanner;
    }

    public String getString() {
        System.out.println("Enter a string"); // it is not a good practice to ask the question here.
        return this.scanner.nextLine();
    }

    public boolean yesNo(Scanner scanner) {
        System.out.println("Are you 21 or older?"); // it is not a good practice to ask the question here.
        String input = this.scanner.nextLine();
        if (input.equalsIgnoreCase("yes")) {
            return true;
        } else if (input.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }

    public double getDouble(double min, double max, Scanner scanner){
        System.out.print("Enter a number with or without a decimal: ");
        double numberInput = this.scanner.nextDouble();

        if (numberInput >= min && numberInput <= max){
            System.out.println("Your number is: " + numberInput + " and is within range. Good job!");
            return numberInput;
        } else {
            System.out.println("Your number is out of range! Try again please.");
            return getDouble(min, max, scanner); // calling getInteger for invalid input
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
            System.out.println("Your number is: " + numberInput + " and is within range. Good job!");
            return numberInput;
        } else {
            System.out.println("Your number is out of range! Try again please.");
            return getInt(min, max); // calling getInteger for invalid input
        }
    }
}

