package util;

public class InputTest {

    public static void main(String[] args) {

        Input input = new Input();
        System.out.println(input.getString());
        System.out.println(input.yesNo(input.getScanner()));
        System.out.println(input.getDouble(1, 100, input.getScanner()));

        System.out.println(input.getInt(1,50));
    }
}
