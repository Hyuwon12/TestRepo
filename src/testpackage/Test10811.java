package testpackage;

import javax.management.StringValueExp;
import java.io.*;
import java.util.StringTokenizer;

public class Test10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=i+1;
        }
        for (int i=0;i<m;i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken()) - 1;
            while (start < end) {
                int temp = arr[start];
                arr[start++] = arr[end];
                arr[end--] = temp;
            }
        }
        br.close();
        for (int i=0;i<n;i++){
            bw.write(String.valueOf(arr[i]+" "));
        }
        bw.flush();
    }
}

