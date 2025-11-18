import java.util.Scanner;

class UserInfoCollector {
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
            System.out.println("oh! so I know all your info 😈");
        }

        System.out.print("Enter a character: ");
        String charInput = sc.next();
        if (!charInput.isEmpty()) {
            char ch = charInput.charAt(0);
            System.out.println("The character is: " + ch);
        } else {
            System.out.println("No character was entered.");
        }

        sc.close();
    }
}

