package testpackage;

import java.io.*;
import java.util.StringTokenizer;

public class Test5086 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        T5086();
    }
    public static void T5086() throws IOException{
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            if (n == 0 || m == 0) {
                break;
            }
            if (m % n == 0) {
                bw.write("factor\n");
            }
            if (n % m == 0) {
                bw.write("multiple\n");
            }
        }
        bw.write("neither\n");
        bw.flush();
        br.close();
    }
}
