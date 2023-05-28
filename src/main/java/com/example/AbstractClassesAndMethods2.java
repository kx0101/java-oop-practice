abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

abstract class Mammal extends Animal {
    protected int numberOfLegs;

    public Mammal(String name, int numberOfLegs) {
        super(name);
        this.numberOfLegs = numberOfLegs;
    }

    public abstract void run();
}

class Dog extends Mammal {
    public Dog(String name) {
        super(name, 4);
    }

    public void makeSound() {
        System.out.println(name + " is barking.");
    }

    public void run() {
        System.out.println(name + " is running.");
    }
}

class Cat extends Mammal {
    public Cat(String name) {
        super(name, 4);
    }

    public void makeSound() {
        System.out.println(name + " is meowing.");
    }

    public void run() {
        System.out.println(name + " is running.");
    }
}

class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println(name + " is chirping.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");
        Bird bird = new Bird("Tweety");

        dog.makeSound();
        dog.eat();
        dog.run();

        cat.makeSound();
        cat.eat();
        cat.run();

        bird.makeSound();
        bird.eat();
    }
}
