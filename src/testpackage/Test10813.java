package testpackage;

import java.io.*;
import java.util.StringTokenizer;

public class Test10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = i+1;
        }
        for(int j=0; j<m; j++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st2.nextToken())-1;
            int end = Integer.parseInt(st2.nextToken())-1;
            int change = arr[start];
            int change2 = arr[end];
            arr[start]=change2;
            arr[end]=change;
        }
        for (int i=0;i<n; i++){
            bw.write(String.valueOf(arr[i])+" ");
        }
        bw.flush();
    }
}
