package LearnJavaFiles.LearningConstructers;

// OOP = object-oriented programming
public class leaningContructersOOP {
    public static void main(String[] args) {

        Students student1 = new Students("Abhay", 15);
        Students student2 = new Students("Jon", 20);
        student1.study();
        student2.study();
        System.out.println(student1.isEnrolled);

    }
}