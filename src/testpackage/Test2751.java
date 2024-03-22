package testpackage;

import java.io.*;
import java.util.Arrays;

public class Test2751 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        T2751();
    }
    public static void T2751() throws IOException{
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            bw.write(String.valueOf(arr[i]));
            bw.newLine();
            bw.flush();
        }
    }
}
