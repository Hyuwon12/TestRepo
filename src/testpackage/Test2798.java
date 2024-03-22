package testpackage;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test2798 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException{
        T2798();
    }
    static public void T2798() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int max=0;
        int[] numarr = new int[n];
        for(int i=0;i<n;i++){
            numarr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<numarr.length-2;i++){
           for(int j=0;j<numarr.length-1;j++){
               for (int k=0;k<numarr.length;k++){
                   if(numarr[i]+numarr[j]+numarr[k]<=m&&numarr[i]+numarr[j]+numarr[k]>=max&&i!=j&&i!=k&&j!=k){
                       max=numarr[i]+numarr[j]+numarr[k];
                   }
               }
           }
        }
        bw.write(String.valueOf(max));
        bw.flush();
    }
}
