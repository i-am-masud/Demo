class Student {
    String name;
    int age;

    public void PrintInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name, int age) { // PARAMETERIZED CONSTRUCTORS
        this.name = name;
        this.age = age;
    }
}

public class OOPS2pc {
    public static void main(String[] args) {
        Student s1 = new Student("aman", 24);
        s1.PrintInfo();
    }

}
