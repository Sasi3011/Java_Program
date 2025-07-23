import java.util.Scanner;

public class ReportCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter Score: ");
        double score = scanner.nextDouble();
        Student student = new Student(studentId, studentName, score);
        student.display();
        if (student.isPassed()) {
            System.out.println("Result: Passed");
        } else {
            System.out.println("Result: Failed");
        }
        
        scanner.close();
    }
    
}
