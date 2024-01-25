package arraylists;

import java.util.ArrayList;

class Student {
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{firstName='" + firstName + "', lastName='" + lastName + "', gpa=" + gpa + '}';
    }
}



