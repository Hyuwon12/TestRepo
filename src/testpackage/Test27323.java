package testpackage;

import java.io.*;

public class Test27323 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        T27323();
    }
    public static void T27323() throws IOException{
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(n*m));
        bw.flush();
        br.close();
    }
}
