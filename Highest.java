import java.util.Scanner;

public class Highest {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter number 🤓: ");
        num1 = sc.nextInt();
        
        System.out.println("Please enter number2 🥸: ");
        num2 = sc.nextInt();
        
        if (num1 < num2) {
            System.out.println("Your second number is greater than first number 🥱");
        } else {
            System.out.println("Your first number is greater than second number 🥱");
        }
        
        sc.close();
    }
}

