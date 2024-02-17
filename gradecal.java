import java.util.Scanner;

public class GradeCal{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the student's name
        System.out.println("Enter the student's name: ");
        String name = input.nextLine();

        // Get the student's marks
        System.out.println("Enter the student's marks for each subject: ");
        int[] marks = new int[5];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
        }

        // Calculate the total marks
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        // Calculate the percentage
        float percentage = (float) totalMarks / marks.length;

        // Assign a grade
        String grade;
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else if (percentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Print the results
        System.out.println("Student name: " + name);
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
    }
}