package java_exam;
class A17 {
    int a;
    int b;
}
public class _17 {
    static void func1(A17 m) {
        m.a *= 10;
    }
    static void func2(A17 m) {
        m.a += m.b;
    }
    public static void main(String[] args) {
        A17 m = new A17();
        m.a = 100;
        func1(m);
        m.b = m.a;
        func2(m);
        System.out.printf("%d", m.a);
    }
}
