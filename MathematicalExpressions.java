import java.util.Scanner;

public class MathematicalExpressions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        System.out.print("Enter d: ");
        double d = sc.nextDouble();
        
        double e1 = ((a + b) * (c * a + (a * a)) - b * b) / ((c + d) * (c - d));
        
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();
        System.out.print("Enter z: ");
        int z = sc.nextInt();
        
        int e2 = x + y % z * 5 - y;
        
        System.out.println("e1 = " + e1);
        System.out.println("e2 = " + e2);
        
    }
}

