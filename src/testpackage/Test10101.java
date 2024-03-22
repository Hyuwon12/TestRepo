package testpackage;

import java.io.*;

public class Test10101 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        T10101();
    }
    public static void T10101() throws IOException{
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        if(a==60&&a==b&&b==c){
            bw.write("Equilateral");
        }
        if(a+b+c==180) {
            if (a == b || b == c || a == c) {
                bw.write("Isosceles");
            } else {
                bw.write("Scalene");
            }
        }else{
            bw.write("error");
        }
        bw.flush();
        br.close();
    }
}
