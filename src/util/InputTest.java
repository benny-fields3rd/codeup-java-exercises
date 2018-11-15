package util;

import java.util.Scanner;

public class InputTest {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Input input = new Input(scanner);
        System.out.println(input.getString());
        System.out.println(input.yesNo());
        System.out.println(input.getDouble(1, 100));

        System.out.println(input.getInt(1,50));
    }
}
