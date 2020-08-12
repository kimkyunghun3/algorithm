/*
 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
 */
import java.util.Scanner;

public class BOJ_10871 {
    public static void main(String args[]){
        Scanner scanner =new Scanner(System.in);
        int N, X, numbers;
        N = scanner.nextInt();
        X = scanner.nextInt();
        for(int i=1; i<=N;i++){
            numbers = scanner.nextInt();
            if (numbers <X){
                int sub =numbers;
                System.out.print(sub+" ");
            }
        }
    }
}
