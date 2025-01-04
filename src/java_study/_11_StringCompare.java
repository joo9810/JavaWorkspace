package java_study;
// == 연산자는 문자열의 주소값을 비교하는 연산자
// equals 메서드는 문자열 자체를 비교하는 메서드
public class _11_StringCompare {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        String d = new String("abc");
        String e = a;
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == e);
        System.out.println(c == d);
        System.out.println(d == e);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(b.equals(e));
        System.out.println(c.equals(d));
        System.out.println(d.equals(e));
    }
}
