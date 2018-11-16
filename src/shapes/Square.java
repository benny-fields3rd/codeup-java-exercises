package shapes;

// Create a class named Square, also inside of shapes, that extends Rectangle. Square should define
// a constructor that accepts one argument, side, and calls the parent's constructor to set both the
// length and width to the value of side.

public class Square extends Rectangle{

    protected int _side;

    public Square(){}

    public Square(int side) {
        super._length = side;
        super._width = side;
    }


// In the Square class, override the getArea and getPerimeter methods with the following definitions for a square
// perimeter = 4 x side
// area = side ^ 2

//    public int getArea(){
//        return (int) Math.sqrt(_side);
//    }
//    public int getPerimeter(){
//        return 4 * _side;
//    }

}
