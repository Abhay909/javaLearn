package LearnJavaFiles.LearningConstructers;

public class Students {
    String name = "abhay";
    int age = 15;
    boolean isEnrolled = false;

    Students(String name, int age) {
        this.isEnrolled = true;
    }

    void study() {
        System.out.println(this.name + " is studying");
    }

}
