import org.graalvm.compiler.asm.amd64.AMD64Address.Scale;

public class task24 {
    public static void main(String[] args) {
        System.out.println(canPack(2, 2, 12));
    }

    // public static boolean test(int bigCount, int smallCount, int goal) {

    // }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int bigCountValue = bigCount * 5;
        System.out.println(bigCountValue);
        while (bigCountValue >= goal) {
            bigCountValue -= 5;
        }
        System.out.println(bigCountValue);
        if (bigCountValue + smallCount >= goal) {
            return true;
        }
        return false;
    }
}