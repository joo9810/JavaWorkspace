package java_exam;
class Person29 {
    private static String name;
    public Person29(String val) {
        name = val;
    }
    public static String get() {
        return name;
    }
    public void print() {
        System.out.println(name);
    }
}
public class _29 {
    public static void main(String[] args) {
        Person29 p = new Person29("soojebi");
        p.print();
    }
}
