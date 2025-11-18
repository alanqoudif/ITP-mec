import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        // create scanner to read input from user
        Scanner sc = new Scanner(System.in);
        
        // read values for e1 calculation (all are double)
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        System.out.print("Enter d: ");
        double d = sc.nextDouble();
        
        // calculate e1 = ((a + b) * (c * a + (a * a)) - b * b) / ((c + d) * (c - d))
        double e1 = ((a + b) * (c * a + (a * a)) - b * b) / ((c + d) * (c - d));
        
        // read values for e2 calculation (all are int)
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();
        System.out.print("Enter z: ");
        int z = sc.nextInt();
        
        // calculate e2 = x + y % z * 5 - y
        int e2 = x + y % z * 5 - y;
        
        // display the results
        System.out.println("e1 = " + e1);
        System.out.println("e2 = " + e2);
        
        // close scanner
        sc.close();
    }
}
