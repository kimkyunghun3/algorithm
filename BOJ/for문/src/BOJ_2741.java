/*
 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 */
import java.util.Scanner;

public class BOJ_2741 {
    public static void main(String args[]){
        Scanner scanner =new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        for (int i=1; i<=a; i++){
            System.out.println(i);
        }
    }
}
