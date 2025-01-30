import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();
        
        System.out.println("Enter student grades (enter a negative number to stop):");
        
        while (true) {
            System.out.print("Enter grade: ");
            int grade = scanner.nextInt();
            
            // Exit loop if user enters a negative number
            if (grade < 0) {
                break;
            }
            
            grades.add(grade);
        }
        
        // Check if there are grades entered
        if (grades.size() == 0) {
            System.out.println("No grades were entered.");
            return;
        }
        
        // Calculate average, highest, and lowest scores
        int total = 0;
        int highest = grades.get(0);
        int lowest = grades.get(0);
        
        for (int grade : grades) {
            total += grade;
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }
        
        double average = total / (double) grades.size();
        
        // Display results
        System.out.println("\nResults:");
        System.out.println("Total grades entered: " + grades.size());
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.println("Average score: " + average);
    }
}
