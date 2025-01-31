import java.util.Scanner;

public class GPACalculator {

    public static double calculateGPA(int[] marks, int numSubjects) {
        double totalPoints = 0;

        for (int i = 0; i < numSubjects; i++) {
            int mark = marks[i];
            double gradePoint = 0;

            if (mark >= 90) {
                gradePoint = 10.0;
            } else if (mark >= 80) {
                gradePoint = 9.0;
            } else if (mark >= 70) {
                gradePoint = 8.0;
            } else if (mark >= 60) {
                gradePoint = 7.0;
            } else if (mark >= 50) {
                gradePoint = 6.0;
            } else if (mark >= 40) {
                gradePoint = 5.0;
            } else {
                gradePoint = 0.0;
            }

            totalPoints += gradePoint;
        }

        return totalPoints / numSubjects;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("GPA Calculator (Out of 10)");

        String[] subjects = {"Telugu", "Hindi", "English", "Maths", "Social"};
        int numSubjects = subjects.length;
        
        int[] marks = new int[numSubjects];
        
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for " + subjects[i] + ": ");
            marks[i] = scanner.nextInt();
        }

        double gpa = calculateGPA(marks, numSubjects);
        System.out.println("Your GPA is: " + gpa);

        scanner.close();
    }
}
