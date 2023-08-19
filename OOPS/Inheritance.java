package OOPS;

public class Inheritance {

    public static void main(String[] args) {
        // Creating an instance of Fish and calling its methods
        Fish f1 = new Fish();
        f1.breathe();date
        f1.eat();
        f1.swims();

        // Creating an instance of Crow and calling its methods
        Crow crow = new Crow();
        crow.breathe();
        crow.eat();
        crow.flying();

        // Creating an instance of Parrot and calling its methods
        Parrot parrot = new Parrot();
        parrot.breathe();
        parrot.eat();
        parrot.flying();

        // Creating an instance of Sharks and calling its methods
        Sharks shark = new Sharks();
        shark.breathe();
        shark.eat();
        shark.swims();

        // Creating an instance of Dolphin and calling its methods
        Dolphin dolphin = new Dolphin();
        dolphin.breathe();
        dolphin.eat();
        dolphin.swims();
    }
}

/**
 * The Animal class represents the base class for all animals.
 * It provides basic attributes and methods common to all animals.
 */
class Animal {
    String color;

    /**
     * This method simulates the eating behavior of an animal.
     */
    void eat() {
        System.out.println("eats");
    }

    /**
     * This method simulates the breathing behavior of an animal.
     */
    void breathe() {
        System.out.println("Breath");
    }
}

/**
 * The Mammal class represents a subclass of Animal that can walk.
 */
class Mammal extends Animal {
    /**
     * This method simulates the walking behavior of a mammal.
     */
    void walks() {
        System.out.println("Walks");
    }
}

/**
 * The Bird class represents a subclass of Animal that can fly.
 */
class Bird extends Animal {
    /**
     * This method simulates the flying behavior of a bird.
     */
    void flying() {
        System.out.println("Flying");
    }
}

/**
 * The Crow class represents a specific bird species.
 */
class Crow extends Bird {
    /**
     * Constructor for Crow class. Prints the color of the crow.
     */
    Crow() {
        System.out.println("Crow's color is black");
    }
}

/**
 * The Parrot class represents a specific bird species.
 */
class Parrot extends Bird {
    /**
     * Constructor for Parrot class. Prints the color of the parrot.
     */
    Parrot() {
        System.out.println("Parrot's color is green");
    }
}

/**
 * The Fish class represents a subclass of Animal that can swim.
 */
class Fish extends Animal {
    /**
     * This method simulates the swimming behavior of a fish.
     */
    void swims() {
        System.out.println("Swims");
    }
}

/**
 * The Sharks class represents a specific fish species.
 */
class Sharks extends Fish {
    /**
     * Constructor for Sharks class. Prints the eating habit of sharks.
     */
    Sharks() {
        System.out.println("Shark eats meat");
    }
}

/**
 * The Dolphin class represents a specific fish species.
 */
class Dolphin extends Fish {
    /**
     * Constructor for Dolphin class. Prints a characteristic of dolphins.
     */
    Dolphin() {
        System.out.println("Dolphin is friendly with people");
    }
}
