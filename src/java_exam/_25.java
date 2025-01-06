package java_exam;

public class _25 {
    public static void main(String[] args) {
        String str1 = "soojebi";
        String str2 = "soojebi";
        String str3 = new String("soojebi");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));
    }
}
