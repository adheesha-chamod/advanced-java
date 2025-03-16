class A {
    public void myMethod() {
        System.out.println("myMethod() in class A");
    }
}

class B extends A {
    @Override
    public void myMethod() {
        System.out.println("myMethod() in class B");
    }
}

public class Main {
    public static void main(String[] args) {
        A b = new B();
        b.myMethod();
    }
}