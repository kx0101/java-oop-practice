class Animal {
    public void eat() {
        System.out.println("The animal is eating.");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("The dog is barking.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animalObj = new Animal();
        Dog dogObj = (Dog) animalObj; // Casting the Animal object to Dog type

        dogObj.bark(); // Runtime error: The object type Animal cannot be cast to Dog, resulting in a ClassCastException.
    }
}
