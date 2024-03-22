package testpackage;

import java.io.*;
import java.util.Arrays;

public class Test9506 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        T9506();
    }
    public static void T9506() throws IOException{
        while(true) {
            int n = Integer.parseInt(br.readLine());
            if (n < 0) {
                break;
            }
            int m = 0;
            int sum = 0;
            int[] arr = new int[n];
            bw.write(n+" ");
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    arr[m] = i;
                    m++;
                    sum += i;
                }
            }
            if (sum == n) {
                bw.write("= ");
                for(int i=0;i<arr.length;i++){
                    if(arr[i]==0){
                        continue;
                    }
                    bw.write(arr[i]+" ");
                    if(arr[i+1]!=0){
                        bw.write("+ ");
                    }
                }
            }
            else{
                bw.write("is NOT perfect.");
            }
            bw.newLine();
            bw.flush();
        }
        br.close();
    }

}
