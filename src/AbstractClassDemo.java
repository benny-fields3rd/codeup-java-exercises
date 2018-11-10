/********************************
Name: Benny A. Fields III
Program name: AbstractClassDemo.java
Date: 5 May 2018
Purpose: The purpose of this program is to
         show that abstract can extend only
         one class or abstract class at a time.
********************************/

/*1) Abstract class can only extend either one class or
  one abstract class at a given point in time
  2) Abstract class can extend another concrete class or
  abstract class.
  3) Keyword of "abstract" is mandatory fo rdeclaring abstracts.
  4) Abstract classes must have protected and public abstract methods.
  5) May have static, final, static final variables with any sccess specifier.
*/
class Sample1 {
  public void displayOne(){
    System.out.println("displayOne method");
  }
}
abstract class Sample2{
  public void displayTwo(){
    System.out.println("displayTwo method");
  }
}
abstract class Sample3 extends Sample1{
  public void displayThree(){
  }
}
class Sample4 extends Sample3{
  public void displayThree(){
    System.out.println("displayThree method");
  }
}
class AbstractClassDemo {
  public static void main(String[] args) {
    Sample4 obj = new Sample4();
    obj.displayThree();
  }
}
