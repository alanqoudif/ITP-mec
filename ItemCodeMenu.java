import java.util.Scanner;

class ItemCodeMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       System.out.println("Item Code \t Item Name");
        System.out.println("c, C \t Coffee");
       System.out.println("t, T \t Tea");
        System.out.println("j, J \t Juice");
  System.out.println("l, L\t\tLaban");
       System.out.println("others \t No such code");
        
        System.out.print("Enter item code: ");
        char code = sc.next().charAt(0);

         switch (code) {
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
        }
        
        sc.close();
    }
}