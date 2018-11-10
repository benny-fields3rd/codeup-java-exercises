/*******************
  Name: Benny A. Fields III

  Date: 3 March 2018

 Notes: This program assigns the Class car and objects while
        returning each of the objects for the Car class in the output.    
*******************/

public class Car                                                //Create "Car" class
{
 public static final String color = "blue";              //Assigns the color
 public static final String bodyType = "sports sedan";   //Assigns the body type
 public static final String make = "Kia";                //Assigns the make
 public static final String model = "Stinger";           //Assigns the model
 
 public static String accelerate()                       //Creates accelerate
 {
	 String motion = "Speeding up!";                      //Creates the motion string
	 return motion;                                       //Recalls the motion string
  }
 }
 
class CarObject                                          //Creates the CarObject class
 {
 public static void main(String[] args)
  {  
     //Prints out each of the objects under the car class to include the accelerate string.
	  System.out.println("The " + Car.color + ", " + Car.make + " " + Car.model + " " + Car.bodyType + " is " + Car.accelerate ());
 } 
}