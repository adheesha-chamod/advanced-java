@FunctionalInterface    // adding this not mandatory -> but best practice
interface Greeting {
    void greet();
}

class HelloGreeting implements Greeting {
    @Override   // adding this not mandatory -> but best practice
    public void greet() {
        System.out.println("Hello...!");
    }
    
}

public class Main {
    public static void main(String[] args) {
        Greeting hello = new HelloGreeting();
        hello.greet();
    }
}