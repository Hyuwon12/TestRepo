package testpackage;

import java.io.*;
import java.util.StringTokenizer;

public class Test9063 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        T9063();
    }
    public static void T9063() throws IOException{
        int n = Integer.parseInt(br.readLine());
        int maxX=0;
        int maxY=0;
        int minX=100000;
        int minY=100000;
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[i]=x;
            arr2[i]=y;
        }
        for (int i=0;i<n;i++){
            if(arr[i]<=minX){
                minX=arr[i];
            }
            if(arr[i]>=maxX){
                maxX=arr[i];
            }
            if(arr2[i]<=minY){
                minY=arr2[i];
            }
            if (arr2[i]>=maxY){
                maxY=arr2[i];
            }
        }
        bw.write(String.valueOf((maxX-minX)*(maxY-minY)));
        bw.flush();
        br.close();
    }
}
