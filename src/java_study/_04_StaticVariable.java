package java_study;
// static 변수는 변수 선언할 때 static이라는 키워드를 붙임
// static 변수는 프로그램이 시작되면 변수가 생성되고 프로그램이 종료되면 변수가 소멸
// static 변수는 프로그램 전체에서 사용 가능
class StaticVariable {
    static int count = 0;
}
public class _04_StaticVariable {
    public static void main(String[] args) {
        StaticVariable s = new StaticVariable();
        s.count++;
        System.out.println(s.count);
        s.count++;
        System.out.println(s.count);
    }
}

