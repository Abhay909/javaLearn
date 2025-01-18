package LearnJavaFiles.SuperKeyword;

public class main {
    public static void main(String[] args) {
        // supper = refers to a parent class (subclass <-- superclass)
        //     used in contructers; and method overriding
        //     calls the parent constructor to initialize attributes.

        // From wild kratts :)
        Person person = new Person("Chris", "Kratt");
        person.showName();

        Student student = new Student("Martin", "Kratt", 3.5);
        student.showGPA();

        Employee employee = new Employee("Amar", "kapatkar", 100000);
        employee.showSalary();

    }
}
