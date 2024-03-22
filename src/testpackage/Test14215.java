package testpackage;

import java.io.*;
import java.util.StringTokenizer;

public class Test14215 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        T14215();
    }
    static public void T14215() throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int max = 0;
        if(a>b&&a>c){
            int bc=b+c;
            while(true){
                if(a<bc){
                   break;
                }
                a--;
            }
            max=a+bc;
        } else if (c>a&&c>b) {
            int ab=a+b;
            while(true){
                if(c<ab){
                    break;
                }
                c--;
            }
            max=c+ab;
        } else if (b>a&&b>c) {
            int ac=a+c;
            while(true){
                if(b<ac){
                    break;
                }
                b--;
            }
            max=b+ac;
        }
        else{
            max=a+b+c;
        }
        bw.write(String.valueOf(max));
        bw.flush();
        br.close();
    }
}
