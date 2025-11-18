import java.util.Scanner;

class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter any number: ");
        int num = sc.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("Your number is Even");
        } else {
            System.out.println("Your number is Odd");
        }
        
        sc.close();
    }
}

