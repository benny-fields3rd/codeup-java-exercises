/*******************
  Name: Benny Fields III

  Date: 17 Feb 2018

  Notes: Assignment 2 to show a break in a while loop using the break control.
		 The user has to input an integer and if they guess 0, then they are out
		 of the loop.
*******************/
import java.util.Scanner;


class WhileLoopWithBreak1 {

  public static void main(String[] args) {

    int n;
	
    Scanner input = new Scanner(System.in);
		
	while (true) {
		System.out.println("Enter an integer");
        n = input.nextInt();
		
		if(n != 0) {
			System.out.println("You entered " + n);
			continue;
		}		
		else {
			break;
		}
	}
  System.out.println("You are out of the loop!");
  }
  
}






