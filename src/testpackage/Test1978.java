package testpackage;

import java.io.*;
import java.util.StringTokenizer;

public class Test1978 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        T1978();
    }
    public static void T1978() throws IOException{
        int n = Integer.parseInt(br.readLine());
        int a=0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            int m = Integer.parseInt(st.nextToken());
            int count=0;
            for(int j=1;j<=m;j++){
                if(m%j==0)
                    count++;
            }
            if(count==2){
                a++;
            }
        }
        bw.write(String.valueOf(a));
        bw.flush();
        br.close();
    }
}
