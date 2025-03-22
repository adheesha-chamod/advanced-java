class MyMath {
    public int divide(int n1, int n2) throws ArithmeticException {
        return n1 / n2;
    }

    public int getNumber(int[] arr, int index) throws ArrayIndexOutOfBoundsException {
        return arr[index];
    }
}

public class Example4 {
    public static void main(String[] args) {
        try {
            MyMath math = new MyMath();

            // math.divide(10,  0);
            
            int[] ar = {10, 20, 30};
            System.out.println(math.getNumber(ar, 100));

        } catch (ArithmeticException ex) {
            System.out.println("Dividing by zero");

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Invalid index");

        } catch (Exception ex) {
            System.out.println("Unexpected exception");

            // print stack trace
            ex.printStackTrace();
        }
    }
}
