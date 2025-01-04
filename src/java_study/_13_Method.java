package java_study;
// 메서드(사용자 정의 함수)는 사용자가 직접 새로운 함수를 정의하여 사용하는 방법
// 메서드에서 매개변수나 생성된 변수는 메서드가 종료되면 없어짐
public class _13_Method {
    static char fn(int num) {
        if (num % 2 == 0) {
            return 'Y';
        } else {
            return 'N';
        }
    }
    public static void main(String[] args) {
        char a = fn(5);
        System.out.println(a);
    }
}
