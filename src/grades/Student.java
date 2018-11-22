package grades;

import java.util.ArrayList;
import java.util.List;

public class Student {

//    public static void main( String[] args ) {
////        Student s1 = new Student("Benny");
////
////        System.out.println(s1.grades);
////        System.out.println(s1.getName());
////        System.out.println(s1.getGradeAverage());
//    }

    private String name;
    private List<Integer> grades;

    public Student(){}

    public Student(String name, int grade1, int grade2, int grade3){
        this.name = name;
        this.grades = new ArrayList<>();
        addGrade(grade1, grade2, grade3);
    }

    public String getName(){
       return name;
    }

    public void addGrade(int grade1, int grade2, int grade3){
        this.grades.add(grade1);
        this.grades.add(grade2);
        this.grades.add(grade3);
    }

    public double getGradeAverage(){
        Integer sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

}
