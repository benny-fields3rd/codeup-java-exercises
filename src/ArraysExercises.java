import java.util.Arrays;


public class ArraysExercises {

    public static void main (String[] args) {
// 1.
// What happens when you run the following code? Only reference number shows.
// Why is Arrays.toString necessary? Allows to peek inside array
    int[] numbers = {1, 2, 3, 4, 5};
    System.out.println(Arrays.toString(numbers));

// Create an array that holds 3 Person objects. Assign a new instance
// of the Person class to each element. Iterate through the array
// and print out the name of each person in the array.
    Person[] people = new Person[3];
    people[0] = new Person("Bobby");
    people[1] = new Person("Robert");
    people[2] = new Person("Suzanne");

    for (Person person : people) {
     System.out.println(person.getName());
    }

    people = addPerson(people,new Person("Joey")); // store in a variable to call it
        for (Person person : people) {
            System.out.println(person.getName());
        }
//Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object
// to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed
// person object at the end of the array.
//
    }

    public static Person[] addPerson(Person[] people, Person person){
        Person[] people2 = Arrays.copyOf(people, people.length + 1);
        people2[people.length] = person;
//        System.out.println(Arrays.toString(people));
//        System.out.println(Arrays.toString(people2));
        return people2;
    }



}
