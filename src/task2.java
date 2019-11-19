public class task2 {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 22));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay > 23 || hourOfDay < 0) {
            return false;
        }
        if ((hourOfDay < 8 || hourOfDay > 22) && barking == true) {
            return true;
        }
        return false;
    }
}