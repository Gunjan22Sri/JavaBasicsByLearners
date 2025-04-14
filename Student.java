public class Student {
    String name;
    int age;

    public void setDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}
public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.setDetails("Hari Priya", 22);
        student.display();
    }
}
