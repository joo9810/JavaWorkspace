package java_study;
// static 메서드는 클래스가 메모리에 올라갈 때 자동적으로 생성되는 메서드
// 인스턴스를 생성하지 않아도 호출이 가능함
// 인스턴스 : 클래스로부터 만들어진 객체
class StaticMethod {
    static void print(){
        System.out.println("static method");
    }
}
public class _14_StaticMethod {
    public static void main(String[] args) {
        StaticMethod.print();
    }
}
