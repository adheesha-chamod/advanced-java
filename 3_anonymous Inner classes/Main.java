class Book {
    public void read() {
        System.out.println("Reading a book");
    }
}

interface Greeting {
    void sayHello();
}

abstract class Animal {
    abstract public void makeSound();
}

public class Main {
    public static void main(String[] args) {
        Book novel = new Book() {
            // anonymous inner class
            @Override   // adding this annotation is not mandatory
            public void read() {
                System.out.println("Reading a novel");
            }
        };
        novel.read();

        /**
         * here we are not creating instance of Greeting class
         * we can't do that, since it is an interface
         * what happens is, we are creating an object of anonymus inner class
         * same for abstract classes as well
         */
        Greeting helloGreet = new Greeting() {
            // anonymous inner class
            @Override
            public void sayHello() {
                System.out.println("Hello, World!");
            }
        };
        helloGreet.sayHello();

        Animal dog = new Animal() {
            // anonymous inner class
            @Override
            public void makeSound() {
                System.out.println("Barking");
            }
        };
        dog.makeSound();
    }
}