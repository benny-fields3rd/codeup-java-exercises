package movies;
import util.Input;

import java.util.Scanner;
// Give the user a list of options for viewing all the movies or viewing movies by category.
//Use your Input class to get input from the user, and display information based on their choice. (Remember to import your Input class)
//If a category is selected, only movies from that category should be displayed.
//Your application should continue to run until the user chooses to exit.
//Sample Output********
//What would you like to do?
//
//0 - exit
//1 - view all movies
//2 - view movies in the animated category
//3 - view movies in the drama category
//4 - view movies in the horror category
//5 - view movies in the scifi category
//
//Enter your choice: 1
//Frankenstein -- horror
//Goodfellas -- drama
//Pulp Fiction -- drama
//...

public class MoviesApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Input input = new Input(scanner);
        askUser();
        System.out.println("Enter your choice: ");
        String input = new Input(scanner);

    }

public static void askUser(){
    System.out.println("What would you like to do?");
    System.out.println("0 - exit");
    System.out.println("1 - view all movies");
    System.out.println("2 - view movies in the animated category");
    System.out.println("3 - view movies in the drama category");
    System.out.println("4 - view movies in the horror category");
    System.out.println("5 - view movies in the scifi category");
}
public static void option0() {

    }

}
