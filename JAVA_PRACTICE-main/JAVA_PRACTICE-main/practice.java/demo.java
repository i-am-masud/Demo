class Student {
    int rollNo;                      // attributes
    String name;
    public void printdetails() {
        System.out.println(rollNo);
        System.out.println(name);
    }
}

public class demo {
    public static void main(String[] args) {
       Student s1 = new Student();
       Student s2 = new Student();     //Instantiating a new object - Student
       
       s1.rollNo = 2308508;            // setting attributes or properties
       s1.name = "md";
       s2.rollNo = 2308509;
       s2.name = "niladri";

       System.out.println(s1.name);
       System.out.println(s1.rollNo);
       System.out.println(s2.name);
       System.out.println(s2.rollNo);

    s1.printdetails();
    s2.printdetails();
    }
}
