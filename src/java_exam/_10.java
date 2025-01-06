package java_exam;
class Parent10 {
    public int compute (int num) {
        if (num <= 1) return num;
        return compute(num-1) + compute(num-2);
    }
}
class Child10 extends Parent10 {
    public int compute (int num) {
        if (num <= 1) return num;
        return compute(num-1) + compute(num-3);
    }
}
public class _10 {
    public static void main(String[] args) {
        Parent10 obj = new Child10();
        System.out.print(obj.compute(4));
    }
}
