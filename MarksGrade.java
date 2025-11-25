import java.util.Scanner;

class MarksGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter marks: ");
        float marks = sc.nextFloat();
        
        String grade;
        if (marks >= 81 && marks <= 100) {
            grade = "A";
        } else if (marks >= 66 && marks <= 80) {
            grade = "B";
        } else if (marks >= 50 && marks <= 65) {
            grade = "C";
        } else if (marks < 50) {
            grade = "F";
        } else {
            grade = "Invalid (marks should be between 0-100)";
        }
        
        System.out.println("Grade: " + grade);
        
    }
}

