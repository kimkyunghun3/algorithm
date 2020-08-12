/*
 n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 */
import java.util.Scanner;

public class BOJ_8393 {
    public static void main(String args[]){
        Scanner scanner =new Scanner(System.in);
        int n, sum =0;
        n = scanner.nextInt();
        for(int i=1; i<=n;i++){
            sum +=i;
        }
        System.out.println(sum);
    }
}
