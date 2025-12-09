import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of integers, n
        System.out.print("Enter the number of integers (n): ");
        int n = sc.nextInt();
        
        // Initialize sum to 0
        int sum = 0;
        
        // Use for loop to read n integers
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sum += num;
        }
        
        // Calculate and display the average
        double average = (double) sum / n;
        System.out.println("Average: " + average);
        
        sc.close();
    }
}
