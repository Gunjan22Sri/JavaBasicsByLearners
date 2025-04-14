class Student {
    String name;
    int age;

    void setDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name=" + name);
        System.out.println("Age=" + age);
    }
}

class StudentMain {
    public static void main(String a[]) {
        Student student = new Student();
        student.setDetails("John", 22); // Pass name and age
        student.display();
    }
}
