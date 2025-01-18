package LearnJavaFiles.LearningConstructers;

public class Students {
    String name;
    int age;
    boolean isEnrolled;

    Students(String name, int age) {
        this.isEnrolled = true;
        this.name = name;
        this.age = age;
    }

    void study() {
        System.out.println(this.name + " is studying");
    }

}
