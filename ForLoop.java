import java.util.Scanner;

class ForLoop
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        
        for(int i = start; i <= 100; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println(i);
            }
        }
        
        sc.close();
    }
}