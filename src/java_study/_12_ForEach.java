package java_study;
// for each 문은 배열이나 리스트의 크기만큼 반복
// 반복할 때마다 배열이나 리스트의 항목을 순차적으로 변수에 대입하는 반복문
public class _12_ForEach {
    public static void main(String[] args) {
        String[] name = {"500", "JE", "BI"};
        for (String nm : name) {
            System.out.println(nm);
        }
    }
}
