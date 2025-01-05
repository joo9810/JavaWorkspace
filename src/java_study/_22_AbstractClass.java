package java_study;
abstract class A22 {
    abstract void fn();
}
class B22 extends A22 {
    void fn() {
        System.out.print("B");
    }
}
class C22 extends A22 {
    void fn() {
        System.out.print("C");
    }
}
public class _22_AbstractClass {
    public static void main(String[] args) {
        A22 b = new B22();
        A22 c = new C22();
        b.fn();
        c.fn();
    }
}
