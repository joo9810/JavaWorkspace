package java_study;
interface A23 {
    void fn();
}
class B23 implements A23 {
    public void fn() {
        System.out.print("B");
    }
}
class C23 implements A23 {
    public void fn() {
        System.out.print("C");
    }
}
public class _23_Interface {
    public static void main(String[] args) {
        A23 b = new B23();
        A23 c = new C23();
        b.fn();
        c.fn();
    }
}
