package java_exam;

public class _27 {
    public static void main(String[] args) {
        Parent27 c = new Child27();
        c.paint();
        c.draw();
    }
}
class Parent27 {
    public void paint() {
        System.out.print("A");
        draw();
    }
    public void draw() {
        System.out.print("B");
        draw();
    }
}
class Child27 extends Parent27 {
    public void paint() {
        super.draw();
        System.out.print("C");
        this.draw();
    }
    public void draw() {
        System.out.print("D");
    }
}

