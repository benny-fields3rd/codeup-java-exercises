package shapes;
import util.Input;

import java.util.Scanner;

public class CircleApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Input input = new Input(scanner);
        System.out.println("Please enter a radius length:");
        double radius = input.getDouble();


        Circle circle = new Circle(input.getDouble());
        System.out.println(circle.getCircumference());
        System.out.println(circle.getArea());
    }

}
