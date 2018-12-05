public class RandomStudent {
    private static String[] students = {
            "Karen",
            "Steven",
            "Stuart",
            "KC",
            "Joaquin",
            "Mark",
            "David",
            "Ryan",
            "Kyla",
            "Matthew",
            "Enrique",
            "Juan",
            "Stephen",
            "Pibo",
            "Maria",
            "Julian",
            "Benny"
    };

    private static String randomElement(String[] strings){
        int magicNum = (int) (Math.random() * strings.length);
        return strings[magicNum];
    }

    public static void main(String[] args) {
        System.out.println("\nRandomly selected student:");
        System.out.println(randomElement(students));
    }
}
