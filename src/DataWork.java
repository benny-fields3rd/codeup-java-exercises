/*******************
Name: Benny Fields III
Date: 14 April 2018
Notes: This program assigns variables of different types
       and then prints out the comparisons to assigned new
       variables ans then displays the boolean of true or false.
       According tot he assignment instruction, we had to use TWO 
       comparison operators per variable. I did just that.
       To have some fun, I used the variables: f, l, s, and t
       which stands for Florida State University.
*******************/

public class DataWork {
  // create 4 variables of different data types
  public int f;     // assigns a int variable
  public float l;   // assigns a float variable
  public char s;    // assigns a char variable
  public double t;  // assigns a double variable

  public void compare() {
    // Use two different comparison operators for each data type declared
    // and print the output for each of those
    System.out.println("While f > 100 is " + (f > 100) + ", the opposite, f < 100 is " + (f < 100) + ".");
    System.out.println("While l < 16.06 is " + (l < 16.06) + ", the opposite, l  > 16.06 is " + (l > 16.06) + ".");
    System.out.println("While s == 's' is " + (s == 's') + ", the opposite, s != 's' is " + (s != 's') + ".");
    System.out.println("While t != 25.0015 is " + (t != 25.0015) + ", the opposite, t == 25.0015 is " + (t == 25.0015) + ".");
  }

  public static void main (String args []) {

     DataWork dw = new DataWork();
     dw.f = 200;
     dw.l = (float)15.50;
     dw.s = 'l';
     dw.t = 15.957;
     dw.compare();
  }
}
