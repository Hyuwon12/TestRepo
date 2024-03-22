package testpackage;

import java.io.*;

public class Test2581 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        T2581();
    }
    public static void T2581 () throws IOException{
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int sum=0;
        int min=m;
        for(int i=n;i<=m;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                sum+=i;
                if(min>i){
                    min=i;
                }
            }
        }
        if(sum==0){
            bw.write("-1");
            bw.flush();
            return;
        }
        bw.write(String.valueOf(sum));
        bw.newLine();
        bw.write(String.valueOf(min));
        bw.flush();
        br.close();
    }
}
