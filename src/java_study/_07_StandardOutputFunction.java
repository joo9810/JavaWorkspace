package java_study;
// System.out.print();   : 개행을 하지 않는 출력함수
// System.out.println(); : 개행을 하는 출력함수
// System.out.printf();  : C 언어처럼 변수를 출력할 수 있는 출력 함수
public class _07_StandardOutputFunction {
    public static void main(String[] args) {
        int a = 100;
        System.out.print("Hello\n");
        System.out.println("Hello");
        System.out.printf("%d", a);
    }
}
