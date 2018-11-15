public class Person {
    // declare string name
    private String name;

    public Person(String name) { // constructor
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String sayHello() {
        return String.format("Hello %s!", this.name);
    }

//    Person p2 = new Person("Joey");

    public static void main(String[] args) {
        // only able to use below code due to creation of constructor above
//        Person p1 = new Person("Benny"); // creates new person with name Benny
//        System.out.println(p1.sayHello()); // outputs sayHello method with p1
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); // true for value
//        System.out.println(person1 == person2); // false for different ref type

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); // true same ref type

        Person person1 = new Person("John");
        Person person2 = person1; // assigns value of person1 to person2
        System.out.println(person1.getName()); // John
        System.out.println(person2.getName()); // John
        person2.setName("Jane"); // assigns value to person2 and person1
        System.out.println(person1.getName()); // Jane
        System.out.println(person2.getName()); // Jane
    }
}
