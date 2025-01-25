package TestFiles.tryingToLearnStaticVSNonStatic;

public class main {

    public static void main(String[] args) {

        Students students = new Students();
        Students students1 = new Students();

        System.out.println(students.numberOfStudents());
        System.out.println(Students.maxScoreOnTest);

    }

}
