package testpackage;

import java.io.*;
import java.util.StringTokenizer;

public class Test19532 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException{
        T19532();
    }
    public static void T19532() throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        for(int i=-999;i<999;i++){
            for(int j=-999;j<999;j++){
                if(a*i+b*j==c&&d*i+e*j==f){
                    bw.write(i+" "+j);
                    bw.flush();
                    return;
                }
            }
        }
    }
}
