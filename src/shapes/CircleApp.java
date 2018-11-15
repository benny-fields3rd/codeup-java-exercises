package shapes;
import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();
        Circle circle = new Circle(input.getDouble(1,50, input.getScanner()));

        System.out.println(circle.getCircumference());
        System.out.println(circle.getArea());
    }

}
