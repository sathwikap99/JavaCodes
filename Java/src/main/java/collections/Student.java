
package collections;
//        Given an ArrayList of Students, where each Student class has firstName, LastName and GPA as variables,
//        write a program to remove all the students who has GPA less than the average GPA. Then, print the remaining students.
import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public float getGpa() {
        return gpa;
    }

    private String firstName;
    private String lastName;
    private float gpa;
    public static ArrayList<Student> studentArrayList = new ArrayList<>();

//    public static void addStudent(ArrayList<Student> studentarr) {
//        studentArrayList=(studentarr);
//    }

//    public Student(){}

    public Student(String firstName, String lastName, float gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + " " + this.getGpa();
    }

    public static void display() {
        for (Student obj : studentArrayList
        ) {
            System.out.println(obj);
        }
    }

    public static ArrayList<Student> belowAverageStudents(ArrayList<Student> arrayList) {
        float avg = 0.0f;
        float sum = 0;
        for (Student obj : arrayList) {
            sum += obj.getGpa();
        }
        avg = sum / arrayList.size();
        ArrayList<Student> newArrayList = new ArrayList<>();
        System.out.println(avg);
        System.out.println(sum);
        for (Student obj : arrayList
        ) {
            if (obj.getGpa() > avg) {
                newArrayList.add(obj);
            }
        }
        return newArrayList;
    }
}