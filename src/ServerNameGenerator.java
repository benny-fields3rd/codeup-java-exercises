import java.util.Random;

public class ServerNameGenerator {
    //Server Name Generator
    //
    //We are going to build a server name generator. Create a class inside of src named ServerNameGenerator, and follow the specs below.

    //Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display
    // the generated name to the user.
    //Example Output****
    //Here is your server name:
    //dedicated-photon
    public static void main(String[] args) {
        String rndAdjectives = getRandom(adjectives), rndNouns = getRandom(nouns);
        System.out.printf("Here is your server name: %n" + rndAdjectives + "-" + rndNouns);
    }
    //Create a method that will return a random element from an array of strings.
    public static String[] adjectives = {"great", "small", "snotty", "gracious", "mean", "funny", "slimy", "ridiculous", "generous", "happy"};
    //Create two arrays whose elements are strings, one with at least 10 adjectives, another with at least 10 nouns.
    public static String[] nouns = {"car", "dog", "house", "laptop", "boy", "girl", "bat", "ball", "movie", "cat"};

    public static String getRandom(String[] array) {
        return array[new Random().nextInt(array.length)];
    }


}
