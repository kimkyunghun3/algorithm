
/*
 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */
import java.util.Scanner;

public class BOJ_11021 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int T, a, b;
        T = scanner.nextInt();
        for(int i=1;i<=T;i++){
            a = scanner.nextInt();
            b = scanner.nextInt();
            int c = a+b;
            System.out.println("Case"+ " #"+i+": "+ c);
        }
    }
}
