/*
 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */
import java.util.Scanner;

public class BOJ_10951 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()){
            int a,b;
            a =scanner.nextInt();
            b = scanner.nextInt();
            System.out.println(a+b);
        }
    }
}
