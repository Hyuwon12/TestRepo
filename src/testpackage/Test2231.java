package testpackage;

import java.io.*;

public class Test2231 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException{
        T2231();
    }
    public static void T2231() throws IOException{
        String n1 = (br.readLine());
        int n = Integer.parseInt(n1);
        int result=0;
        for(int i = 0; i < n; i++) {
            int number = i;
            int sum = 0;	// 각 자릿수 합 변수

            while(number != 0) {
                sum += number % 10;	// 각 자릿수 더하기
                number /= 10;
            }

            // i 값과 각 자릿수 누적합이 같을 경우 (생성자를 찾았을 경우)
            if(sum + i == n) {
                result = i;
                break;
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}
