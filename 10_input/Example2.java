import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Example2 {
    
    public static void main(String[] args) {
        // System.out.print("Enter a number: ");

        // try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
        //     int n = Integer.parseInt(bf.readLine());
        //     System.out.println("Entered number: " + n);

        // } catch (NumberFormatException e) {
        //     e.printStackTrace();

        // } catch (IOException e) {
        //     e.printStackTrace();
        // }


        // using 'Scanner' -> better than BufferedReader

        System.out.print("Enter a number: ");

        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            System.out.println("Entered number: " + n);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}