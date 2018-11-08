import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner
        // variable more
        String more;
        // do while loop to create response based on question type and ending
        do {
            System.out.println("Ask Bob a question.");
            String response;
            response = scanner.nextLine();
            if (response.endsWith("?")) {
                System.out.println("Sure");
            } else if (response.endsWith("!")){
                System.out.println("Whoa, chill out!");
            } else if (response.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
            System.out.println("Would you like to ask Bob more questions?");
            // assign user input to more
            more = scanner.nextLine();
            // allows for both lowercase and uppercase
        } while (more.equalsIgnoreCase("yes"));
        System.out.println("Have a great day!");
    }
}
