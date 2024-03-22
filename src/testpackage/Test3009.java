package testpackage;

import java.io.*;
import java.util.StringTokenizer;

public class Test3009 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        T3009();
    }
    public static void T3009() throws IOException{
        int[] xArr = new int[4];
        int[] yArr = new int[4];
        for(int i=0;i<3;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            xArr[i]=x;
            yArr[i]=y;
            if(i>0){
                if (xArr[i-1] == x) {
                    xArr[i-1] = 0;
                }
                if (yArr[i-1] == y) {
                    yArr[i-1] = 0;
                }
            }
        }
        for(int i=0;i<4;i++){
            if(xArr[i]!=0){
                bw.write(xArr[i]+" ");
            }
            if(yArr[i]!=0){
                bw.write(yArr[i]);
            }
        }
        bw.flush();
        br.close();
    }
}
