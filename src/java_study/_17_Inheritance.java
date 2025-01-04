package java_study;

class A17 {
    public void fnA() {
        System.out.println("A");
    }
}
class B17 extends A17 {
    public void fnB() {
        System.out.println("B");
    }
}
public class _17_Inheritance {
    public static void main(String[] args) {
        B17 b = new B17();
        b.fnA();
        b.fnB();
    }
}
