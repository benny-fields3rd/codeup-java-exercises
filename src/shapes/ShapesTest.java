package shapes;

// Test your code by creating a new class, ShapesTest (also inside of shapes) with a main method.
// Inside the main method,

public class ShapesTest {

    public static void main(String[] args) {
        Measurable myShape;
        myShape = new Rectangle(4, 5);
        System.out.println("Rectangle has an area of: " + myShape.getArea());
        System.out.println("Rectangle has a perimeter of: " + myShape.getPerimeter());

        myShape = new Square(4);
        System.out.println("Square has an area of: " + myShape.getArea());
        System.out.println("Square has a perimeter of: " + myShape.getPerimeter());
// create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width
// of 4 and a length of 5
// verify that the getPerimeter and getArea methods return 18 and 20, respectively.

//        Rectangle box1 = new Rectangle(5, 4) {
//            @Override
//            public double getPerimeter() {
//                return 0;
//            }
//
//            @Override
//            public double getArea() {
//                return 0;
//            }
//
//            @Override
//            public void set_length( double _length ) {
//
//            }
//
//            @Override
//            public void set_width( double _width ) {
//
//            }
//        };
//        System.out.println("Box 1 has a perimeter of: " + box1.getPerimeter());
//        System.out.println("Box 1 has an area of: " + box1.getArea());
//
//// create a variable of the type Rectangle named box2 and assign it a new
//// instance of the Square class that has a side value of 5.
//
//        Rectangle box2 = new Square(5);
//        System.out.println("Box 2 has a perimeter of: " + box2.getPerimeter());
//        System.out.println("Box 2 has an area of: " + box2.getArea());

    }
}
