package java_study;
// 초깃값이 없는 경우1 : 자료형 [][]배열명 = new 자료형[행의 개수][열의 개수];
// 초기값이 없는 경우2 : 자료형 배열명[][] = new 자료형[행의 개수][열의 개수];
// 초기값이 있는 경우  : 자료형 [][]배열명 = {{초깃값}, {초깃값}, ...};
public class _06_TwoDimArray {
    public static void main(String[] args) {
        int [][] a = new int[3][2];
        System.out.println(a.length);
        System.out.println(a[0].length);

        System.out.println("----------");

        int [][] b = {{1, 2}, {3}, {4, 5, 6}};
        System.out.println(b.length);
        System.out.println(b[0].length);
        System.out.println(b[1].length);
        System.out.println(b[2].length);
    }
}
