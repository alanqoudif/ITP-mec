import java.util.Scanner;
import java.math.BigDecimal;

class ChapterCostCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of chapters: ");
        int chapters = sc.nextInt();

        BigDecimal pricePerChapter = new BigDecimal("0.300");
        BigDecimal rialprice = pricePerChapter.multiply(new BigDecimal(chapters));

        System.out.println("The cost is: " + rialprice);

        sc.close();
    }
}

