public class task1 {
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(10.25));
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return Math.round(kilometersPerHour / 1.609);
        }

    }
}