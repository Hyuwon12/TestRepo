package testpackage;

import java.io.*;
import java.util.StringTokenizer;

public class Test1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        double max=0;
        double sum=0;
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i]= Integer.parseInt(st.nextToken());
            if(max < arr[i]){
                max=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            sum+=(arr[i]*100)/max;

        }
        bw.write(String.valueOf(sum/n));
        bw.flush();
    }
}