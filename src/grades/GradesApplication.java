package grades;

import java.util.HashMap;
import java.util.Scanner;

import util.Input;

public class GradesApplication extends Student {

    public static void main( String[] args ) {
        Input input = new Input(new Scanner(System.in));
        HashMap<String, Student> students = new HashMap<>();

        Student s1 = new Student("Benny", 88, 91, 75);
        Student s2 = new Student("Robyn", 88, 67, 75);
        Student s3 = new Student("Gregory", 90, 95, 92);
        Student s4 = new Student("Smitty", 75, 74, 78);

        students.put("bfields3", s1);
        students.put("Rory321", s2);
        students.put("TrueGreen", s3);
        students.put("ShaqSmoo", s4);

//        System.out.printf("Student name and grade average: %s, %s%n",s1.getName(),s1.getGradeAverage());
//        System.out.printf("Student name and grade average: %s, %s%n",s2.getName(),s2.getGradeAverage());
//        System.out.printf("Student name and grade average: %s, %s%n",s3.getName(),s3.getGradeAverage());
//        System.out.printf("Student name and grade average: %s, %s%n",s4.getName(),s4.getGradeAverage());

        System.out.println(students.keySet());

        System.out.println("Welcome!");
        System.out.println("Here are the Github usernames of our students:");
            Input input2 = new Input(new Scanner(System.in));
            for (String key : students.keySet()) {

            }
    }
}



