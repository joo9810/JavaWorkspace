package java_exam;
class Parent {
    public void show() {
        System.out.println("Parent");
    }
}
class Child extends Parent {
    public void show() {
        System.out.println("Child");
    }
}
public class _03 {
    public static void main(String[] args) {
        Parent pa = new Child();
        pa.show();
    }
}
