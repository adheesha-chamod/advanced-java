import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example1 {
    
    public static void main(String[] args) {
        // System.out.print("Enter a number: ");

        // InputStreamReader reader = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(reader);

        // try {
        //     int n = Integer.parseInt(bf.readLine());
        //     System.out.println("Entered number: " + n);

        // } catch (NumberFormatException e) {
        //     e.printStackTrace();
        
        // } catch (IOException e) {
        //     e.printStackTrace();
        
        // } finally {
        //     try {
        //         if (bf != null) {
        //             bf.close();
        //         }
        //         if (reader != null) {
        //             reader.close();
        //         }
            
        //     } catch (IOException ex) {
        //         ex.printStackTrace();
        //     }
        // }


        // better way -> use try-with-resources (automatically close resources)
        System.out.print("Enter a number: ");

        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(bf.readLine());
            System.out.println("Entered number: " + n);

        } catch (NumberFormatException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}