import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

class demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        BigDecimal a = sc.nextBigDecimal();
        System.out.print("Enter b: ");
        BigDecimal b = sc.nextBigDecimal();
        System.out.print("Enter c: ");
        BigDecimal c = sc.nextBigDecimal();
        BigDecimal sum = a.add(b).add(c);
        BigDecimal average = sum.divide(new BigDecimal("3"), 10, RoundingMode.HALF_UP);
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);

        sc.close();

    }
}
