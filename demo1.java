import java.util.Scanner;

class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Gender: ");
        String gender = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.print("Place: ");
        String place = sc.nextLine();

        System.out.println("\nName: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Place: " + place);

        if (!name.isEmpty() && !gender.isEmpty() && !place.isEmpty() && age > 0) {
            System.out.println("All info received!");
        }

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println("The character is: " + ch);

        sc.close();
    }
}