/*
 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class BOJ_9498 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        if (a >= 90 && a <= 100) {
            System.out.println("A");
        } else if (a >= 80 && a < 90) {
            System.out.println("B");
        } else if (a >= 70 && a < 80) {
            System.out.println("C");
        } else if (a >= 60 && a < 70) {
            System.out.println("D");
        } else
            System.out.println("F");
    }
}
