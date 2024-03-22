package testpackage;

import java.io.*;
import java.util.StringTokenizer;

public class Test2566 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int[][] arr= new int[9][9];
        int max =0;
        int a=0;
        int b=0;
        for(int i=0;i<arr.length;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0;j<arr[i].length;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
                if(arr[i][j]>max){
                    max=arr[i][j];
                    a=i+1;
                    b=j+1;
                }
            }
        }
        bw.write(String.valueOf(max));
        bw.newLine();
        bw.write(String.valueOf(a+" "+b));
        bw.flush();
        br.close();
    }
}
