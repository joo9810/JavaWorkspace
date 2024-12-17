package chap_05;

// 신발 사이즈는 250 부터 295 까지 5 단위로 증가
// 신발 사이즈 수는 총 10가지

// 사이즈 250 (재고 있음)
// 사이즈 255 (재고 있음)
// ...

public class _Quiz_05 {
    public static void main(String[] args) {
        int[] size = new int[10];

        for (int i = 0; i < size.length; i++) {
            size[i] = 250 + (i * 5);
        }

        for (int s : size) {
            System.out.println("사이즈 " + s + " (재고 있음)");
        }
    }
}
