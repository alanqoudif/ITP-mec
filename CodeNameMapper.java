import java.util.Scanner;

class CodeNameMapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter code: ");
        String code = sc.next();
        
        if (code.equals("mec") || code.equals("MEC")) {
            System.out.println("middle east college");
        } else if (code.equals("ITP") || code.equals("itp")) {
            System.out.println("introduction to programming");
        } else if (code.equals("POP") || code.equals("pop")) {
            System.out.println("principles of programming");
        } else {
            System.out.println("no such name");
        }
        
        sc.close();
    }
}

