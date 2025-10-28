import java.util.Scanner;

class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of chapters: ");
        int chapters = sc.nextInt();

        double rialprice = 0.300 * chapters;

        System.out.println("The cost is: " + rialprice);

    }
}