import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class FileReadWrite {
    // Create a method for retrieving file contents.
    //
    //The method should accept a string that is the location of
    // the file, and return a list of strings where each string is
    // a line in the file.
    public static void main( String[] args ) {

        fileRead();
//        fileWrite("Subaru","src/Test.txt", fileRead());
    }

    public static void fileRead(){
        Path carMakers = Paths.get("src/Test.txt");
        List<String> makers = new ArrayList<>();

        try {
            makers = Files.readAllLines(carMakers);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(makers);

        for(String makersCar : makers) {
            System.out.println(makersCar);
        }
    }

    public static void fileWrite(List<String> newItems, Path p){
        Path carMakers = p;
        List<String> makers = newItems;

        try {
            Files.write(carMakers, makers, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(makers);

    }
}






