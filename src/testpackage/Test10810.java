package testpackage;

import java.io.*;
import java.util.StringTokenizer;

public class Test10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for(int i=0;i<m;i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st2.nextToken());
            int end = Integer.parseInt(st2.nextToken());
            int num = Integer.parseInt(st2.nextToken());
            for (int j=start-1;j<end;j++){
                arr[j] =num;
            }
        }
        for (int i=0;i<n;i++){
            bw.write(String.valueOf(arr[i])+" ");
            bw.flush();
        }
    }
}
