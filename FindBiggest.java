import java.util.Scanner;

public class FindBiggest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number 🤓: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the second number 🥸: ");
        int num2 = sc.nextInt();
        
        int biggest;
        if (num1 > num2) {
            biggest = num1;
        } else {
            biggest = num2;
        }
        
        System.out.println("The biggest number is 🥱: " + biggest);
        
        sc.close();
    }
}

