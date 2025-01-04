package java_study;
// 리터럴을 이용한 방식은 String 변수에 문자열 리터럴을 저장한 주소를 대입하는 방식
// 리터럴 문자열은 문자열 풀에 저장되고, 같은 리터럴을 사용하는 변수는 같은 문자열 풀을 가리킴
// new를 이용한 방식은 문자열 인스턴스를 생성하여 String 변수에 주소값을 대입하는 방식
// String 인스턴스는 힙(Heap)에 저장되고, 변수는 힙에 저장된 인스턴스의 주소를 대입
public class _09_String {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        String d = new String("abc");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
