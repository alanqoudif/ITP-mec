import java.util.Scanner;

class ItemCodeMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Display the menu
        System.out.println("Item Code\tItem Name");
        System.out.println("c, C\t\tCoffee");
        System.out.println("t, T\t\tTea");
        System.out.println("j, J\t\tJuice");
        System.out.println("l, L\t\tLaban");
        System.out.println("others\t\tNo such code");
        System.out.println();
        
        // Read item code from user
        System.out.print("Enter item code: ");
        String input = sc.next();
        char itemCode = input.charAt(0);
        
        // Display corresponding item name using switch statement
        switch (itemCode) {
            case 'c':
            case 'C':
                System.out.println("Coffee");
                break;
            case 't':
            case 'T':
                System.out.println("Tea");
                break;
            case 'j':
            case 'J':
                System.out.println("Juice");
                break;
            case 'l':
            case 'L':
                System.out.println("Laban");
                break;
            default:
                System.out.println("No such code");
                break;
        }
        
        sc.close();
    }
}

