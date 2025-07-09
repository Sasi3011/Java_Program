import java.util.Scanner;
public class Input{
    public static void main(String[] args)
    {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Enter your roll number: ");
            String rollNo = scanner.nextLine();
            System.out.print("Enter your branch: ");
            String branch = scanner.nextLine();
            System.out.print("Enter your section: ");
        }
    }
}
