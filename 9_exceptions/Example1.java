public class Example1 {
    public static void main(String[] args) {
        System.out.println("Start execution...");

        int i = 10;
        int j = 0;
        int ans = 0;

        int[] arr = new int[5];

        String str = null;

        try {
            // ans = i / j;

            // System.out.println(arr[100]);

            System.out.println(str.length());

        } catch (ArithmeticException ex) {
            System.out.println("Invalid arithmatic operator: " + ex.getMessage());
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array index exceeded: " + ex.getMessage());
        } catch (Exception ex) {    // best practice to add this at the end, in case something goes wrong unexpectedly
            System.out.println("Unexpected error: " + ex);
        }
        
        System.out.println("End execution...");
    }    
}
