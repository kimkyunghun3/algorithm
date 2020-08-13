/*
 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
 */
import java.util.Scanner;

public class BOJ_2562 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int input[] = new int[10];
        int Max =0;
        int index = 0;
        for(int i=1; i<=9;i++){
            input[i] = scanner.nextInt();
            if (Max < input[i]) {
                Max = input[i];
                index = i;
            }
        }
        System.out.println(Max);
        System.out.println(index);
    }
}
