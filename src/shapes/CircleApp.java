package shapes;
import util.Input;

import java.util.Scanner;

public class CircleApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Input input = new Input(scanner);
        Circle circle = new Circle(input.getDouble(1,50));

        System.out.println(circle.getCircumference());
        System.out.println(circle.getArea());
    }

}
