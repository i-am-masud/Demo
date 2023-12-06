class Students {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }

}

public class polym {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "Aman";
        s1.age = 24;

        s1.printInfo(s1.name);

    }

}
