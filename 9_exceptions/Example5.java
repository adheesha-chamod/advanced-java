public class Example5 {
    public static void main(String[] args) {

        int i = 10;
        int j = 0;
        int ans = 0;

        try {
            ans = i / j;
        
        } catch (ArithmeticException ex) {
            System.out.println("Dividing by zero");
        
        } catch (Exception ex) {
            System.out.println("Unexpected exception");
        
        } finally {
            System.out.println("Finally...");   // always exected
        }

        System.out.println("Answer: " + ans);
    }
}
