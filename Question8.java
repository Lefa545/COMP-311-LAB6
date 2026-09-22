// Superclass
class Animal {
    public void speak() {
        System.out.println("The animal makes a generic sound.");
    }
}

// Subclass overriding superclass behavior
class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("Meow! Meow!");
    }
}

public class Question8 {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Cat myCat = new Cat();

        genericAnimal.speak(); // Executes base class implementation
        myCat.speak();         // Executes overridden subclass implementation
    }
}
