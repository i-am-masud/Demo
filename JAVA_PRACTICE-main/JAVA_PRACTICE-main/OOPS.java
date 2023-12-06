class Pen {                                         // creating a CLASS (Class name starts with capital letter )
    String color;                                  // properties
    String type;                                   // properties

    public void write() {                          // function & method (function name starts with small letters)
        System.out.println("write somethig");
    }

}

    // Another method under class :

    public void printColor() {                        // 'this' will tell which object has called this function
        System.out.println(this.color);
    }

    // now creating the Object of the CLASS.                     // *** Class have data and member
    // create object is done under Main function                        Data : String, Int type of DATA
    //                                                                  Members : Function              *** //

public class OOPS {
    public static void main(String args[]) {
        Pen pen1 = new Pen();                          // Object name will start with CLASS name
        pen1.color = "blue";                           // properties of the object 
        pen1.type = "gel" ;                            // properties of the object

        pen1.write();                                  // calling the function

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ball";

        pen1.printColor();
        pen2.printColor();

    }
}
