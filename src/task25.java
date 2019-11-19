public class task25 {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(217));
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        int n = 2;
        while (number > 2) {
            while (number % n == 0) {
                number /= n;
            }
            n++;
        }
        return n - 1;
    }
}