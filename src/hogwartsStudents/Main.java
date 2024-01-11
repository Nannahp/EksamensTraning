package hogwartsStudents;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        ArrayList<HogwartsStudent> students = new ArrayList<>();
        HogwartsStudent student1 = new HogwartsStudent("Lily","Evans");
        student1.setHouse("Gryffindor");
        HogwartsStudent student2 = new HogwartsStudent("Regulus", "Black");
        student2.setHouse("slytherin");

        try {
            HogwartsStudent student3 = new HogwartsStudent("Merlin", "Emerys");
            student3.setHouse("camelot");
        }catch (IllegalArgumentException e){}


        students.add(student1);
        students.add(student2);

        for(HogwartsStudent student: students){
            System.out.println(student.getLastName());
        }
        System.out.println("----");
        Collections.sort(students);

        for(HogwartsStudent student: students){
            System.out.println(student.getLastName());
        }

    }
}
