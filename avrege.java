import java.util.Scanner;
class for_loop
{
    public static void main(String arg[])
    {
        int i, n, num;
        double average, sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter limit");
        n = sc.nextInt();

        for(i = 1; i <= n; i++)
        {
            System.out.println("Please enter integer " + i);
            num = sc.nextInt();
            sum = sum + num;
        }

        average = sum / n;
        System.out.println("Average is " + average);
    }
}