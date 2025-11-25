import java.util.Scanner;

class DayOfWeek {
    public static void main(String[] args) {
        Scanner man = new Scanner(System.in);
        
        System.out.print("Please enter a number (1-7): ");
        int day = man.nextInt();
        
        if (day == 1) {
            System.out.println("Friday");
        } else if (day == 2) {
            System.out.println("Saturday");
        } else if (day == 3) {
            System.out.println("Sunday");
        } else if (day == 4) {
            System.out.println("Monday");
        } else if (day == 5) {
            System.out.println("Tuesday");
        } else if (day == 6) {
            System.out.println("Wednesday");
        } else if (day == 7) {
            System.out.println("Thursday");
        } else {
            System.out.println("No such day");
        }
        
    }
}

