package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double _length;
    protected double _width;

    public Quadrilateral( double length, double width ) {
        this._length = length;
        this._width = width;
    }

    public double get_width() {
        return _width;
    }

    public double get_length() {
        return _length;
    }

    public abstract void set_length( double _length );
    public abstract void set_width( double _width );
}
