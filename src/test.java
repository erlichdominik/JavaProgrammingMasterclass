import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter your name");
            String name = scanner.nextLine();
            int age = 2019 - yearOfBirth;
            if (age >= 0 && age <= 100) {
                System.out.println("correct");
            } else {
                System.out.println("Wrong age");
            }
        } else {
            System.out.println("Unable to parse int");
        }
    }
}