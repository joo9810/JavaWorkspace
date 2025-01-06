package java_exam;
class Parent26 {
    int x = 100;
    Parent26() {
        this(500);
    }
    Parent26(int x) {
        this.x = x;
    }
    int getX() {
        return x;
    }
}
class Child26 extends Parent26 {
    int x = 4000;
    Child26() {
        this(5000);
    }
    Child26(int x) {
        this.x = x;
    }
}

public class _26 {
    public static void main(String[] args) {
        Child26 obj = new Child26();
        System.out.println(obj.getX());
    }
}
