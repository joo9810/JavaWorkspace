package java_study;

class A18 {
    public void fn() {
        System.out.println("A");
    }
    public void fn(int i) {
        System.out.println(i);
    }
    public void fn(double d) {
        System.out.println(d);
    }
    public int fn(int a, int b) {
        return a + b;
    }
}
public class _18_Overloading {
    public static void main(String[] args) {
        A18 a = new A18();
        a.fn();
        a.fn(7);
        a.fn(10.0);
        System.out.println(a.fn(2, 3));
    }
}
