package java_study;

class A19 {
    public void fn() {
        System.out.println("A");
    }
}
class B19 extends A19 {
    public void fn() {
        System.out.println("B");
    }
}
public class _19_Overriding {
    public static void main(String[] args) {
        A19 a = new B19();
        a.fn();
    }
}
