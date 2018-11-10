/********************************
Name: Benny A. Fields III
Program name: Calculator.java
Date: 5 May 2018
Purpose: The purpose of this program is to
         show a package created and a java file
         created inside the package.
********************************/
/* There are two types of packages:
   Built-in packages & user-defined pacakges
   Built-in are packages that are already defined.
   User-defines packages are those the user creates.
*/

public class Calculator {
  public int add(int y, int z){
    return y+z;
  }
  public static void main(String[] args) {
    Calculator obj = new Calculator();
    System.out.println(obj.add(10, 50));
  }
}
