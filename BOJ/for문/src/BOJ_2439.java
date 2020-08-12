/*
 뒤집어서 별찍기 프로그램
 */
import java.util.Scanner;

public class BOJ_2439 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int T;
        T = scanner.nextInt();
        for(int i=1;i<=T;i++){
            for(int j=T;j>0;j--){
                if(i<j){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
