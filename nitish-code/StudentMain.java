public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setDetails("Nitish", 21);
        s1.display();
    }
}
class Student {
     String name;
    int age;
      void setDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}
