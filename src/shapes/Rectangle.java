package shapes;

// Inside of your shapes directory, create a class named Rectangle. It should have protected properties
// for both length and width. Rectangle should define a constructor that accepts two numbers for length
// and width, and sets those properties.

public class Rectangle {

    protected int _length;
    protected int _width;

    public Rectangle(){}

    public Rectangle( int length, int width){
        this._length = length;
        this._width = width;
    }

// Create two methods on the Rectangle class, getArea and getPerimeter that return the respective
// values. The formulas for both follow:
// perimeter = 2 x length + 2 x width
// area = length x width

    public int getArea(){
        return this._length * this._width;
    }

    public int getPerimeter(){
        return 2 * this._length + 2 * this._width;
    }
}
