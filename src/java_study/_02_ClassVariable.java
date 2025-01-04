package java_study;
// 클래스 변수는 클래스 블록에 선언하는 변수
// 클래스 변수는 클래스가 시작되면 변수가 생성되고, 클래스가 종료되면 변수가 소멸
// 클래스 변수는 클래스 내에서 사용 가능
public class _02_ClassVariable {
    int a = 5;
    void fn() {
        a = a + 3;
    }
    public static void main(String[] args) {
        _02_ClassVariable s = new _02_ClassVariable();
        s.a = s.a + 5;
        s.fn();
        System.out.println(s.a);
    }
}
