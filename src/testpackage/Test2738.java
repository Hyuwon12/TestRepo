package testpackage;

import java.io.*;
import java.util.StringTokenizer;

public class Test2738 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][n];
        int[][] arr2 = new int[m][m];
        int[][] arr3 = new int[n][m];
        for(int i=0;i<arr.length;i++){
            st= new StringTokenizer(br.readLine());
            for (int j=0;j<arr[i].length;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0;i< arr2.length;i++){
            st= new StringTokenizer(br.readLine());
            for (int j=0;j<arr2[i].length;j++){
                arr2[i][j]=Integer.parseInt(st.nextToken());
                arr3[i][j]=arr[i][j]+arr2[i][j];
            }
        }
        for (int i=0;i<arr3.length;i++){
            for (int j=0;j<arr3[i].length;j++){
                bw.write(String.valueOf(arr3[i][j])+" ");
            }
            bw.newLine();
            bw.flush();
        }
    }
}
