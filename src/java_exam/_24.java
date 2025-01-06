package java_exam;

public class _24 {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void Usort(int[] a, int len) {
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len-i-1; j++) {
                if (a[j] > a[j+1]) {
                    swap(a, j, j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] item = {5, 4, 9, 1, 3, 7};
        int nx = 6;
        Usort(item, nx);
        for (int data : item) {
            System.out.print(data + "");
        }
    }
}
