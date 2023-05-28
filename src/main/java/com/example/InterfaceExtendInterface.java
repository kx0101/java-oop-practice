public interface Animal {
    void eat();
    void sleep();
}

public interface Mammal extends Animal {
    void run();
}

public class Dog implements Mammal {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    @Override
    public void run() {
        System.out.println("Dog is running");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Outputs: Dog is eating
        dog.sleep();  // Outputs: Dog is sleeping
        dog.run();  // Outputs: Dog is running
    }
}

// Extending Interfaces:
// When an interface extends another interface, it establishes a parent-child relationship between the interfaces.
// The child interface inherits the methods and constants from the parent interface.
// The child interface can add additional methods or constants specific to itself.
// A class that implements the child interface is required to provide implementations for all the methods declared in both the parent and child interfaces.

// Implementing Multiple Interfaces:
// When a class implements multiple interfaces, it means that the class is declaring that it will fulfill the contracts defined by those interfaces.
// Each interface specifies a set of methods that the class must implement.
// The interfaces are independent of each other and do not have a hierarchical relationship.
// The class must provide implementations for all the methods declared in each interface it implements.

// public interface Animal {
//     void eat();
//     void sleep();
// }
//
// public interface Mammal extends Animal {
//     void run();
// }
//
// public class Dog implements Mammal {
//     // Implementations of eat(), sleep(), and run() methods
// }

// public interface Animal {
//     void eat();
//     void sleep();
// }
//
// public interface Mammal {
//     void run();
// }
//
// public class Dog implements Mammal, Animal {
//     // Implementations of eat(), sleep(), and run() methods
// }

