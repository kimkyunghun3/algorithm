/*
 점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오
 */

import java.util.Scanner;

public class BOJ_14681 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a,b;
        a = scanner.nextInt();
        b = scanner.nextInt();

        if (a>0 && b>0){
            System.out.println("1");
        }
        else if(a>0 && b<0){
            System.out.println("4");
        }
        else if(a<0 && b>0){
            System.out.println("2");
        }
        else if(a<0 && b<0){
            System.out.println("3");
        }
    }
}
