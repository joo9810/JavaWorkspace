package java_exam;

public class _28 {
    public static void main(String[] args) {
        int sum = fact(7);
        System.out.println(sum);
    }
    public static int fact(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * fact(n-1);
        }
    }
}
