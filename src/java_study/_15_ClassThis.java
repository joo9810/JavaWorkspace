package java_study;
// this는 현재 객체를 가리키는 키워드
// 클래스 내부의 변수와 메서드를 가리킬 수 있음

// 클래스 접근 제어자 종류
// public    : 외부의 모든 클래스에서 접근 가능
// protected : 같은 패키지 내부에 있는 클래스, 하위 클래스(상속받은 경우)에서 접근 가능
//             자기 자신과 상속받은 하위 클래스 둘 다 접근 가능
// default   : 접근 제어자를 명시하지 않은 경우로 같은 패키지 내부에 있는 클래스에서 접근 가능
// private   : 같은 클래스 내에서만 접근 가능
public class _15_ClassThis {
    private int a;
    public void setA(int a) {
        this.a = a;
    }
    public int getA() {
        return a;
    }
    public static void main(String[] args) {
        _15_ClassThis s = new _15_ClassThis();
        s.setA(5);
        System.out.println(s.getA());
    }
}
