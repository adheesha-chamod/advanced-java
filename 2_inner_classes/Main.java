class Outer {
    private String message = "Hello from inner class";
    private static String staticMessage = "Hello from static method in static inner class";

    public void displayOuter() {
        System.out.println("Hello from outer class");
    }

    // inner class
    class Inner {
        public void displayInner() {
            System.out.println(message);    // can access private member in outer class
        }
    }

    // static inner class
    static class StaticInner {
        public void displayStaticInner() {
            // System.out.println(message); // error: cannot access non-static member of outer class
            System.out.println("Hello from static inner class");
        }

        public static void displayStaticInnerStaticMethod() {
            System.out.println(staticMessage);  // accessing static member of Outer
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer outerObj = new Outer();
        outerObj.displayOuter();

        Outer.Inner innerObj = outerObj.new Inner();
        innerObj.displayInner();

        Outer.StaticInner staticInnerObj = new Outer.StaticInner();
        staticInnerObj.displayStaticInner();

        Outer.StaticInner.displayStaticInnerStaticMethod(); // calling static method directly
    }
}
