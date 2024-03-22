package testpackage;

import java.io.*;
import java.util.StringTokenizer;

public class Test10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++){
            int v = Integer.parseInt(st.nextToken());
            arr[i] = v;
        }
        int v= Integer.parseInt(br.readLine());
        int count =0;
        for (int i=0; i<arr.length; i++){
            if(arr[i]==v){
                count++;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
    }
}
