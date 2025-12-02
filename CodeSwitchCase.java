import java.util.Scanner;

class CodeSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter code: ");
        String code = sc.next();
        
        switch (code) {
            case "MEC":
                System.out.println("Middle East College");
                break;
            case "ITP":
                System.out.println("Introduction to Programming");
                break;
            case "PoP":
                System.out.println("Principles of Programming");
                break;
            default:
                System.out.println("No Such code");
                break;
        }
        
    }
}

