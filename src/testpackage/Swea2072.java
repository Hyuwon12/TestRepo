package testpackage;

import java.io.*;
import java.util.StringTokenizer;

public class Swea2072 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException{
        Swea2072();
    }
    public static void Swea2072() throws IOException{
        int n = Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i++){
            int sum=0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.countTokens()!=0){
                int a = Integer.parseInt(st.nextToken());
                if(a%2!=0){
                  sum+=a;
                }
            }
            bw.write("#"+i+" "+sum);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}

