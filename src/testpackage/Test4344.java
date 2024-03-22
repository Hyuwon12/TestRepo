package testpackage;

import java.io.*;
import java.util.StringTokenizer;

public class Test4344 {
    public static void main(String[] args) throws IOException {
        System.out.println("백준 4344");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int C = Integer.parseInt(br.readLine());
        for (int i=0; i<C; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[] arr = new int[N];
            double sum = 0;
            for (int j=0; j<N; j++){
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }
            double stack =0;
            for (int j=0; j<N; j++) {
                if (arr[j] > sum/N) {
                    stack++;
                }
            }
            double per = stack/N * 100;
            bw.write(String.format("%.3f",per));
            bw.newLine();
        }
        bw.flush();
    }
}
