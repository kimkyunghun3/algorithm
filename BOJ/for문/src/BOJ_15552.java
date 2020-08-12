/*
 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다. (BufferedReader와 BufferedWriter를 사용)
 */

import java.io.*;

public class BOJ_15552 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        String array[];
        String str;
        for (int i = 1; i <= T; i++) {
            str = br.readLine();
            array = str.split(" ");
            int a = Integer.parseInt(array[0]);
            int b = Integer.parseInt(array[1]);
            bw.write(a + b + "\n");

        }
        bw.flush();
        bw.close();
    }
}
