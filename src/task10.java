public class task10 {
    public static void main(String[] args) {

    }

    public static void printEqual(int a, int b, int c) {
        if ((a == 0 && b != 0 && c != 0) || (a != 0 && b == 0 && c != 0) || (a != 0 && b != 0 && c == 0)) {
            System.out.print("Invalid Value");
        }
    }
}