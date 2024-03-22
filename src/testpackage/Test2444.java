package testpackage;

import java.io.*;

public class Test2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i++){
            for (int j=n;j>i;j--){
                System.out.print(" ");
            }
            for (int j=0;j<2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            for (int j=i+1;j<2*n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
