public class video57 {
    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(47));
    }

    public static double calcFeetAndInchesToCentimeters(int inches, int feet) {
        if (inches < 0 || (feet > 12 && feet < 0)) {
            return -1;
        }
        return (inches * 2.54 + feet * 30.48);
        // 1 inch = 2.54 cm
        // 1 feet = 30.48 cm
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches < 0) {
            return -1;
        }
        // inches / 12 => foot
        // inches % 12 => inches left
        return calcFeetAndInchesToCentimeters(inches % 12, inches / 12);
    }

}