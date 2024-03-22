package testpackage;

import java.io.*;
import java.util.StringTokenizer;

public class Test2869 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        T2869();
    }

    public static void T2869() throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        int V2=0;
        for(int i=1;i<=1000000000;i++){
            V2+=A;
            if (V2 >= V) {
                bw.write(String.valueOf(i));
                break;
            }
            V2-=B;
        }
        bw.flush();
        br.close();
    }
}
