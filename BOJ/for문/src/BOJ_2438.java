/*
 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 */
import java.util.Scanner;

public class BOJ_2438 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N;
        N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
