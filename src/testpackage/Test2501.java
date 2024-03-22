package testpackage;

import java.io.*;
import java.util.StringTokenizer;

public class Test2501 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        T2501();
    }
    public static void T2501() throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken())-1;
        int[] arr = new int[n];
        int m=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                arr[m]=i;
                m++;
            }
        }
        bw.write(String.valueOf(arr[k]));
        bw.flush();
        br.close();
    }
}
