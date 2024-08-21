import java.util.Scanner;

public class IT24103320Lab4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input exam marks
        System.out.print("Please enter exam marks (out of 100): ");
        int examMarks = scanner.nextInt();

        // Validate exam marks
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid exam marks. Please enter a value between 0 and 100.");
            return;
        }

        // Input lab submission marks
        System.out.print("Please enter lab submission marks (out of 100): ");
        int labMarks = scanner.nextInt();

        // Validate lab submission marks
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid lab marks. Please enter a value between 0 and 100.");
            return;
        }

        // Input percentage for exam marks
        System.out.print("Please enter the percentage given for the exam: ");
        int examPercentage = scanner.nextInt();

        // Input percentage for lab marks
        System.out.print("Please enter the percentage given for the lab submission: ");
        int labPercentage = scanner.nextInt();

        // Validate that the total percentage is equal to 100
        if (examPercentage + labPercentage != 100) {
            System.out.println("Invalid input. The total percentage for exam and lab should add up to 100.");
            return;
        }

        // Calculate final marks
        double finalMarks = (examMarks * examPercentage / 100.0) + (labMarks * labPercentage / 100.0);

        // Display final marks
        System.out.println("The final marks are: " + finalMarks);

        scanner.close();
    }
}