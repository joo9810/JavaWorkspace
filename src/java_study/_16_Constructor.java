package java_study;
// 생성자는 해당 클래스의 객체가 생성될 때 자동으로 호출되는 특수한 종류의 메서드
// 생성자는 일반적으로 클래스의 멤버 변수를 초기화하거나 클래스를 사용하는 데 필요한 설정이 필요한 경우 사용
// 생성자는 클래스 명과 동일한 메서드명을 가지고, 반환 값이 없음
// 생성자가 없을 경우 public 클래스명(){}이라는 아무 일도 하지 않는 생성자가 있는 것처럼 동작함
public class _16_Constructor {
    public _16_Constructor(){
        System.out.println("A");
    }
    public _16_Constructor(int a){
        System.out.println("B: "+a);
    }
    public void fn(){
        System.out.println("C");
    }
    public static void main(String[] args) {
        _16_Constructor s1 = new _16_Constructor();
        _16_Constructor s2 = new _16_Constructor(5);
        s1.fn();
    }
}
