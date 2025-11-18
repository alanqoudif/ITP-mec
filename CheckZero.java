import java.util.Scanner;

class CheckZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter any number: ");
        int num = sc.nextInt();
        
        if (num == 0) {
            System.out.println("You are entering a number Zero");
        }
        
    }
}

