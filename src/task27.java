import java.util.Scanner;

public class task27 {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        int counter = 0;

        System.out.println("Enter a number: ");
        boolean hasNextInt = scanner.hasNextInt();

        while (scanner.hasNextInt()) {
            System.out.println("Enter a number: ");
            hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                number = scanner.nextInt();
                sum += number;
                counter++;
            }
        }

        System.out.println("SUM = " + sum + " AVG = " + Math.round(sum / counter));
    }
}