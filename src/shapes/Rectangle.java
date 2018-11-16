package shapes;

// Inside of your shapes directory, create a class named Rectangle. It should have protected properties
// for both length and width. Rectangle should define a constructor that accepts two numbers for length
// and width, and sets those properties.

public class Rectangle extends Quadrilateral implements Measurable {

//    protected double _length;
//    protected double _width;
//
//    public Rectangle(){}

    public Rectangle( double length, double width){
        super(length, width);
    }

    @Override
    public void set_length( double _length ) {
        this._length = _length;
    }

    @Override
    public void set_width( double _width ) {
        this._width = _width;
    }

// Create two methods on the Rectangle class, getArea and getPerimeter that return the respective
// values. The formulas for both follow:
// perimeter = 2 x length + 2 x width
// area = length x width

    public double getArea(){
//        System.out.println("Inside Rectangle");
        return _length * this._width;
    }

    public double getPerimeter(){
//        System.out.println("Inside Rectangle");
        return 2 * this._length + 2 * this._width;
    }
}
