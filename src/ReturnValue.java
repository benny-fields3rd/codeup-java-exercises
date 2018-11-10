/*******************
  Name: Benny Fields III

  Date: 25 Feb 2018

  Notes: This program returns the value of 4. 
*******************/

public class ReturnValue {

  public static void main(String[] args) {
	myMethod(); 								 //myMethod runs once to return 4
	int myInt = 0; 								 
	System.out.println(myInt);
	myInt = myMethod();
	System.out.println(myInt);					 //Return value is 4
  }
	
	
  public static int myMethod()
	{
	System.out.println("This week was tough!");
	return 4;                                 //return statement
  }	
}