package shapes;

// Create a class named Square, also inside of shapes, that extends Rectangle. Square should define
// a constructor that accepts one argument, side, and calls the parent's constructor to set both the
// length and width to the value of side.

public class Square extends Quadrilateral implements Measurable{

//    public Square(){

    public Square(double side) {
    //        super._length = side; // this works because of protected, but the below is better
    //        super._width = side;
        super(side, side);
    }

    @Override
    public void set_length( double _length ) {
        this._length = _length;
        this._width = _length;
    }

    @Override
    public void set_width( double _width ) {
        this._length = _width;
        this._width = _width;
    }

    //



// In the Square class, override the getArea and getPerimeter methods with the following definitions for a square
// perimeter = 4 x side
// area = side ^ 2

    public double getPerimeter(){
//        System.out.println("Inside Square");
        return 4 * this._length;
    }

    public double getArea(){
//        System.out.println("Inside Square");
        return Math.pow(this._length, 2);
    }
}
