package testpackage;

import java.io.*;
import java.util.StringTokenizer;

public class Test10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        int j=0;
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++){
            int a = Integer.parseInt(st2.nextToken());
            arr[i] = a;
        }
        for (int i=0; i<n; i++){
            if (arr[i] < x){
                arr2[j] = arr[i];
                j++;
            }
        }
        for (int i=0;i< arr2.length;i++){
            if(arr2[i]>=1) {
                bw.write(String.valueOf(arr2[i]) + " ");
            }
        }
        bw.flush();
    }
}