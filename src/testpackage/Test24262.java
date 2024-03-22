package testpackage;

import java.io.*;

public class Test24262 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        T24262();
    }

    static public void T24262() throws IOException {
        int n = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(1));
        bw.newLine();
        bw.write(String.valueOf(0));
        bw.flush();
        br.close();
    }

}
