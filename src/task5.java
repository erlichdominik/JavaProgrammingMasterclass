public class task5 {
    public static void main(String[] args) {

    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        if ((int) (a * 1000) == (int) (b * 1000)) {
            return true;
        } else {
            return false;
        }
    }
}