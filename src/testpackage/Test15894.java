package testpackage;

import java.io.*;

public class Test15894 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        T15894();
    }
    public static void T15894() throws IOException{
        int n = Integer.parseInt(br.readLine());
        int r=0;
        for(int i=1;i<=n;i++){
            r=r-(i-1)+3+i;
        }
        bw.write(String.valueOf(r));
        bw.flush();
        br.close();
    }
}
