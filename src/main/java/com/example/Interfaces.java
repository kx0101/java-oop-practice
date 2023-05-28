public interface Animal {
    void sound();
}

public class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Woof!");
    }
}

public class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound(); // Outputs: Woof!
        cat.sound(); // Outputs: Meow!
    }
}
