package testpackage;

import java.io.*;

public class Test2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[9];
        int max=0;
        int j =0;
        for (int i=0;i<9;i++){
            arr[i]=Integer.parseInt(br.readLine());
            if(arr[i]>max){
                max=arr[i];
                j=i+1;
            }
        }
        bw.write(String.valueOf(max));
        bw.newLine();
        bw.write(String.valueOf(j));
        bw.flush();
    }
}
