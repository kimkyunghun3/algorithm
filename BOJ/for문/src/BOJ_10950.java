/*
 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class BOJ_10950 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int T, i, a=0, b = 0;
        T = scanner.nextInt();
        for(i=0;i<T;i++){
            a =scanner.nextInt();
            b= scanner.nextInt();
            System.out.println(a+b);
        }

    }
}
