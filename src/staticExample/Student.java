package staticExample;

public class Student {
    // Static variable to keep track of the number of instances
    private static int numberOfStudents = 0;

    // Instance variables
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;

        // Increment the static variable when a new instance is created
        numberOfStudents++;
    }
}