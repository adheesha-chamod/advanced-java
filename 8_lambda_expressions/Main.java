@FunctionalInterface
interface Greeting {
    void greet();
}

@FunctionalInterface
interface DisplayNumber {
    void display(int number);
}

@FunctionalInterface
interface Add {
    int add(int n1, int n2);
}

public class Main {
    public static void main(String[] args) {
        // Greeting hello = new Greeting() {
        //     public void greet() {
        //         System.out.println("Hello world!");
        //     }
        // };
        // hello.greet();

        // simplify above into this
        // Greeting hello = () -> {
        //     System.out.println("Hello world!");
        // };
        // hello.greet();

        // simplify above further into this
        Greeting hello = () -> System.out.println("Hello world!");
        hello.greet();

        //=======================================================================================

        // DisplayNumber number = new DisplayNumber() {
        //     public void display(int num) {
        //         System.out.println("Displaying number: " + num);
        //     }
        // };
        // number.display(1000);

        // simplify above into this
        // DisplayNumber number = (int num) -> System.out.println("Displaying number: " + num);
        // number.display(1000);

        // simplify above further into this
        DisplayNumber number = num -> System.out.println("Displaying number: " + num);
        number.display(1000);

        //=======================================================================================

        // Add result = new Add() {
        //     public int add(int n1, int n2) {
        //         return n1 + n2;
        //     }
        // };
        // System.out.println(result.add(10, 20));

        // simplify above into this
        // Add result = (n1, n2) -> {
        //     return n1 + n2;
        // };
        // System.out.println(result.add(10, 20));

        // simplify above further into this
        Add result = (n1, n2) -> n1 + n2;   // no need to add return
        System.out.println(result.add(10, 20));
    }
}