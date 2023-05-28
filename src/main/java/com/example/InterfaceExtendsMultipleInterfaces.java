public interface Canine {
    void bark();
}

public interface Animal {
    void eat();
    void sleep();
}

public interface Pet extends Animal, Canine {
    void play();
}

public class Dog implements Pet {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();    // Outputs: Dog is eating
        dog.sleep();  // Outputs: Dog is sleeping
        dog.bark();   // Outputs: Dog is barking
        dog.play();   // Outputs: Dog is playing
    }
}
