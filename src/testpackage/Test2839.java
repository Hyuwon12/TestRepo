package testpackage;

import java.io.*;

public class Test2839 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException{
        T2839();
    }
    public static void T2839() throws IOException{
        int n = Integer.parseInt(br.readLine());
        int count3 =0;
        int count5 =0;
        while(n>0){
            if(n>=5){
                if(n==6||n==9){
                    count3=n/3;
                    break;
                }
                n-=5;
                count5++;
                continue;
            }
            if(n%3==0){
                count3=n/3;
                break;
            }
            if(n<0||n<5&&n!=3){
                bw.write(String.valueOf(-1));
                bw.flush();
                return;
            }
        }
        bw.write(String.valueOf(count5+count3));
        bw.flush();
    }
}
