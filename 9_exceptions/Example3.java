class MyCustomException extends Exception {
    MyCustomException() {
        super("Bussiness logic exception");
    }

    MyCustomException(String message) {
        super(message);
    }
}

public class Example3 {
    public static void main(String[] args) {
        System.out.println("Start execution...");

        int i = 10;
        int j = 20;
        int ans = 0;

        try {
            ans = i / j;

            if (ans == 0) {
                // throw new MyCustomException();
                throw new MyCustomException("Result cannot be zero");
            }
        } catch (MyCustomException ex) {
            System.out.println(ex.getMessage());
        } catch (ArithmeticException ex) {
            System.out.println("Invalid arithmatic operator: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Unexpected error: " + ex);
        }

        System.out.println("End execution...");
    }
}
