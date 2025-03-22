class A extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
        }
    }
}

public class Example2 {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();

        System.out.println("objA priority: " + objA.getPriority());
        System.out.println("objB priority: " + objB.getPriority());

        objA.setPriority(Thread.MAX_PRIORITY);
        objB.setPriority(Thread.MIN_PRIORITY);

        System.out.println("objA priority after changing: " + objA.getPriority());
        System.out.println("objB priority after changing: " + objB.getPriority());

        objA.start();
        objB.start();
    }   
}
