class Students {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Students() {
        System.out.println("constructor called");
    }
}

public class OOPS2npc {
    public static void main(String[] args) {
        Students s1 = new Students(); // 'new' is a keyword
        s1.name = "Aman"; // 'Students()' is a function of special type , known as Constructor
        s1.age = 24; // it constructs Object in java
                     // constructors have no return type
        Students s2 = new Students(); // NON-PARAMETERIZED CONSTRUCTORS
        s2.name = "Bob";
        s2.age = 25;

        s1.printInfo();
        s2.printInfo();
    }
}
