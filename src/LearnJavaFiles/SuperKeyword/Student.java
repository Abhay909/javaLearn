package LearnJavaFiles.SuperKeyword;

public class Student extends Person {

    double gpa;

    Student(String first, String last, double gpa) {
        // Super is like the parent
        super(first, last);
        this.gpa = gpa;
    }

    void showGPA() {
        System.out.println(this.first + "'s gpa is: " + this.gpa);
    }

}
