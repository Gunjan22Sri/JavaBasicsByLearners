class Student {
    String name;
    int age;

    void setDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setDetails("Srinjoy", 23);
        s1.display();
    }
}