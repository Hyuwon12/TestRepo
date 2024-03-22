package testpackage;

import java.io.*;
import java.util.StringTokenizer;

public class Test5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[30];
        for(int i=0;i<28;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken())-1;
            arr[a]=1;
        }
        for (int i=0; i<30; i++){
            if(arr[i]!=1){
                bw.write(String.valueOf(i+1)+" ");
            }
        }
        bw.flush();
    }
}
