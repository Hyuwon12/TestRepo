package testpackage;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Swea20728 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Swea20728();
    }
    public static void Swea20728() throws IOException{
        int t = Integer.parseInt(br.readLine());
        for(int i=1;i<=t;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            for (int j=0;j<n;j++){
                arr[j]=Integer.parseInt(st.nextToken());
            }
            int max=0;
            int max2=0;
            int min=9999;
            for (int c=0;c<n;c++){
                if(n!=k){
                    if(arr[c]>max){
                        max2 = max;
                        max = arr[c];
                    }
                }else {
                    if(arr[c]>max){
                        max = arr[c];
                    }
                    if(arr[c]<min){
                        min = arr[c];
                    }
                }
            }
            if (n!=k){
                bw.write("#"+i+" "+(max-max2));
            }else {
                bw.write("#"+i+" "+(max-min));
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
