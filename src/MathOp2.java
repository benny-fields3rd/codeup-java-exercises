/********************************
Name: Benny A. Fields III
Program name: MathOp2.java
Date: 23 April 2018
Purpose: The MathOp2 program inherits from MathOp
         and details the multiplication and division
         functions.
********************************/

// Create the MathOp2 class to house the calculations of multiplication
// and division
class MathOp2 extends MathOp {
// compute multiplication and division methods
  double MathMul(double firstNum, double secondNum) {
    double mul = firstNum * secondNum;
    return mul;
  } // end of MathMul method
  double MathDiv(double firstNum, double secondNum) {
    double div = firstNum / secondNum;
    return div;
  }// end of MathDiv method
} // end of MathOp2 class
