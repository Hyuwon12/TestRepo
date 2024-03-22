package testpackage;

import java.io.*;

public class Test2903 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        bw.write(String.valueOf((int)(Math.pow(Math.pow(n,2)+1,2))));
        bw.flush();
        br.close();
    }
}
