package testpackage;

import java.io.*;
import java.util.StringTokenizer;

public class Test2745 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = (st.nextToken());
        int sum=0;
        int tmp=1;
        int b = Integer.parseInt(st.nextToken());
        for(int i=n.length()-1;i>=0;i--){
            if(n.charAt(i)>10) {
                sum += (n.charAt(i) - 55) * tmp;
            }
            if(n.charAt(i)<10){
                sum+=n.charAt(i)*tmp;
            }
            tmp*=b;
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        br.close();
    }
}
