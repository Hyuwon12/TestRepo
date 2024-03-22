package testpackage;

import java.io.*;
import java.util.StringTokenizer;

public class Test2563 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //static 프로그램이 실행 될 때 가장 처음 메모리에 올림
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        boolean[][] arr = new boolean[101][101];
        int total=0;
        for (int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for(int j=x;j<x+10;j++){
                for(int k=y;k<y+10;k++){
                    if(!arr[j][k]){
                        arr[j][k]=true;
                        total++;
                    }
                }
            }

        }
        bw.write(String.valueOf(total));
        bw.flush();
        br.close();
    }
}
