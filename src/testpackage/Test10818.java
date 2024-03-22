package testpackage;

import java.io.*;
import java.util.StringTokenizer;

public class Test10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int max=0;
        int min=1000000;
        for (int i=0;i<n;i++){
            if(arr[i]<=min){
                min=arr[i];
            }
            if (arr[i]>=max){
                max=arr[i];
            }
        }
        bw.write(String.valueOf(min)+" "+String.valueOf(max));
        bw.flush();
    }
}
