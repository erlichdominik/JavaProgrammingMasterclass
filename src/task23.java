import java.lang.String;

public class task23 {
    public static void main(String[] args) {
        numberToWords(332);
        System.out.println(reverse(145));

    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.print("Invalid Value");
        }
        int lastDigit;
        while (number > 0) {
            lastDigit = number % 10;
            switch (lastDigit) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                break;
            }
            number /= 10;
        }
    }

    public static int reverse(int number) {
        number = Math.abs(number);
        char[] charNumber = new char[getDigitCount(number)];
        int n = 0;
        while (number > 0) {
            charNumber[n] = (char) (number % 10 + '0');
            number /= 10;
            n++;
        }
        return Integer.parseInt(new String(charNumber));
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        String stringNumber = Integer.toString(number);
        return (int) stringNumber.length();
    }

}
