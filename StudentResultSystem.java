import java.util.Scanner;

public class StudentResultSystem {

    // Method to validate marks
    static boolean isValidMarks(int marks) {
        return marks >= 0 && marks <= 100;
    }

    // Method to calculate grade
    static char calculateGrade(int marks) {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 75) {
            return 'B';
        } else if (marks >= 60) {
            return 'C';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter student marks (0 - 100): ");
            int marks = sc.nextInt();

            // Validation
            if (!isValidMarks(marks)) {
                System.out.println("Invalid marks! Please enter between 0 and 100.");
                continue;   // skip and ask again
            }

            // Percentage
            double percentage = marks;

            // Grade
            char grade = calculateGrade(marks);

            // Result summary
            System.out.println("----- Student Result -----");
            System.out.println("Marks      : " + marks);
            System.out.println("Percentage : " + percentage + "%");
            System.out.println("Grade      : " + grade);

            // Continue or stop
            System.out.print("Do you want to enter another student? (yes/no): ");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("no")) {
                break;   // exit loop
            }
        }

        sc.close();
        System.out.println("Program Ended.");
    }
}