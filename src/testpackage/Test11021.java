package testpackage;

import java.io.*;
import java.util.StringTokenizer;

public class Test11021 {
    public static void main(String[] args) throws IOException {
        System.out.println("백준 11021");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int i=1; i<=T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            bw.write("Case#"+ i +": "+String.valueOf(A+B));
            bw.newLine();
        }
        bw.flush();
    }
}
