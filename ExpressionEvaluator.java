import java.util.Scanner;

class ExpressionEvaluator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter value for a 🤓: ");
        int a = sc.nextInt();
        System.out.print("Enter value for b 🥸: ");
        int b = sc.nextInt();
        System.out.print("Enter value for c 🤔: ");
        int c = sc.nextInt();
        
        int exp1 = (a + b) * c;
        boolean exp2 = (b < c) || (b < a);
        boolean exp3 = !(a < c) || (a < b);
        
        System.out.println("Maaan u know that exp1 is = " + exp1);
        System.out.println("Maaan u know that exp2 is = " + exp2);
        System.out.println("Maaan u know that exp3 is = " + exp3);
        System.out.println("SeeU next time🥲 Bye Bye");
        
    }
}

