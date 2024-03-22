package testpackage;

import java.io.*;
import java.util.StringTokenizer;

public class Test5073 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        T5073();
    }
    public static void T5073() throws IOException {
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a==0&&b==0&&c==0){
                break;
            }
            if (a>=b+c||b>=a+c||c>=a+b) {
            bw.write("Invalid");
            bw.flush();
            bw.newLine();
            continue;
            }
            if (a == c && a == b && b == c) {
                bw.write("Equilateral");
            }
            else if (a == b || b == c || a == c) {
                bw.write("Isosceles");
            }
            else if (a!=b&&b!=c&&a!=c) {
                bw.write("Scalene");
            }
            bw.newLine();
            bw.flush();
        }
        br.close();
    }
}
