package testpackage;

import java.io.*;

public class Test11653 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        T11653();
    }
    public static void T11653() throws IOException{
        int n = Integer.parseInt(br.readLine());
        for(int j=n;j>0;j--){
            for(int i=2;i<=n;i++) {
                if (n % i == 0) {
                    n = n / i;
                    bw.write(String.valueOf(i));
                    bw.newLine();
                    break;
                }
                if(n==1){
                    break;
                }
            }
            bw.flush();
            br.close();
        }
    }

}
