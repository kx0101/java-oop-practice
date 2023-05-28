public interface MyInterface {
    void publicMethod();

    default void defaultMethod() {
        // Call private method within the interface
        privateMethod();
    }

    private void privateMethod() {
        System.out.println("Private method implementation");
    }
}

public class MyClass implements MyInterface {
    @Override
    public void publicMethod() {
        System.out.println("Public method implementation");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();

        myObject.publicMethod();  // Outputs: Public method implementation
        myObject.defaultMethod(); // Outputs: Private method implementation
    }
}
