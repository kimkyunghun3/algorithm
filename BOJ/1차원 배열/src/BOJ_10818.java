/*
 N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class BOJ_10818 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int NumberCount;
        int Max =-1000001, Min= 1000001;
        NumberCount = scanner.nextInt();
        int[] numbers = new int[NumberCount];
        for(int i=0; i<NumberCount;i++){
            numbers[i] = scanner.nextInt();
            if(numbers[i] >Max)
                Max = numbers[i];
            if(numbers[i]<Min)
                Min = numbers[i];
        }
        System.out.println(Min + " "+ Max);


    }
}
