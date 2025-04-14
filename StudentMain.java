class Student {
    String name;
    int age;

void setDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

class StudentMain {
    public static void main(String[] args) {
        
        Student student1 = new Student();

       
        student1.setDetails("Omkar Dhadve", 23);

        
        student1.display();
    }
}