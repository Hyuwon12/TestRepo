package testpackage;

import java.io.*;

public class Test2720 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            int C = Integer.parseInt(br.readLine());
            bw.write(C/25+" ");
            C%=25;
            bw.write(C/10+" ");
            C%=10;
            bw.write(C/5+" ");
            C%=5;
            bw.write(String.valueOf(C));
            bw.newLine();
        }
        bw.flush();
        br.close();
    }
}
