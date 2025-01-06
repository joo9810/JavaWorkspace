package java_exam;
class Car18 implements Runnable {
    int a;
    public void run() {
        System.out.println("run");
    }
}
public class _18 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Car18());
        t1.start();
    }
}
