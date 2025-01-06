package java_exam;
class class14 {
    static private class14 instance = null;
    private int count = 0;
    static public class14 get() {
        if (instance == null) {
            instance = new class14();
        }
        return instance;
    }
    public void count() {count++;}
    public int getCount() {return count;}
}
public class _14 {
    public static void main(String[] args) {
        class14 s1 = class14.get();
        s1.count();
        class14 s2 = class14.get();
        s2.count();
        class14 s3 = class14.get();
        s3.count();
        System.out.print(s1.getCount());
    }
}
