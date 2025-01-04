package java_study;
class A21 {
    public void fn() {
        System.out.println("A");
    }
}
class B21 extends A21 {
    public void fn(){
        super.fn();
        System.out.println("B");
    }
}
public class _21_SuperClass {
    public static void main(String[] args) {
        A21 a = new B21();
        a.fn();
    }
}
