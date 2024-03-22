package testpackage;

import java.io.*;

public class Test2292 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = 1;
        int m = Integer.parseInt(br.readLine());
        for(int i=1;i<=1000000;i++){
            if (m<n){
                bw.write(String.valueOf(i));
                break;
            }
            n+=i*6;
        }
        bw.flush();
        br.close();
    }
}
