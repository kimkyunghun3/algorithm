/*
 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class BOJ_2753 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        if (a%4 ==0) {
            if (a % 100 != 0 || a % 400 == 0) {
                System.out.println("1");
            } else
                System.out.println("0");
        }
        else
            System.out.println("0");
    }
}
