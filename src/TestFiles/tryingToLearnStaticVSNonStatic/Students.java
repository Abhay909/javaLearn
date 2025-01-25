package TestFiles.tryingToLearnStaticVSNonStatic;

public class Students {

    int age;

    public static final int maxScoreOnTest = 100;
    public static int numberOfStudents;

    public Students() {
        numberOfStudents++;
    }
    public int numberOfStudents() {
        return numberOfStudents;
    }
}
