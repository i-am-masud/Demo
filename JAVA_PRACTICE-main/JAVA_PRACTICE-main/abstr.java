import javax.sql.rowset.spi.SyncResolver;

abstract class Animal {
    public void walk(); // ----------->> or >> abstract void walk();

    public void eat() {
        System.out.println("animal eats");
    }
}

class Horse extends Animal {
    System.out.println("walks on 4 legs");
}

class Chicken extends Animal {
    System.out.println("walks on 2 legs");
}

public class abstr {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();

        Animal animal = new Animal(); // this will give run-time error because Animal is an abstract class //
        animal.walk();
    }
}

// ************************************************ Interfaces
// ************************************************
