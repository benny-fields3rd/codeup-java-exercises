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
        askUser();
    }

    public static void askUser(){
        Input input = new Input(new Scanner(System.in));
        Movie[] allMovies = MoviesArray.findAll();
        String message;
        message = "What would you like to do?\n";
        message += "0 - exit\n";
        message += "1 - view all movies\n";
        message += "2 - view movies in the animated category\n";
        message += "3 - view movies in the drama category\n";
        message += "4 - view movies in the horror category\n";
        message += "5 - view movies in the scifi category\n";

    System.out.println(message);
    System.out.println("Enter your choice: ");
        int userAnswer = input.getInt(0, 5);
        if (userAnswer == 1) {
            for (Movie film : allMovies) {
                System.out.println(film.getName());
            }
        } else if (userAnswer == 2) {
            for (Movie film : allMovies) {
                if (film.getCategory().equals("animated")) {
                    System.out.println("Title: " + film.getName() + "\n Category: " + film.getCategory());
                }
            }
        } else if (userAnswer == 3) {
            for (Movie film : allMovies) {
                if (film.getCategory().equals("drama")) {
                    System.out.println("Title: " + film.getName() + "\n Category: " + film.getCategory());
                }
            }
        } else if (userAnswer == 4) {
            for (Movie film : allMovies) {
                if (film.getCategory().equals("horror")) {
                    System.out.println("Title: " + film.getName() + "\n Category: " + film.getCategory());
                }
            }
        } else if (userAnswer == 5) {
            for (Movie film : allMovies) {
                if (film.getCategory().equals("scifi")) {
                    System.out.println("Title: " + film.getName() + "\n Category: " + film.getCategory());
                }
            }
        } else {
            System.out.println("The end");
        }






    }

}
